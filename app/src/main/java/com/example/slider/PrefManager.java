package com.example.slider;

import android.content.Context;
import android.content.SharedPreferences;

public class PrefManager {
    SharedPreferences pref;
    SharedPreferences.Editor editor;
    Context context;
    int PRIVATE_MODE = 0;
    private static final String PREF_NAME = "Sanket's Welcome Screen";
    private static final String IS_FIRST_TIME_LAUNCH = "IsFirstTimeLaunch";

    public PrefManager(Context context) {
        this.context = context;
        pref = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        editor = pref.edit();
    }
    public void setFirstTimeLaunch(boolean isFirstTime)
    {
        //editor.putBoolean("IsFirstTimeLaunch", isFirstTime).commit();
        editor.putBoolean("IsFirstTimeLaunch", isFirstTime);
    }
    public boolean isFirstTimeLaunch()
    {
        return pref.getBoolean("IsFirstTimeLaunch", true);
    }
}
