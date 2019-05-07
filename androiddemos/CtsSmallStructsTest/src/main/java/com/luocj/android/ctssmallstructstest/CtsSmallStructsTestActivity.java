package com.luocj.android.ctssmallstructstest;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.renderscript.Allocation;
import android.renderscript.Float4;
import android.renderscript.RenderScript;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.lang.reflect.Method;

public class CtsSmallStructsTestActivity extends AppCompatActivity {

    static final int sAllocationElements = 1024;
    static final int sLargestCharArrayStructSize = 64;

    static final String sTwoElementStructTypes[] =
            {"i8", "i16", "i32", "i64", "f32", "f64", "v128"};

    static final byte sInitialValue_int8_t = (byte) 0x7;
    static final short sInitialValue_int16_t = (short) 0x1234;
    static final int sInitialValue_int32_t = 0x12345678;
    static final long sInitialValue_int64_t = 0x12345678abcdef1L;
    static final float sInitialValue_float = 10473.f;
    static final double sInitialValue_double = 35353143.25;
    static final Float4 sInitialValue_float4 = new Float4(10473.f, 353541.5f, -5433.75f, 78394.f);

    private RenderScript mRS;

    ScriptC_small_structs mScript;

    Context mCtx;
    Resources mRes;

    private int result;
    // msgHandled is used to synchronize between waitForMessage() and the
    // RSMessageHandler thread.
    private volatile boolean msgHandled;

    protected static final int RS_MSG_TEST_PASSED = 100;
    protected static final int RS_MSG_TEST_FAILED = 101;
    protected static final int RS_MSG_TEST_FLUSH = 102;

    RenderScript.RSMessageHandler mRsMessage = new RenderScript.RSMessageHandler() {
        public void run() {
            if (result == 0) {
                switch (mID) {
                    case RS_MSG_TEST_PASSED:
                    case RS_MSG_TEST_FAILED:
                        result = mID;
                        break;
                    case RS_MSG_TEST_FLUSH:
                        break;
                    default:
                        Log.e("", "Got unexpected RS message");
                        return;
                }
            }
            msgHandled = true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cts_small_structs_test);

        mRS = RenderScript.create(this);
        mRS.setMessageHandler(mRsMessage);

        mScript = new ScriptC_small_structs(mRS);

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("ts-graphics", "RenderScript");

        try {
            testSmallStructsOfCharArray();
        } catch (Exception e) {

        }
    }

    /**
     * Structs in this test are of the form
     * struct char_array_N { char bytes[N]; };
     */
    public void testSmallStructsOfCharArray() throws Exception {
        for (int size = 1; size <= sLargestCharArrayStructSize; ++size) {
            Log.e("ts-graphics", "testSmallStructsOfCharArray size=" + size);
            // Make the input allocation.
            Class<?> scriptFieldClass = Class.forName(
                    "android.renderscript.cts.ScriptField_char_array_" + size);

            Log.e("ts-graphics", "testSmallStructsOfCharArray scriptFieldClass=" + scriptFieldClass.toString());

            Object field = scriptFieldClass.getConstructor(RenderScript.class, int.class)
                    .newInstance(mRS, sAllocationElements);
            Allocation alloc = (Allocation) scriptFieldClass.getMethod("getAllocation")
                    .invoke(field);

            Log.e("ts-graphics", "testSmallStructsOfCharArray field=" + field.toString() + " alloc " + alloc);

            // void set_bytes(int index, byte[] bytes, boolean copyNow)
            Method set_bytes = scriptFieldClass.getMethod("set_bytes",
                    int.class, byte[].class, boolean.class);

            Log.e("ts-graphics", "testSmallStructsOfCharArray set_bytes=" + set_bytes.toString());

            byte[] bytes = new byte[size];
            for (int i = 0; i < size; ++i) {
                bytes[i] = (byte) (1 + i);
                Log.e("ts-graphics", "testSmallStructsOfCharArray i bytes[" + i + "]=" + bytes[i]);
            }

            for (int elem = 0; elem < sAllocationElements; ++elem) {
                set_bytes.invoke(field, elem, bytes, true);
                // Log.e("ts-graphics", "testSmallStructsOfCharArray elem field[" + elem + "]=" + field);
            }

            // Get methods used in testing.
            Method modify = ScriptC_small_structs.class.getMethod(
                    "forEach_modify_char_array_" + size,
                    Allocation.class, Allocation.class);

            Log.e("ts-graphics", "testSmallStructsOfCharArray modify=" + modify.toString());

            Method verify = ScriptC_small_structs.class.getMethod(
                    "invoke_verify_char_array_" + size,
                    Allocation.class);

            Log.e("ts-graphics", "testSmallStructsOfCharArray verify=" + verify.toString());

            // Run the test.
            modify.invoke(mScript, alloc, alloc);
            verify.invoke(mScript, alloc);
        }
    }

    void checkForErrorsInScript() {
        mRS.finish();
        mScript.invoke_checkError();
        checkForErrors();
    }

    protected void checkForErrors() {
    }

    static public void assertTrue(boolean condition) {
        if (!condition) throw new RuntimeException("AssertionFailedError: condition was false");
    }

    static public void assertFalse(boolean condition) {
        if (condition) throw new RuntimeException("AssertionFailedError: condition was true");
    }
}
