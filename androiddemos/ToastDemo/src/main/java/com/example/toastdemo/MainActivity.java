package com.example.toastdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onResume() {
        super.onResume();
        int suggestedStream=-2147483648;
        // 第一个参数：当前的上下文环境。可用getApplicationContext()或this
        // 第二个参数：要显示的字符串。也可是R.string中字符串ID
        // 第三个参数：显示的时间长短。Toast默认的有两个LENGTH_LONG(长)和LENGTH_SHORT(短)，也可以使用毫秒如2000ms
        Toast toast = Toast.makeText(getApplicationContext(), "默认的Toast:" + suggestedStream, Toast.LENGTH_SHORT);
        //显示toast信息
        toast.show();
    }
}
