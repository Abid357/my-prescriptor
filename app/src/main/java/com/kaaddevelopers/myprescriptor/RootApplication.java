package com.kaaddevelopers.myprescriptor;


import com.kaaddevelopers.myprescriptor.root.AppComponent;
import com.kaaddevelopers.myprescriptor.root.DaggerAppComponent;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

/**
 * Created by Kamil Kamili CEO of KAAD Developers on 12/30/2017.
 */

public class RootApplication extends DaggerApplication {
    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        AppComponent appComponent = DaggerAppComponent.builder().application(this).build();
        appComponent.inject(this);
        return appComponent;
    }
}
