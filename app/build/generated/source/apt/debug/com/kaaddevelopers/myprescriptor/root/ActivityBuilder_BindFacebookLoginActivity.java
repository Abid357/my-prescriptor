package com.kaaddevelopers.myprescriptor.root;

import android.app.Activity;
import com.kaaddevelopers.myprescriptor.auth.facebookLogin.FacebookLoginActivityModule;
import com.kaaddevelopers.myprescriptor.auth.facebookLogin.view.FacebookLoginActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = ActivityBuilder_BindFacebookLoginActivity.FacebookLoginActivitySubcomponent.class
)
public abstract class ActivityBuilder_BindFacebookLoginActivity {
  private ActivityBuilder_BindFacebookLoginActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(FacebookLoginActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      FacebookLoginActivitySubcomponent.Builder builder);

  @Subcomponent(modules = FacebookLoginActivityModule.class)
  public interface FacebookLoginActivitySubcomponent
      extends AndroidInjector<FacebookLoginActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<FacebookLoginActivity> {}
  }
}
