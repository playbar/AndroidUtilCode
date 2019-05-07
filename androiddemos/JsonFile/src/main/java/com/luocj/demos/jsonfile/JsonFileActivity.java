package com.luocj.demos.jsonfile;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import org.json.JSONArray;

public class JsonFileActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json_file);

        JSONArray volumes = new JSONArray();
        try {
            volumes.put(1, 12);
            volumes.put(2, "test");
            volumes.put(3, true);
            volumes.put(4, 3.14);
        } catch (Exception e) {

        }

        Log.e("xm-av", "Test " + volumes);
    }
}
