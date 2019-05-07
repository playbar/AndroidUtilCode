package com.luocj.android.renderscriptdemo;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.renderscript.Float2;
import android.renderscript.Int2;
import android.renderscript.RSRuntimeException;
import android.renderscript.RenderScript;
import android.renderscript.Short2;
import android.support.annotation.Nullable;
import android.util.Log;

import junit.framework.ComparisonFailure;

import java.util.Arrays;

/**
 * Created by luocj on 3/22/17.
 */

public class RSBase extends Activity {

    public static String TAG = "RSCTS";

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
                        Log.e(TAG, "Got unexpected RS message");
                        return;
                }
            }
            msgHandled = true;
        }
    };

    protected void waitForMessage() {
        while (!msgHandled) {
            Thread.yield();
        }
    }

    protected boolean FoundError = false;
    protected RenderScript.RSErrorHandler mRsError = new RenderScript.RSErrorHandler() {
        public void run() {
            FoundError = true;
            Log.e("RenderscriptCTS", mErrorMessage);
            throw new RSRuntimeException("Received error " + mErrorNum +
                    " message " + mErrorMessage);
        }
    };

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        result = 0;
        msgHandled = false;
        mCtx = getApplication();
        mRes = mCtx.getResources();
    }

    /**
     * Verify that we didn't fail on the control or script side of things.
     */
    protected void checkForErrors() {
        assertFalse(FoundError);
        assertTrue(result != RS_MSG_TEST_FAILED);
    }

    static public void assertTrue(boolean condition) {
        if (!condition) throw new RuntimeException("AssertionFailedError: condition was false");
    }

    static public void assertFalse(boolean condition) {
        if (condition) throw new RuntimeException("AssertionFailedError: condition was true");
    }

    public void assertEquals(final float[] javaRslt, final float[] rsRslt) {
        assertEquals("length", javaRslt.length, rsRslt.length);
        for (int i = 0; i < javaRslt.length; ++i)
            assertEquals(String.valueOf(i), javaRslt[i], rsRslt[i]);
    }

    public void assertEquals(final short[] javaRslt, final short[] rsRslt) {
        assertEquals("length", javaRslt.length, rsRslt.length);
        for (int i = 0; i < javaRslt.length; ++i)
            assertEquals(String.valueOf(i), javaRslt[i], rsRslt[i]);
    }

    public void assertEquals(final Short2[] javaRslt, final Short2[] rsRslt) {
        assertEquals("length", javaRslt.length, rsRslt.length);
        for (int i = 0; i < javaRslt.length; ++i)
            assertEquals(String.valueOf(i), javaRslt[i], rsRslt[i]);
    }

    public void assertEquals(final String msg, final Float2 javaRslt, final Float2 rsRslt) {
        assertEquals(msg + "(x)", javaRslt.x, rsRslt.x);
        assertEquals(msg + "(y)", javaRslt.y, rsRslt.y);
    }

    public void assertEquals(final Float2 javaRslt, final Float2 rsRslt) {
        assertEquals("", javaRslt, rsRslt);
    }

    public void assertEquals(final String msg, final Int2 javaRslt, final Int2 rsRslt) {
        assertEquals(msg + "(x)", javaRslt.x, rsRslt.x);
        assertEquals(msg + "(y)", javaRslt.y, rsRslt.y);
    }

    public void assertEquals(final Int2 javaRslt, final Int2 rsRslt) {
        assertEquals("", javaRslt, rsRslt);
    }

    public void assertEquals(final String msg, final Short2 javaRslt, final Short2 rsRslt) {
        assertEquals(msg + "(x)", javaRslt.x, rsRslt.x);
        assertEquals(msg + "(y)", javaRslt.y, rsRslt.y);
    }

    public void assertEquals(final Short2 javaRslt, final Short2 rsRslt) {
        assertEquals("", javaRslt, rsRslt);
    }

    public void assertEquals(String message, byte[] expected, byte[] actual) {
        if (expected == null && actual == null)
            return;
        if (expected != null && Arrays.equals(actual, expected))
            return;
        throw new ComparisonFailure(message, expected.toString(), actual.toString());
    }

    static public void assertEquals(String message, int expected, int actual) {
        if (expected != actual) throw new RuntimeException("AssertionFailedError: not equals: " + message + " Expected " + expected + " actual " + actual);
    }

    static public void assertEquals(String message, float expected, float actual) {
        if (expected != actual) throw new RuntimeException("AssertionFailedError: not equals: " + message + " Expected " + expected + " actual " + actual);
    }

    public void fail(String msg) {
        Log.e(TAG, "ts-graphics " + msg);

    };
}
