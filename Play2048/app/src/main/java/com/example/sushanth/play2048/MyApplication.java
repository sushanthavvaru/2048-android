package com.example.sushanth.play2048;

import android.app.Application;
import android.content.SharedPreferences;

/**
 * Created by sushanth on 5/11/2017.
 */

public class MyApplication extends Application {
    public static SharedPreferences preferences;

    @Override
    public void onCreate() {
        super.onCreate();

        preferences = getSharedPreferences(getPackageName() + "_preferences", MODE_PRIVATE);
    }
}
