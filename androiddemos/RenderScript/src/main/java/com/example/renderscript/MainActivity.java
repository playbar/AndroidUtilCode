package com.example.renderscript;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.Matrix3f;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicColorMatrix;
import android.renderscript.Type;
import android.util.Log;
import android.widget.ImageView;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends Activity {
    private static final short PIXEL_CHANNEL_THRESHOLD = 4;

    private Bitmap mBitmapIn;
    private Bitmap mBitmapOut;

    private RenderScript mRS;
    private Allocation mInAllocation;
    private Allocation mOutAllocation;
    private ScriptC_mono mScript;

    private ScriptC_PixelCounter mScriptPixelCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBitmapIn = loadBitmap(R.drawable.data);
        mBitmapOut = Bitmap.createBitmap(mBitmapIn.getWidth(), mBitmapIn.getHeight(),
                mBitmapIn.getConfig());


    }

    @Override
    protected void onResume() {
        super.onResume();

        ImageView in = (ImageView) findViewById(R.id.displayin);

        ImageView out = (ImageView) findViewById(R.id.displayout);

        createScript();

        in.setImageBitmap(mBitmapIn);
        out.setImageBitmap(mBitmapOut);

        ImageView brit = (ImageView) findViewById(R.id.displaybrit);
        brit.setImageBitmap(adjustBrightness(this, mBitmapIn));

        testRSColorMatrix4(this, mBitmapIn);
    }

    private void createScript() {
        mRS = RenderScript.create(this);

        mInAllocation = Allocation.createFromBitmap(mRS, mBitmapIn,
                Allocation.MipmapControl.MIPMAP_NONE,
                Allocation.USAGE_SCRIPT);
        mOutAllocation = Allocation.createFromBitmap(mRS, mBitmapOut,
                Allocation.MipmapControl.MIPMAP_NONE,
                Allocation.USAGE_SCRIPT);

        mScript = new ScriptC_mono(mRS);

        mScript.forEach_root(mInAllocation, mOutAllocation);
        mOutAllocation.copyTo(mBitmapOut);

        mScriptPixelCounter = new ScriptC_PixelCounter(mRS);
        mScriptPixelCounter.set_THRESHOLD(PIXEL_CHANNEL_THRESHOLD);

        int blackishPixelCount = mScriptPixelCounter.reduce_countBlackishPixels(mOutAllocation).get();

        Log.e("ts-gfx", "blackishPixelCount " + blackishPixelCount);
    }

    private Bitmap loadBitmap(int resource) {
        final BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = false;
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        return BitmapFactory.decodeResource(getResources(), resource, options);
    }

    private static final Matrix3f BRIGHTNESS_ADJUSTMENT_FACTOR_MATRIX = new Matrix3f(new float[]{
            0.9f, 0.5f, 0.0f,
            0.0f, 0.9f, 0.0f,
            0.0f, 0.5f, 0.9f,
    });


    public static Bitmap adjustBrightness(Context context, Bitmap image) {

        Bitmap inputBitmap = Bitmap.createBitmap(image);
        Bitmap outputBitmap = Bitmap.createBitmap(image.getWidth(), image.getHeight(),
                image.getConfig());

        RenderScript rsColorMatrix = RenderScript.create(context);
        ScriptIntrinsicColorMatrix scriptIntrinsicColorMatrix =
                ScriptIntrinsicColorMatrix.create(rsColorMatrix);
        Allocation colorMatrixIn = Allocation.createFromBitmap(rsColorMatrix, inputBitmap);
        Allocation colorMatrixOut = Allocation.createFromBitmap(rsColorMatrix, outputBitmap);

        scriptIntrinsicColorMatrix.setColorMatrix(BRIGHTNESS_ADJUSTMENT_FACTOR_MATRIX);
        scriptIntrinsicColorMatrix.forEach(colorMatrixIn, colorMatrixOut);

        colorMatrixOut.copyTo(outputBitmap);
        rsColorMatrix.destroy();

        return outputBitmap;
    }


    public void testRSColorMatrix4(Context context, Bitmap bitmap) {
        Bitmap inputBitmap = Bitmap.createBitmap(bitmap);

        final int X = bitmap.getWidth();
        final int Y = bitmap.getHeight();


        byte[] byteAlloc = new byte[X * Y * 4];

        RenderScript rsColorMatrix = RenderScript.create(context);
        ScriptIntrinsicColorMatrix scriptIntrinsicColorMatrix =
                ScriptIntrinsicColorMatrix.create(rsColorMatrix);

        Type.Builder build = new Type.Builder(rsColorMatrix, Element.RGBA_8888(rsColorMatrix));
        build.setX(X);
        build.setY(Y);
        Allocation colorMatrixOut = Allocation.createTyped(rsColorMatrix, build.create());

        Allocation colorMatrixIn = Allocation.createFromBitmap(rsColorMatrix, inputBitmap);
        scriptIntrinsicColorMatrix.setRGBtoYUV();
        scriptIntrinsicColorMatrix.forEach(colorMatrixIn, colorMatrixOut);

        colorMatrixOut.copyTo(byteAlloc);

        saveYUV(byteAlloc, X, Y);
    }

    public void saveYUV(byte[] byteAlloc, int x, int y) {
        String fileName = getCacheDir().toString() + "/rgb2yuv_" + x + "x" + y + "_01.yuv";
        Log.e("ts-gfx", "fileName " + fileName);
        File f = new File(fileName);
        FileOutputStream fos = null;
        try {
            f.createNewFile();
            fos = new FileOutputStream(f);
            fos.write(byteAlloc);
            fos.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}