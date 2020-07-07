package com.example.adityasrivastava.androidlifecycleapp.utils;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class Utility {
    public static void showMessage(Context context, String message){
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }

    public static void Log(String className, String message){
        Log.d(className, message);
    }
}
