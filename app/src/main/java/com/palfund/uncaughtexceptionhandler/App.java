package com.palfund.uncaughtexceptionhandler;

import android.app.Application;
import android.util.Log;

/**
 * @author noone on 2017/11/8.
 *         真正的速度是看不见的 !
 *         Today is today , we will go !
 */

public class App extends Application {
    public static boolean regular=true;
    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("App", "---onCreate()--->" + "");
        CrashHandler.getInstance(this);
    }
}
