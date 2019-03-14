package com.example.adityasrivastava.androidlifecycleapp.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.adityasrivastava.androidlifecycleapp.R;
import com.example.adityasrivastava.androidlifecycleapp.fragments.FirstFragment;
import com.example.adityasrivastava.androidlifecycleapp.utils.Utility;

/**
 * The type Main activity.
 */
public class MainActivity extends AppCompatActivity {

    View parentLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        parentLayout = findViewById(R.id.parent);

        parentLayout.setBackgroundColor(getResources().getColor(R.color.onCreate));

        getSupportFragmentManager().beginTransaction().add(android.R.id.content, new FirstFragment())
                .addToBackStack(null).commit();
        Utility.showMessage(this, getResources()
                .getString(R.string.main_on_create_method_called));
    }

    @Override
    protected void onStart() {
        super.onStart();
        parentLayout.setBackgroundColor(getResources().getColor(R.color.onStart));
        Utility.showMessage(this, getResources()
                .getString(R.string.main_on_start_method_called));
    }

    @Override
    protected void onResume() {
        super.onResume();
        parentLayout.setBackgroundColor(getResources().getColor(R.color.onResume));
        Utility.showMessage(this, getResources()
                .getString(R.string.main_on_resume_method_called));
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        parentLayout.setBackgroundColor(getResources().getColor(R.color.onRestart));
        Utility.showMessage(this, getResources()
                .getString(R.string.main_on_restart_method_called));
    }

    @Override
    protected void onPause() {
        super.onPause();
        parentLayout.setBackgroundColor(getResources().getColor(R.color.onPause));
        Utility.showMessage(this, getResources()
                .getString(R.string.main_on_pause_method_called));
    }

    @Override
    protected void onStop() {
        super.onStop();
        parentLayout.setBackgroundColor(getResources().getColor(R.color.onStop));
        Utility.showMessage(this, getResources()
                .getString(R.string.main_on_stop_method_called));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        parentLayout.setBackgroundColor(getResources().getColor(R.color.onDestroy));
        Utility.showMessage(this, getResources()
                .getString(R.string.main_on_destroy_method_called));
    }
}