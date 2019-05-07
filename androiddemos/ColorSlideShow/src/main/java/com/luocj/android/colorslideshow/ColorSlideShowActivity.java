package com.luocj.android.colorslideshow;

import android.app.Presentation;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import static android.Manifest.permission.READ_EXTERNAL_STORAGE;
import static android.Manifest.permission.WRITE_EXTERNAL_STORAGE;

public class ColorSlideShowActivity extends AppCompatActivity {

    private static final String TAG = "ColorSlideShowActivity";
    private static final boolean VERBOSE = true;           // lots of logging
    private static final boolean DEBUG_SAVE_FILE = true;   // save copy of encoded movie

    private static final int UI_TIMEOUT_MS = 2000;
    private static final int UI_RENDER_PAUSE_MS = 400;

    protected Context mContext;

    private ImageView imageView;

    // Colors to test (RGB).  These must convert cleanly to and from BT.601 YUV.
    private static final int TEST_COLORS[] = {
            makeColor(10, 100, 200),        // YCbCr 89,186,82
            makeColor(100, 200, 10),        // YCbCr 144,60,98
            makeColor(200, 10, 100),        // YCbCr 203,10,103
            makeColor(10, 200, 100),        // YCbCr 130,113,52
            makeColor(100, 10, 200),        // YCbCr 67,199,154
            makeColor(200, 100, 10),        // YCbCr 119,74,179
    };

    /* TEST_COLORS static initialization; need ARGB for ColorDrawable */
    private static int makeColor(int red, int green, int blue) {
        return 0xff << 24 | (red & 0xff) << 16 | (green & 0xff) << 8 | (blue & 0xff);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

                /*set it to be no title*/
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        /*set it to be full screen*/
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);

        mContext = this;

        requestPermissions(new String[]{READ_EXTERNAL_STORAGE, WRITE_EXTERNAL_STORAGE}, 1);
    }

    @Override
    protected void onResume() {
        super.onResume();

        DisplayManager displayManager = (DisplayManager) getSystemService(Context.DISPLAY_SERVICE);

        new ColorSlideShow(displayManager.getDisplay(0)).start();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode) {
            case 1:
                testCaptureView();
                break;

            default:
                break;
        }
    }

    public Context getContext() {
        return mContext;
    }

    /**
     * Creates a series of colorful Presentations on the specified Display.
     */
    private class ColorSlideShow extends Thread {
        private Display mDisplay;

        public ColorSlideShow(Display display) {
            mDisplay = display;
        }

        @Override
        public void run() {
            for (int i = 0; i < TEST_COLORS.length; i++) {
                showPresentation(TEST_COLORS[i]);
            }

            if (VERBOSE) Log.d(TAG, "slide show finished");
        }

        private void showPresentation(final int color) {
            final TestPresentation[] presentation = new TestPresentation[1];
            try {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        // Want to create presentation on UI thread so it finds the right Looper
                        // when setting up the Dialog.
                        presentation[0] = new TestPresentation(getContext(), mDisplay, color);
                        if (VERBOSE) Log.d(TAG, "showing color=0x" + Integer.toHexString(color));
                        presentation[0].show();
                    }
                });

                // Give the presentation an opportunity to render.  We don't have a way to
                // monitor the output, so we just sleep for a bit.
                try {
                    Thread.sleep(UI_RENDER_PAUSE_MS);
                } catch (InterruptedException ignore) {
                }
            } finally {
                if (presentation[0] != null) {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            presentation[0].dismiss();
                        }
                    });
                }
            }
        }
    }

    /**
     * Presentation we can show on a virtual display.  The view is set to a single color value.
     */
    private class TestPresentation extends Presentation {
        private final int mColor;

        public TestPresentation(Context context, Display display, int color) {
            super(context, display);
            mColor = color;
        }

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            setTitle("Encode Virtual Test");
            //getWindow().setType(WindowManager.LayoutParams.TYPE_PRIVATE_PRESENTATION);

            // Create a solid color image to use as the content of the presentation.
            ImageView view = new ImageView(getContext());
            view.setImageDrawable(new ColorDrawable(mColor));
            view.setLayoutParams(new LayoutParams(
                    LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
            setContentView(view);
        }
    }

    private void testCaptureView() {
        setContentView(R.layout.activity_color_slide_show);
        imageView = (ImageView) findViewById(R.id.imageview);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveViewToPic(imageView);
            }
        });

    }

    public Bitmap createViewBitmap(View v) {
        Bitmap bitmap = Bitmap.createBitmap(v.getWidth(), v.getHeight(),
                Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        v.draw(canvas);
        return bitmap;
    }

    private void saveViewToPic(View view) {
        String path = "/sdcard/test/";
        File dirFile = new File(path);
        if (!dirFile.exists()) {
            dirFile.mkdir();
        }
        File file = new File(path + "/view_" + SystemClock.elapsedRealtime() + ".png");

        Log.e(TAG, "file " + file.getPath());
        try {
            Bitmap bitmap = createViewBitmap(view);
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, bos);
            bos.flush();
            bos.close();

            Toast.makeText(this, "图片保存在" + file.getAbsolutePath(), Toast.LENGTH_LONG).show();

            bitmap.recycle();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
