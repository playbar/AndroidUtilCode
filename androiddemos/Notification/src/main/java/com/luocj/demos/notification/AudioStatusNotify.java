package com.luocj.demos.notification;

import android.app.ActivityManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.Log;

import java.util.Iterator;
import java.util.List;

public class AudioStatusNotify {
    public static final String TAG = AudioStatusNotify.class.getSimpleName();
    public static final int NOTIFY_ID = 10001;

    private AudioStatusNotify() {
    }

    public static void sendAudioStatusNotification(Context context, String packageName, boolean isSpeakerOn) {
        AppInfo appInfo = getApplicationInfo(context, packageName, true);
        if (appInfo == null) {
            Log.e("AudioStatusHandler", "can not get app info for packageName " + packageName);
            return;
        }
        NotificationManager manager =
                (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

        String summary;
        if (isSpeakerOn) {
            summary = context.getResources().getString(R.string.status_communication_speaker_summary);
        } else {
            summary = context.getResources().getString(R.string.status_communication_summary);
        }

        Notification notification = new Notification.Builder(context)
                .setContentTitle(appInfo.name)
                .setContentText(summary)
                .setSmallIcon(android.R.drawable.sym_def_app_icon)
                .setLargeIcon(appInfo.icon)
                .setPriority(Notification.PRIORITY_MAX)
                .setDefaults(Notification.DEFAULT_VIBRATE)
                .build();
        notification.flags |= Notification.FLAG_NO_CLEAR;
        manager.notify(NOTIFY_ID, notification);
    }

    public static AppInfo getApplicationInfo(Context context, int pid, boolean getIcon) {
        ActivityManager am = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        List l = am.getRunningAppProcesses();

        Iterator i = l.iterator();
        PackageManager pm = context.getPackageManager();

        while (i.hasNext()) {
            ActivityManager.RunningAppProcessInfo info = (ActivityManager.RunningAppProcessInfo) (i.next());
            if (info.pid != pid) {
                continue;
            }
            try {
                ApplicationInfo applicationInfo =
                        pm.getApplicationInfo(info.processName, PackageManager.GET_META_DATA);
                AppInfo appInfo = new AppInfo();
                appInfo.pid = pid;
                appInfo.pkg = applicationInfo.packageName;
                appInfo.name = pm.getApplicationLabel(applicationInfo).toString();
                if (getIcon) {
                    appInfo.icon = ((BitmapDrawable) pm.getApplicationIcon(applicationInfo)).getBitmap();
                }
                return appInfo;
            } catch (PackageManager.NameNotFoundException e) {
                Log.e(TAG, "getApplicationInfo NameNotFoundException failed", e);
            } catch (Exception e) {
                Log.e(TAG, "getApplicationInfo failed", e);
            }
        }
        return null;
    }

    public static AppInfo getApplicationInfo(Context context, String packageName, boolean getIcon) {
        try {
            PackageManager pm = context.getPackageManager();
            ApplicationInfo applicationInfo =
                    pm.getApplicationInfo(packageName, PackageManager.GET_META_DATA);
            AppInfo appInfo = new AppInfo();
            appInfo.pid = 0;
            appInfo.pkg = applicationInfo.packageName;
            appInfo.name = pm.getApplicationLabel(applicationInfo).toString();
            if (getIcon) {
                appInfo.icon = ((BitmapDrawable) pm.getApplicationIcon(applicationInfo)).getBitmap();
            }
            return appInfo;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(TAG, "getApplicationInfo NameNotFoundException failed", e);
        } catch (Exception e) {
            Log.e(TAG, "getApplicationInfo failed", e);
        }
        return null;
    }

    public static class AppInfo {
        public int pid;
        public String pkg;
        public String name;
        public Bitmap icon;
    }
}

