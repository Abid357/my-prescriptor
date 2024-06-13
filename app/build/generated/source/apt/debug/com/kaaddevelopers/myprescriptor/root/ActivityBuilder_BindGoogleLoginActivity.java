package com.kaaddevelopers.myprescriptor.root;

import android.app.Activity;
import com.kaaddevelopers.myprescriptor.auth.googleLogin.GoogleLoginActivityModule;
import com.kaaddevelopers.myprescriptor.auth.googleLogin.view.GoogleLoginActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = ActivityBuilder_BindGoogleLoginActivity.GoogleLoginActivitySubcomponent.class
)
public abstract class ActivityBuilder_BindGoogleLoginActivity {
  private ActivityBuilder_BindGoogleLoginActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(GoogleLoginActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      GoogleLoginActivitySubcomponent.Builder builder);

  @Subcomponent(modules = GoogleLoginActivityModule.class)
  public interface GoogleLoginActivitySubcomponent extends AndroidInjector<GoogleLoginActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<GoogleLoginActivity> {}
  }
}
