package com.luocj.android.renderscriptdemo;

import android.os.PersistableBundle;
import android.renderscript.Allocation;
import android.renderscript.Float4;
import android.renderscript.RenderScript;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import java.lang.reflect.Method;

public class RenderScriptDemoActivity extends RSBaseCompute {
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

    ScriptC_small_structs mScript;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_render_script_demo);
        mScript = new ScriptC_small_structs(mRS);
    }

    @Override
    protected void onResume() {
        super.onResume();
        try {
            testSmallStructsOfCharArray();
        } catch (Exception e) {
            fail(e.toString());
        }
    }

    void checkForErrorsInScript() {
        mRS.finish();
        mScript.invoke_checkError();
        waitForMessage();
        checkForErrors();
    }

    /**
     * Returns the class associated with the given type. For primitive types, the unwrapped class is
     * returned.
     */
    Class<?> getUnwrappedClassForType(String type) {
        if (type.equals("i8")) {
            return byte.class;
        } else if (type.equals("i16")) {
            return short.class;
        } else if (type.equals("i32")) {
            return int.class;
        } else if (type.equals("i64")) {
            return long.class;
        } else if (type.equals("f32")) {
            return float.class;
        } else if (type.equals("f64")) {
            return double.class;
        } else if (type.equals("v128")) {
            return Float4.class;
        } else {
            fail("Unknown type tag: " + type);
            return null;
        }
    }

    /**
     * Returns a ScriptC_small_structs setter associated with the global of the given type.
     */
    Method getInitialValueSetter(String type) throws Exception {
        String name = "set_initial_value_";
        if (type.equals("i8")) {
            name += "int8_t";
        } else if (type.equals("i16")) {
            name += "int16_t";
        } else if (type.equals("i32")) {
            name += "int32_t";
        } else if (type.equals("i64")) {
            name += "int64_t";
        } else if (type.equals("f32")) {
            name += "float";
        } else if (type.equals("f64")) {
            name += "double";
        } else if (type.equals("v128")) {
            name += "float4";
        } else {
            fail("unknown type tag: " + type);
        }

        return ScriptC_small_structs.class.getMethod(name, getUnwrappedClassForType(type));
    }

    /**
     * Returns the (possibly wrapped) initial value associated with the global of the given type.
     */
    Object getInitialValue(String type) {
        if (type.equals("i8")) {
            return (Object) sInitialValue_int8_t;
        } else if (type.equals("i16")) {
            return (Object) sInitialValue_int16_t;
        } else if (type.equals("i32")) {
            return (Object) sInitialValue_int32_t;
        } else if (type.equals("i64")) {
            return (Object) sInitialValue_int64_t;
        } else if (type.equals("f32")) {
            return (Object) sInitialValue_float;
        } else if (type.equals("f64")) {
            return (Object) sInitialValue_double;
        } else if (type.equals("v128")) {
            return (Object) sInitialValue_float4;
        } else {
            fail("unknown type tag: " + type);
            return null;
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
                    "com.luocj.android.renderscriptdemo.ScriptField_char_array_" + size);

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

        checkForErrorsInScript();

        // Check that all tests were run.
        mScript.invoke_checkNumberOfCharArrayTestsRun();
        waitForMessage();
        checkForErrors();
    }

    /**
     * Structs in this test are of the form
     * struct two_element_struct_X { TYPE1 a; TYPE2 b };
     */
    public void testSmallStructsOfHeterogeneousTypes() throws Exception {
        // Initialize script globals.
        for (String type : sTwoElementStructTypes) {
            getInitialValueSetter(type).invoke(mScript, getInitialValue(type));
        }

        for (String type1 : sTwoElementStructTypes) {
            for (String type2 : sTwoElementStructTypes) {
                // Build the input allocation.
                String tag = type1 + "_" + type2;
                Log.e("ts-graphics", "testSmallStructsOfHeterogeneousTypes tag=" + tag);
                Class<?> scriptFieldClass = Class.forName(
                        "com.luocj.android.renderscriptdemo.ScriptField_two_element_struct_" + tag);

                Object field = scriptFieldClass.getConstructor(RenderScript.class, int.class)
                        .newInstance(mRS, sAllocationElements);
                Allocation alloc = (Allocation) scriptFieldClass.getMethod("getAllocation")
                        .invoke(field);

                // Set the structure fields of the input.
                for (int elem = 0; elem < sAllocationElements; ++elem) {
                    Object initialValueA = getInitialValue(type1);
                    // void set_a(int index, Ty val, boolean copyNow)
                    Method fieldASetter = scriptFieldClass.getMethod("set_a",
                            int.class, getUnwrappedClassForType(type1), boolean.class);
                    fieldASetter.invoke(field, elem, initialValueA, true);

                    Object initialValueB = getInitialValue(type2);
                    // void set_b(int index, Ty val, boolean copyNow)
                    Method fieldBSetter = scriptFieldClass.getMethod("set_b",
                            int.class, getUnwrappedClassForType(type2), boolean.class);
                    fieldBSetter.invoke(field, elem, initialValueB, true);
                }

                // Get methods used in testing.
                Method modify = ScriptC_small_structs.class.getMethod(
                        "forEach_modify_two_element_struct_" + tag,
                        Allocation.class, Allocation.class);

                Method verify = ScriptC_small_structs.class.getMethod(
                        "invoke_verify_two_element_struct_" + tag,
                        Allocation.class);

                // Run the test.
                modify.invoke(mScript, alloc, alloc);
                verify.invoke(mScript, alloc);
            }
        }

        checkForErrorsInScript();

        // Check that all tests were run.
        mScript.invoke_checkNumberOfTwoElementStructTestsRun();
        waitForMessage();
        checkForErrors();
    }
}
