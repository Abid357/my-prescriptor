package com.kaaddevelopers.myprescriptor.auth.facebookLogin;

import com.kaaddevelopers.myprescriptor.auth.facebookLogin.model.FacebookLoginModel;
import com.kaaddevelopers.myprescriptor.auth.facebookLogin.model.FacebookLoginModelImpl;
import com.kaaddevelopers.myprescriptor.auth.facebookLogin.presenter.FacebookLoginPresenter;
import com.kaaddevelopers.myprescriptor.auth.facebookLogin.presenter.FacebookLoginPresenterImpl;
import com.kaaddevelopers.myprescriptor.auth.facebookLogin.view.FacebookLoginActivity;
import com.kaaddevelopers.myprescriptor.auth.facebookLogin.view.FacebookLoginView;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Kamil Kamili CEO of KAAD Developers on 12/30/2017.
 */

@Module
public abstract class FacebookLoginActivityModule {

    @Provides
    static FacebookLoginPresenter provideFacebookLoginPresenter(FacebookLoginView facebookLoginView, FacebookLoginModel facebookLoginsignupModel) {
        return new FacebookLoginPresenterImpl(facebookLoginView, facebookLoginsignupModel);
    }

    @Binds
    abstract FacebookLoginView provideFacebookLoginView(FacebookLoginActivity facebookLoginActivity);

    @Binds
    abstract FacebookLoginModel provideFacebookLoginModel(FacebookLoginModelImpl facebookLoginModelImpl);
}
