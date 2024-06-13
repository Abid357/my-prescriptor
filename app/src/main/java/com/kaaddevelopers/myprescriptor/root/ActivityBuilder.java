package com.kaaddevelopers.myprescriptor.root;



import com.kaaddevelopers.myprescriptor.auth.almostThere.AlmostThereActivityModule;
import com.kaaddevelopers.myprescriptor.auth.almostThere.view.AlmostThereActivity;
import com.kaaddevelopers.myprescriptor.auth.facebookLogin.FacebookLoginActivityModule;
import com.kaaddevelopers.myprescriptor.auth.facebookLogin.view.FacebookLoginActivity;
import com.kaaddevelopers.myprescriptor.auth.googleLogin.GoogleLoginActivityModule;
import com.kaaddevelopers.myprescriptor.auth.googleLogin.view.GoogleLoginActivity;
import com.kaaddevelopers.myprescriptor.auth.signup.view.SignupActivity;
import com.kaaddevelopers.myprescriptor.auth.signup.SignupActivityModule;
import com.kaaddevelopers.myprescriptor.homepage.HomepageActivityModule;
import com.kaaddevelopers.myprescriptor.homepage.view.HomepageActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by Kamil Kamili CEO of KAAD Developers on 12/30/2017.
 */

@Module
public abstract class ActivityBuilder {
    @ContributesAndroidInjector(modules = SignupActivityModule.class)
    abstract SignupActivity bindSignupActivity();

    @ContributesAndroidInjector(modules = AlmostThereActivityModule.class)
    abstract AlmostThereActivity bindAlmostThereActivity();

    @ContributesAndroidInjector(modules = HomepageActivityModule.class)
    abstract HomepageActivity bindHomepageActivity();

    @ContributesAndroidInjector(modules = GoogleLoginActivityModule.class)
    abstract GoogleLoginActivity bindGoogleLoginActivity();

    @ContributesAndroidInjector(modules = FacebookLoginActivityModule.class)
    abstract FacebookLoginActivity bindFacebookLoginActivity();
}
