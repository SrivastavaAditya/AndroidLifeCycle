package com.example.adityasrivastava.androidlifecycleapp.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.adityasrivastava.androidlifecycleapp.R;
import com.example.adityasrivastava.androidlifecycleapp.utils.Utility;

/**
 * The type Main activity.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Utility.showMessage(this, getResources().getString(R.string.on_create_method_called));
    }

    @Override
    protected void onStart() {
        super.onStart();
        Utility.showMessage(this, getResources().getString(R.string.on_start_method_called));
    }

    @Override
    protected void onResume() {
        super.onResume();
        Utility.showMessage(this, getResources().getString(R.string.on_resume_method_called));
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Utility.showMessage(this, getResources().getString(R.string.on_restart_method_called));
    }

    @Override
    protected void onPause() {
        super.onPause();
        Utility.showMessage(this, getResources().getString(R.string.on_pause_method_called));
    }

    @Override
    protected void onStop() {
        super.onStop();
        Utility.showMessage(this, getResources().getString(R.string.on_stop_method_called));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Utility.showMessage(this, getResources().getString(R.string.on_destroy_method_called));
    }
}