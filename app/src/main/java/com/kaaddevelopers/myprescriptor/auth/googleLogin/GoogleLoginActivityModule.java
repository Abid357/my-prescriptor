package com.kaaddevelopers.myprescriptor.auth.googleLogin;

import com.kaaddevelopers.myprescriptor.auth.googleLogin.model.GoogleLoginModel;
import com.kaaddevelopers.myprescriptor.auth.googleLogin.model.GoogleLoginModelImpl;
import com.kaaddevelopers.myprescriptor.auth.googleLogin.presenter.GoogleLoginPresenter;
import com.kaaddevelopers.myprescriptor.auth.googleLogin.presenter.GoogleLoginPresenterImpl;
import com.kaaddevelopers.myprescriptor.auth.googleLogin.view.GoogleLoginActivity;
import com.kaaddevelopers.myprescriptor.auth.googleLogin.view.GoogleLoginView;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Kamil Kamili CEO of KAAD Developers on 12/30/2017.
 */

@Module
public abstract class GoogleLoginActivityModule {

    @Provides
    static GoogleLoginPresenter provideGoogleLoginPresenter(GoogleLoginView googleLoginView, GoogleLoginModel googleLoginModel) {
        return new GoogleLoginPresenterImpl(googleLoginView, googleLoginModel);
    }

    @Binds
    abstract GoogleLoginView provideGoogleLoginView(GoogleLoginActivity googleLoginActivity);

    @Binds
    abstract GoogleLoginModel provideGoogleLoginModel(GoogleLoginModelImpl googleLoginModelImpl);
}
