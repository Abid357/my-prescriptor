package com.kaaddevelopers.myprescriptor.auth.login;

import com.kaaddevelopers.myprescriptor.auth.login.model.LoginModel;
import com.kaaddevelopers.myprescriptor.auth.login.model.LoginModelImpl;
import com.kaaddevelopers.myprescriptor.auth.login.presenter.LoginPresenter;
import com.kaaddevelopers.myprescriptor.auth.login.presenter.LoginPresenterImpl;
import com.kaaddevelopers.myprescriptor.auth.login.view.LoginView;
import com.kaaddevelopers.myprescriptor.auth.login.view.LoginActivity;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Abid-Temp on 05-Jan-18.
 */


@Module
public abstract class LoginActivityModule {

 @Provides
    static LoginPresenter provideLoginPresenter(LoginView loginView, LoginModel loginModel) {
        return new LoginPresenterImpl(loginView, loginModel);
    }

    @Binds
    abstract LoginView provideLoginView(LoginActivity loginActivity);

    @Binds
    abstract LoginModel provideLoginModel(LoginModelImpl loginModelImpl);
}