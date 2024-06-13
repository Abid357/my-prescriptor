package com.kaaddevelopers.myprescriptor.root;

import android.app.Activity;
import com.kaaddevelopers.myprescriptor.auth.almostThere.AlmostThereActivityModule;
import com.kaaddevelopers.myprescriptor.auth.almostThere.view.AlmostThereActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = ActivityBuilder_BindAlmostThereActivity.AlmostThereActivitySubcomponent.class
)
public abstract class ActivityBuilder_BindAlmostThereActivity {
  private ActivityBuilder_BindAlmostThereActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(AlmostThereActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      AlmostThereActivitySubcomponent.Builder builder);

  @Subcomponent(modules = AlmostThereActivityModule.class)
  public interface AlmostThereActivitySubcomponent extends AndroidInjector<AlmostThereActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<AlmostThereActivity> {}
  }
}
