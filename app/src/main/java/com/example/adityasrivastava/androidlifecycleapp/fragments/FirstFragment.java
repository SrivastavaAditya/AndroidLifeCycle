package com.example.adityasrivastava.androidlifecycleapp.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.adityasrivastava.androidlifecycleapp.R;
import com.example.adityasrivastava.androidlifecycleapp.utils.Utility;

public class FirstFragment extends Fragment {

    public FirstFragment() {
        // Required empty public constructor
    }

    String TAG = "State";

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Utility.showMessage(getContext(), getResources().getString(R.string.first_fragment_on_attach_method_called));
        Utility.Log(TAG, getResources().getString(R.string.first_fragment_on_attach_method_called));

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Utility.showMessage(getContext(), getResources().getString(R.string.first_fragment_on_create_method_called));
        Utility.Log(TAG, getResources().getString(R.string.first_fragment_on_create_method_called));

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Utility.showMessage(getContext(), getResources().getString(R.string.first_fragment_on_create_view_method_called));
        Utility.Log(TAG, getResources().getString(R.string.first_fragment_on_create_view_method_called));
        return inflater.inflate(R.layout.fragment_my, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Utility.showMessage(getContext(), getResources().getString(R.string.first_fragment_on_view_created_method_called));
        Utility.Log(TAG, getResources().getString(R.string.first_fragment_on_view_created_method_called));
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Utility.showMessage(getContext(), getResources().getString(R.string.first_fragment_on_activity_created_method_called));
        Utility.Log(TAG, getResources().getString(R.string.first_fragment_on_activity_created_method_called));
    }

    @Override
    public void onResume() {
        super.onResume();
        Utility.showMessage(getContext(), getResources().getString(R.string.first_fragment_on_resume_method_called));
        Utility.Log(TAG, getResources().getString(R.string.first_fragment_on_resume_method_called));
    }

    @Override
    public void onPause() {
        super.onPause();
        Utility.showMessage(getContext(), getResources().getString(R.string.first_fragment_on_pause_method_called));
        Utility.Log(TAG, getResources().getString(R.string.first_fragment_on_pause_method_called));
    }

    @Override
    public void onStop() {
        super.onStop();
        Utility.showMessage(getContext(), getResources().getString(R.string.first_fragment_on_stop_method_called));
        Utility.Log(TAG, getResources().getString(R.string.first_fragment_on_stop_method_called));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Utility.showMessage(getContext(), getResources().getString(R.string.first_fragment_on_destroy_view_method_called));
        Utility.Log(TAG, getResources().getString(R.string.first_fragment_on_destroy_view_method_called));
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Utility.showMessage(getContext(), getResources().getString(R.string.first_fragment_on_destroy_method_called));
        Utility.Log(TAG, getResources().getString(R.string.main_on_destroy_method_called));

    }

    @Override
    public void onDetach() {
        super.onDetach();
        Utility.showMessage(getContext(), getResources().getString(R.string.first_fragment_on_detach_method_called));
        Utility.Log(TAG, getResources().getString(R.string.first_fragment_on_detach_method_called));

    }
}