package com.kaaddevelopers.myprescriptor.auth.appintro.view;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import com.kaaddevelopers.myprescriptor.auth.appintro.view.SampleSlide;

import com.github.paolorotolo.appintro.AppIntro;

public class app_intro extends AppIntro {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addSlide(SampleSlide.newInstance(com.kaaddevelopers.myprescriptor.R.layout.appintro_slide1));
        addSlide(SampleSlide.newInstance(com.kaaddevelopers.myprescriptor.R.layout.appintro_slide2));
        addSlide(SampleSlide.newInstance(com.kaaddevelopers.myprescriptor.R.layout.appintro_slide3));
        addSlide(SampleSlide.newInstance(com.kaaddevelopers.myprescriptor.R.layout.appintro_slide4));

    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        // Do something when users tap on Skip button.
        finish();
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        // Do something when users tap on Done button.
        finish();
    }

    @Override
    public void onSlideChanged(@Nullable Fragment oldFragment, @Nullable Fragment newFragment) {
        super.onSlideChanged(oldFragment, newFragment);
        // Do something when the slide changes.
    }
}
