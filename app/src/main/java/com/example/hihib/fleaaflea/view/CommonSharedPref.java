package com.example.hihib.fleaaflea.view;

/**
 * Created by hihib on 2017-11-17.
 */

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;


/**
 *
 */
public class CommonSharedPref {

    private static final String TAG = CommonSharedPref.class.getSimpleName();
    private static String PREF = "pref";
    private static String name     = null;
    private static String msg       = null;

    private static void clear() {
        name = null;
        msg = null;
    }

    public static String getStringValue(Context context, String key) {
        SharedPreferences prefs = context.getSharedPreferences(PREF, Activity.MODE_PRIVATE);
        return prefs.getString(key, "");
    }

    public static String getStringValue(Context context, String key, String defaultValue) {
        SharedPreferences prefs  = context.getSharedPreferences(PREF, Activity.MODE_PRIVATE);
        return prefs.getString(key, defaultValue);
    }

    public static boolean setStringValue(Context context, String key, String value) {
        SharedPreferences prefs = context.getSharedPreferences(PREF, Activity.MODE_PRIVATE);
        SharedPreferences.Editor ed = prefs.edit();
        ed.putString(key, value);
        return ed.commit();
    }

    public static int getIntValue(Context context, String key) {
        SharedPreferences prefs  = context.getSharedPreferences(PREF, Activity.MODE_PRIVATE);
        return prefs.getInt(key, 0);
    }

    public static boolean setIntValue(Context context, String key, int value) {
        SharedPreferences prefs = context.getSharedPreferences(PREF, Activity.MODE_PRIVATE);
        SharedPreferences.Editor ed = prefs.edit();
        ed.putInt(key, value);
        return ed.commit();
    }

    public static long getLongValue(Context context, String key) {
        SharedPreferences prefs  = context.getSharedPreferences(PREF, Activity.MODE_PRIVATE);
        return prefs.getLong(key, 0);
    }

    public static boolean setLongValue(Context context, String key, long value) {
        SharedPreferences prefs = context.getSharedPreferences(PREF, Activity.MODE_PRIVATE);
        SharedPreferences.Editor ed = prefs.edit();
        ed.putLong(key, value);
        return ed.commit();
    }

    public static boolean getBoolean(Context context, String key) {
        SharedPreferences prefs = context.getSharedPreferences(PREF, Activity.MODE_PRIVATE);
        return prefs.getBoolean(key, false);
    }

    public static boolean getBoolean(Context context, String key, boolean defaultValue) {
        SharedPreferences prefs = context.getSharedPreferences(PREF, Activity.MODE_PRIVATE);
        return prefs.getBoolean(key, defaultValue);
    }

    public static boolean setBoolean(Context context, String key, boolean value) {
        SharedPreferences prefs = context.getSharedPreferences(PREF, Activity.MODE_PRIVATE);
        SharedPreferences.Editor ed = prefs.edit();
        ed.putBoolean(key, value);
        return ed.commit();
    }

    public static boolean contains(Context context, String key) {
        SharedPreferences prefs  = context.getSharedPreferences(PREF, Activity.MODE_PRIVATE);
        return prefs.contains(key);
    }

    public static boolean clearKey(Context context, String key) {
        SharedPreferences prefs  = context.getSharedPreferences(PREF, Activity.MODE_PRIVATE);
        SharedPreferences.Editor ed = prefs.edit();
        return ed.remove(key).commit();
    }

    /**
     * Preference에 저장되어 있는 환경 설정을 다 지운다.
     * @param context
     * @return
     */
    public static boolean removeAll(Context context) {
        clear();

        SharedPreferences prefs = context.getSharedPreferences(PREF, Activity.MODE_PRIVATE);
        SharedPreferences.Editor ed = prefs.edit();
        ed.clear();

        return ed.commit();
    }
}
