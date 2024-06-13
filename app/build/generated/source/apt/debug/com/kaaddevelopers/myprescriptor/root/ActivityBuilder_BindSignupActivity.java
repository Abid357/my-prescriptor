package com.kaaddevelopers.myprescriptor.root;

import android.app.Activity;
import com.kaaddevelopers.myprescriptor.auth.signup.SignupActivityModule;
import com.kaaddevelopers.myprescriptor.auth.signup.view.SignupActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityBuilder_BindSignupActivity.SignupActivitySubcomponent.class)
public abstract class ActivityBuilder_BindSignupActivity {
  private ActivityBuilder_BindSignupActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(SignupActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      SignupActivitySubcomponent.Builder builder);

  @Subcomponent(modules = SignupActivityModule.class)
  public interface SignupActivitySubcomponent extends AndroidInjector<SignupActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<SignupActivity> {}
  }
}
