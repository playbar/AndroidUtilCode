package com.example.dialoginputtextview;

/**
 * Created by luocj on 10/27/17.
 */

public class FmRecorder {
    // file prefix
    public static final String RECORDING_FILE_PREFIX = "FM";
    // file extension
    public static final String RECORDING_FILE_EXTENSION_3GPP = ".3gpp";
    /**
     * SPRD: bug474741, recording format selection.
     * add for mp3 support
     * @{
     */
    public static final String RECORDING_FILE_EXTENSION_AMR = ".amr";
    public static final String RECORDING_FILE_EXTENSION_MP3 = ".mp3";
    /**
     * @}
     */

    // recording file folder
    public static final String FM_RECORD_FOLDER = "FM Recording";
    private static final String RECORDING_FILE_TYPE = "audio/3gpp";
    public static final String RECORDING_FILE_SOURCE = "FM Recordings";
    // error type no sdcard
    public static final int ERROR_SDCARD_NOT_PRESENT = 0;
    // error type sdcard not have enough space
    public static final int ERROR_SDCARD_INSUFFICIENT_SPACE = 1;
    // error type can't write sdcard
    public static final int ERROR_SDCARD_WRITE_FAILED = 2;
    // error type recorder internal error occur
    public static final int ERROR_RECORDER_INTERNAL = 3;

    public static final int ERROR_RECORD_FAILED = 4;

    // FM Recorder state not recording and not playing
    public static final int STATE_IDLE = 5;
    // FM Recorder state recording
    public static final int STATE_RECORDING = 6;
    // FM Recorder state playing
    public static final int STATE_PLAYBACK = 7;
    // FM Recorder state stop recording
    public static final int STATE_STOP_RECORDING = 8;
    // FM Recorder state invalid, need to check
    public static final int STATE_INVALID = -1;
    // bug474741, recording format selection. 0:amr; 1:3gpp; 2:mp3
    public static int GLOBAL_RECORD_FORMAT_FLAG = 0;
    //  bug509670, recording time is too short, causing music player anr.
    public static final String FM_RECORDING_TIME_KEY = "FM_RECORDING_TIME_KEY";
}
