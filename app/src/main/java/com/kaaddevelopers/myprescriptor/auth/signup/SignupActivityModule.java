package com.kaaddevelopers.myprescriptor.auth.signup;

import com.kaaddevelopers.myprescriptor.auth.signup.model.SignupModelImpl;
import com.kaaddevelopers.myprescriptor.auth.signup.presenter.SignupPresenter;
import com.kaaddevelopers.myprescriptor.auth.signup.presenter.SignupPresenterImpl;
import com.kaaddevelopers.myprescriptor.auth.signup.view.SignupView;
import com.kaaddevelopers.myprescriptor.auth.signup.view.SignupActivity;
import com.kaaddevelopers.myprescriptor.auth.signup.model.SignupModel;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Kamil Kamili CEO of KAAD Developers on 12/30/2017.
 */

@Module
public abstract class SignupActivityModule {

    @Provides
    static SignupPresenter provideSignupPresenter(SignupView signupView, SignupModel signupModel) {
        return new SignupPresenterImpl(signupView, signupModel);
    }

    @Binds
    abstract SignupView provideSignupView(SignupActivity signupActivity);

    @Binds
    abstract SignupModel provideSignupModel(SignupModelImpl signupModelImpl);
}
