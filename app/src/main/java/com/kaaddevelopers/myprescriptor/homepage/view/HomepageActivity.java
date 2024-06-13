package com.kaaddevelopers.myprescriptor.homepage.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.kaaddevelopers.myprescriptor.R;

import dagger.android.support.DaggerAppCompatActivity;

public class HomepageActivity extends DaggerAppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
    }
}
