package com.example.android.sunshine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


// COMPLETED TODO (1) Add new Activity called SettingsActivity using Android Studio wizard


public class SettingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        // COMPLETED TODO (2) Set setDisplayHomeAsUpEnabled to true on the support ActionBar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
