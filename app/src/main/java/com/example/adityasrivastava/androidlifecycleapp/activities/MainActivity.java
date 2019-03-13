package com.example.adityasrivastava.androidlifecycleapp.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.adityasrivastava.androidlifecycleapp.R;
import com.example.adityasrivastava.androidlifecycleapp.utils.Utility;

/**
 * The type Main activity.
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * The Parent layout.
     */
    View parentLayout;
    /**
     * The Button click.
     */
    Button buttonClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setViews();

        parentLayout.setBackgroundColor(getResources().getColor(R.color.onCreate));
        Utility.showMessage(this, getResources().getString(R.string.main_on_create_method_called));
    }

    private void setViews() {
        //Initializing Parent Layout
        parentLayout = findViewById(R.id.parent);

        //Initializing Button
        buttonClick = findViewById(R.id.btn_click);
        buttonClick.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        parentLayout.setBackgroundColor(getResources().getColor(R.color.onStart));
        Utility.showMessage(this, getResources().getString(R.string.main_on_start_method_called));
    }

    @Override
    protected void onResume() {
        super.onResume();
        parentLayout.setBackgroundColor(getResources().getColor(R.color.onResume));
        Utility.showMessage(this, getResources().getString(R.string.main_on_resume_method_called));
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        parentLayout.setBackgroundColor(getResources().getColor(R.color.onRestart));
        Utility.showMessage(this, getResources().getString(R.string.main_on_restart_method_called));
    }

    @Override
    protected void onPause() {
        super.onPause();
        parentLayout.setBackgroundColor(getResources().getColor(R.color.onPause));
        Utility.showMessage(this, getResources().getString(R.string.main_on_pause_method_called));
    }

    @Override
    protected void onStop() {
        super.onStop();
        parentLayout.setBackgroundColor(getResources().getColor(R.color.onStop));
        Utility.showMessage(this, getResources().getString(R.string.main_on_stop_method_called));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        parentLayout.setBackgroundColor(getResources().getColor(R.color.onDestroy));
        Utility.showMessage(this, getResources().getString(R.string.main_on_destroy_method_called));
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.btn_click:
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
                break;

            default:
                break;
        }
    }
}