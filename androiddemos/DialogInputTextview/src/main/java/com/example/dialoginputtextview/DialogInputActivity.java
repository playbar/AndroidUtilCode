package com.example.dialoginputtextview;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by luocj on 10/27/17.
 */

public class DialogInputActivity extends Activity {
    private static String TAG = "DialogInputActivity";

    private static final String TAG_SAVE_RECORDINGD = "SaveRecording";

    private FragmentManager mFragmentManager;

    private Context mContext;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mContext = this;

        setContentView(R.layout.dialog_input_activity);

        Button saveFile = findViewById(R.id.btn_stop_record);
        saveFile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSaveDialog();
            }
        });

        mFragmentManager = getFragmentManager();
    }

    /**
     * Show save record dialog
     */
    public void showSaveDialog() {
        /*
         *  bug568587, new feature FM new UI @{ if (mIsSaveDialogShown) { return; }
         * @}
         */
        String sdcard = "sdcard";
        String recordingName = "444545_121212";
        String saveName = null;
        saveName = FmRecorder.RECORDING_FILE_PREFIX + "_" + recordingName;
        FmSaveDialog newFragment = new FmSaveDialog(sdcard, recordingName, saveName);
        newFragment.show(mFragmentManager, TAG_SAVE_RECORDINGD);
        /**
         *  bug509670, recording time is too short, causing music player anr.
         *
         * @{
         */
        long recordingTime = 0;
        Log.d(TAG, "showSaveDialog: recordingTime=" + recordingTime);
        newFragment.setCancelable(false);
        Bundle args = new Bundle();
        args.putLong(FmRecorder.FM_RECORDING_TIME_KEY, recordingTime);
        newFragment.setArguments(args);
        /**
         * @}
         */
        mFragmentManager.executePendingTransactions();
    }
}
