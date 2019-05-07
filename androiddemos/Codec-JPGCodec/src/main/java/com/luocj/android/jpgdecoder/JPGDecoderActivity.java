package com.luocj.android.jpgdecoder;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

public class JPGDecoderActivity extends AppCompatActivity {

    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jpgdecoder);

        mImageView = (ImageView) findViewById(R.id.imageviwe);
    }

    @Override
    protected void onResume() {
        super.onResume();

        BitmapFactory.Options ops = new BitmapFactory.Options();

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.jpg_04, ops);
        Log.e("gfx", "jpg color space is " + bitmap.getColorSpace());

        mImageView.setImageBitmap(bitmap);

        bitmap.recycle();
    }
}
