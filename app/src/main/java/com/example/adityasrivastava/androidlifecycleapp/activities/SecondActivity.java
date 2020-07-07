package com.example.adityasrivastava.androidlifecycleapp.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.adityasrivastava.androidlifecycleapp.R;
import com.example.adityasrivastava.androidlifecycleapp.utils.Utility;

/**
 * The type Second activity.
 */
public class SecondActivity extends AppCompatActivity {

    View parentView;

    String TAG = "State";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        setUpViews();

        parentView.setBackgroundColor(getResources().getColor(R.color.onCreate));
        Utility.showMessage(this, getResources().getString(R.string.second_on_create_method_called));
        Utility.Log(TAG, getResources().getString(R.string.second_on_create_method_called));
    }

    private void setUpViews() {
        //Initializing Parent Layout
        parentView = findViewById(R.id.parent_second);
    }

    @Override
    protected void onStart() {
        super.onStart();
        parentView.setBackgroundColor(getResources().getColor(R.color.onStart));
        Utility.showMessage(this, getResources().getString(R.string.second_on_start_method_called));
        Utility.Log(TAG, getResources().getString(R.string.second_on_start_method_called));
    }

    @Override
    protected void onResume() {
        super.onResume();
        parentView.setBackgroundColor(getResources().getColor(R.color.onResume));
        Utility.showMessage(this, getResources().getString(R.string.second_on_resume_method_called));
        Utility.Log(TAG, getResources().getString(R.string.second_on_resume_method_called));
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        parentView.setBackgroundColor(getResources().getColor(R.color.onRestart));
        Utility.showMessage(this, getResources().getString(R.string.second_on_restart_method_called));
        Utility.Log(TAG, getResources().getString(R.string.second_on_restart_method_called));
    }

    @Override
    protected void onPause() {
        super.onPause();
        parentView.setBackgroundColor(getResources().getColor(R.color.onPause));
        Utility.showMessage(this, getResources().getString(R.string.second_on_pause_method_called));
        Utility.Log(TAG, getResources().getString(R.string.second_on_pause_method_called));
    }

    @Override
    protected void onStop() {
        super.onStop();
        parentView.setBackgroundColor(getResources().getColor(R.color.onStop));
        Utility.showMessage(this, getResources().getString(R.string.second_on_stop_method_called));
        Utility.Log(TAG, getResources().getString(R.string.second_on_stop_method_called));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        parentView.setBackgroundColor(getResources().getColor(R.color.onDestroy));
        Utility.showMessage(this, getResources().getString(R.string.second_on_destroy_method_called));
        Utility.Log(TAG, getResources().getString(R.string.second_on_destroy_method_called));
    }
}