package com.kaaddevelopers.myprescriptor.auth.almostThere;

import com.kaaddevelopers.myprescriptor.auth.almostThere.model.AlmostThereModel;
import com.kaaddevelopers.myprescriptor.auth.almostThere.model.AlmostThereModelImpl;
import com.kaaddevelopers.myprescriptor.auth.almostThere.presenter.AlmostTherePresenter;
import com.kaaddevelopers.myprescriptor.auth.almostThere.presenter.AlmostTherePresenterImpl;
import com.kaaddevelopers.myprescriptor.auth.almostThere.view.AlmostThereActivity;
import com.kaaddevelopers.myprescriptor.auth.almostThere.view.AlmostThereView;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Abid-Temp on 03-Jan-18.
 */

@Module
public abstract class AlmostThereActivityModule {
    @Provides
    static AlmostTherePresenter provideAlmostTherePresenter(AlmostThereView almostThereView, AlmostThereModel almostThereModel) {
        return new AlmostTherePresenterImpl(almostThereView, almostThereModel);
    }

    @Binds
    abstract AlmostThereView provideAlmostThereView(AlmostThereActivity almostThereActivity);

    @Binds
    abstract AlmostThereModel provideAlmostThereModel(AlmostThereModelImpl almostThereModelImpl);
}