package com.example.nstransports;

import android.content.Context;
import android.content.SharedPreferences;

public class DBConnection {

    private static final String MY_PREFERENCES = "MyPrefs";


    public static void setValue(Context context,String key, String value) {
        SharedPreferences.Editor editor = context.getSharedPreferences(MY_PREFERENCES, Context.MODE_PRIVATE).edit();
        editor.putString(key, value);
        editor.apply();
    }

    public static String getValue(Context context,String key) {
        SharedPreferences prefs = context.getSharedPreferences(MY_PREFERENCES, Context.MODE_PRIVATE);
        return prefs.getString(key, null);
    }
}