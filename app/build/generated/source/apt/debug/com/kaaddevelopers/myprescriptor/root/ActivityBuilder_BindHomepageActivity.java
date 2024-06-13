package com.kaaddevelopers.myprescriptor.root;

import android.app.Activity;
import com.kaaddevelopers.myprescriptor.homepage.HomepageActivityModule;
import com.kaaddevelopers.myprescriptor.homepage.view.HomepageActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityBuilder_BindHomepageActivity.HomepageActivitySubcomponent.class)
public abstract class ActivityBuilder_BindHomepageActivity {
  private ActivityBuilder_BindHomepageActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(HomepageActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      HomepageActivitySubcomponent.Builder builder);

  @Subcomponent(modules = HomepageActivityModule.class)
  public interface HomepageActivitySubcomponent extends AndroidInjector<HomepageActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<HomepageActivity> {}
  }
}
