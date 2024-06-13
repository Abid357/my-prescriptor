package com.kaaddevelopers.myprescriptor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.kaaddevelopers.myprescriptor.auth.signup.view.SignupActivity;

import dagger.android.support.DaggerAppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.kaaddevelopers.myprescriptor.R.layout.splash_screen);

        Thread t = new Thread() {
            public void run() {
                try {
                    sleep(3000);
                    Intent intent = new Intent(getApplicationContext(), SignupActivity.class);
                    startActivity(intent);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t.start();
    }
}

