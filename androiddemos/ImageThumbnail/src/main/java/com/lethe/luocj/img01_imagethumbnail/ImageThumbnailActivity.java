package com.lethe.luocj.img01_imagethumbnail;

import android.app.Activity;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.io.File;

public class ImageThumbnailActivity extends Activity {

    private ImageView mImageView;

    private ImageView mImageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_thumbnail);

        mImageView = findViewById(R.id.file_image);

        mImageView2 = findViewById(R.id.file_image2);

        //Picasso.with(this).load("http://img.my.csdn.net/uploads/201605/08/1462674108_9582.jpg").into(mImageView);
        PermisionUtils.verifyStoragePermissions(this);
        Picasso.with(this).load(new File("/sdcard/images/yuantu.jpg")).into(mImageView);
        mImageView2.setImageBitmap(BitmapFactory.decodeFile("/sdcard/images/yuantu.jpg"));
    }

    @Override
    protected void onResume() {
        super.onResume();
        Picasso.with(this).load(new File("/sdcard/images/yuantu.jpg")).into(mImageView);

        mImageView2.setImageBitmap(BitmapFactory.decodeFile("/sdcard/images/yuantu.jpg"));
    }
}
