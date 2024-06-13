package com.kaaddevelopers.myprescriptor.root;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import com.kaaddevelopers.myprescriptor.RootApplication;
import com.kaaddevelopers.myprescriptor.auth.almostThere.AlmostThereActivityModule_ProvideAlmostTherePresenterFactory;
import com.kaaddevelopers.myprescriptor.auth.almostThere.model.AlmostThereModelImpl;
import com.kaaddevelopers.myprescriptor.auth.almostThere.presenter.AlmostTherePresenter;
import com.kaaddevelopers.myprescriptor.auth.almostThere.view.AlmostThereActivity;
import com.kaaddevelopers.myprescriptor.auth.almostThere.view.AlmostThereActivity_MembersInjector;
import com.kaaddevelopers.myprescriptor.auth.facebookLogin.FacebookLoginActivityModule_ProvideFacebookLoginPresenterFactory;
import com.kaaddevelopers.myprescriptor.auth.facebookLogin.model.FacebookLoginModelImpl;
import com.kaaddevelopers.myprescriptor.auth.facebookLogin.presenter.FacebookLoginPresenter;
import com.kaaddevelopers.myprescriptor.auth.facebookLogin.view.FacebookLoginActivity;
import com.kaaddevelopers.myprescriptor.auth.facebookLogin.view.FacebookLoginActivity_MembersInjector;
import com.kaaddevelopers.myprescriptor.auth.googleLogin.GoogleLoginActivityModule_ProvideGoogleLoginPresenterFactory;
import com.kaaddevelopers.myprescriptor.auth.googleLogin.model.GoogleLoginModelImpl;
import com.kaaddevelopers.myprescriptor.auth.googleLogin.presenter.GoogleLoginPresenter;
import com.kaaddevelopers.myprescriptor.auth.googleLogin.view.GoogleLoginActivity;
import com.kaaddevelopers.myprescriptor.auth.googleLogin.view.GoogleLoginActivity_MembersInjector;
import com.kaaddevelopers.myprescriptor.auth.signup.SignupActivityModule_ProvideSignupPresenterFactory;
import com.kaaddevelopers.myprescriptor.auth.signup.model.SignupModelImpl;
import com.kaaddevelopers.myprescriptor.auth.signup.presenter.SignupPresenter;
import com.kaaddevelopers.myprescriptor.auth.signup.view.SignupActivity;
import com.kaaddevelopers.myprescriptor.auth.signup.view.SignupActivity_MembersInjector;
import com.kaaddevelopers.myprescriptor.homepage.view.HomepageActivity;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import dagger.android.DaggerApplication_MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.DispatchingAndroidInjector_Factory;
import dagger.android.support.DaggerAppCompatActivity_MembersInjector;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerAppComponent implements AppComponent {
  private Application application;

  private Provider<ActivityBuilder_BindSignupActivity.SignupActivitySubcomponent.Builder>
      signupActivitySubcomponentBuilderProvider;

  private Provider<ActivityBuilder_BindAlmostThereActivity.AlmostThereActivitySubcomponent.Builder>
      almostThereActivitySubcomponentBuilderProvider;

  private Provider<ActivityBuilder_BindHomepageActivity.HomepageActivitySubcomponent.Builder>
      homepageActivitySubcomponentBuilderProvider;

  private Provider<ActivityBuilder_BindGoogleLoginActivity.GoogleLoginActivitySubcomponent.Builder>
      googleLoginActivitySubcomponentBuilderProvider;

  private Provider<
          ActivityBuilder_BindFacebookLoginActivity.FacebookLoginActivitySubcomponent.Builder>
      facebookLoginActivitySubcomponentBuilderProvider;

  private DaggerAppComponent(Builder builder) {
    initialize(builder);
  }

  public static AppComponent.Builder builder() {
    return new Builder();
  }

  private Map<Class<? extends Activity>, Provider<AndroidInjector.Factory<? extends Activity>>>
      getMapOfClassOfAndProviderOfFactoryOf() {
    return MapBuilder
        .<Class<? extends Activity>, Provider<AndroidInjector.Factory<? extends Activity>>>
            newMapBuilder(5)
        .put(SignupActivity.class, (Provider) signupActivitySubcomponentBuilderProvider)
        .put(AlmostThereActivity.class, (Provider) almostThereActivitySubcomponentBuilderProvider)
        .put(HomepageActivity.class, (Provider) homepageActivitySubcomponentBuilderProvider)
        .put(GoogleLoginActivity.class, (Provider) googleLoginActivitySubcomponentBuilderProvider)
        .put(
            FacebookLoginActivity.class,
            (Provider) facebookLoginActivitySubcomponentBuilderProvider)
        .build();
  }

  private DispatchingAndroidInjector<Activity> getDispatchingAndroidInjectorOfActivity() {
    return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
        getMapOfClassOfAndProviderOfFactoryOf());
  }

  private DispatchingAndroidInjector<BroadcastReceiver>
      getDispatchingAndroidInjectorOfBroadcastReceiver() {
    return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
        Collections
            .<Class<? extends BroadcastReceiver>,
                Provider<AndroidInjector.Factory<? extends BroadcastReceiver>>>
                emptyMap());
  }

  private DispatchingAndroidInjector<Fragment> getDispatchingAndroidInjectorOfFragment() {
    return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
        Collections
            .<Class<? extends Fragment>, Provider<AndroidInjector.Factory<? extends Fragment>>>
                emptyMap());
  }

  private DispatchingAndroidInjector<Service> getDispatchingAndroidInjectorOfService() {
    return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
        Collections
            .<Class<? extends Service>, Provider<AndroidInjector.Factory<? extends Service>>>
                emptyMap());
  }

  private DispatchingAndroidInjector<ContentProvider>
      getDispatchingAndroidInjectorOfContentProvider() {
    return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
        Collections
            .<Class<? extends ContentProvider>,
                Provider<AndroidInjector.Factory<? extends ContentProvider>>>
                emptyMap());
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.signupActivitySubcomponentBuilderProvider =
        new Provider<ActivityBuilder_BindSignupActivity.SignupActivitySubcomponent.Builder>() {
          @Override
          public ActivityBuilder_BindSignupActivity.SignupActivitySubcomponent.Builder get() {
            return new SignupActivitySubcomponentBuilder();
          }
        };
    this.almostThereActivitySubcomponentBuilderProvider =
        new Provider<
            ActivityBuilder_BindAlmostThereActivity.AlmostThereActivitySubcomponent.Builder>() {
          @Override
          public ActivityBuilder_BindAlmostThereActivity.AlmostThereActivitySubcomponent.Builder
              get() {
            return new AlmostThereActivitySubcomponentBuilder();
          }
        };
    this.homepageActivitySubcomponentBuilderProvider =
        new Provider<ActivityBuilder_BindHomepageActivity.HomepageActivitySubcomponent.Builder>() {
          @Override
          public ActivityBuilder_BindHomepageActivity.HomepageActivitySubcomponent.Builder get() {
            return new HomepageActivitySubcomponentBuilder();
          }
        };
    this.googleLoginActivitySubcomponentBuilderProvider =
        new Provider<
            ActivityBuilder_BindGoogleLoginActivity.GoogleLoginActivitySubcomponent.Builder>() {
          @Override
          public ActivityBuilder_BindGoogleLoginActivity.GoogleLoginActivitySubcomponent.Builder
              get() {
            return new GoogleLoginActivitySubcomponentBuilder();
          }
        };
    this.facebookLoginActivitySubcomponentBuilderProvider =
        new Provider<
            ActivityBuilder_BindFacebookLoginActivity.FacebookLoginActivitySubcomponent.Builder>() {
          @Override
          public ActivityBuilder_BindFacebookLoginActivity.FacebookLoginActivitySubcomponent.Builder
              get() {
            return new FacebookLoginActivitySubcomponentBuilder();
          }
        };
    this.application = builder.application;
  }

  @Override
  public void inject(RootApplication app) {
    injectRootApplication(app);
  }

  @Override
  public void inject(DaggerApplication instance) {
    injectDaggerApplication(instance);
  }

  private RootApplication injectRootApplication(RootApplication instance) {
    DaggerApplication_MembersInjector.injectActivityInjector(
        instance, getDispatchingAndroidInjectorOfActivity());
    DaggerApplication_MembersInjector.injectBroadcastReceiverInjector(
        instance, getDispatchingAndroidInjectorOfBroadcastReceiver());
    DaggerApplication_MembersInjector.injectFragmentInjector(
        instance, getDispatchingAndroidInjectorOfFragment());
    DaggerApplication_MembersInjector.injectServiceInjector(
        instance, getDispatchingAndroidInjectorOfService());
    DaggerApplication_MembersInjector.injectContentProviderInjector(
        instance, getDispatchingAndroidInjectorOfContentProvider());
    DaggerApplication_MembersInjector.injectSetInjected(instance);
    return instance;
  }

  private DaggerApplication injectDaggerApplication(DaggerApplication instance) {
    DaggerApplication_MembersInjector.injectActivityInjector(
        instance, getDispatchingAndroidInjectorOfActivity());
    DaggerApplication_MembersInjector.injectBroadcastReceiverInjector(
        instance, getDispatchingAndroidInjectorOfBroadcastReceiver());
    DaggerApplication_MembersInjector.injectFragmentInjector(
        instance, getDispatchingAndroidInjectorOfFragment());
    DaggerApplication_MembersInjector.injectServiceInjector(
        instance, getDispatchingAndroidInjectorOfService());
    DaggerApplication_MembersInjector.injectContentProviderInjector(
        instance, getDispatchingAndroidInjectorOfContentProvider());
    DaggerApplication_MembersInjector.injectSetInjected(instance);
    return instance;
  }

  private static final class Builder implements AppComponent.Builder {
    private Application application;

    @Override
    public AppComponent build() {
      if (application == null) {
        throw new IllegalStateException(Application.class.getCanonicalName() + " must be set");
      }
      return new DaggerAppComponent(this);
    }

    @Override
    public Builder application(Application application) {
      this.application = Preconditions.checkNotNull(application);
      return this;
    }
  }

  private final class SignupActivitySubcomponentBuilder
      extends ActivityBuilder_BindSignupActivity.SignupActivitySubcomponent.Builder {
    private SignupActivity seedInstance;

    @Override
    public ActivityBuilder_BindSignupActivity.SignupActivitySubcomponent build() {
      if (seedInstance == null) {
        throw new IllegalStateException(SignupActivity.class.getCanonicalName() + " must be set");
      }
      return new SignupActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(SignupActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class SignupActivitySubcomponentImpl
      implements ActivityBuilder_BindSignupActivity.SignupActivitySubcomponent {
    private SignupActivity seedInstance;

    private SignupActivitySubcomponentImpl(SignupActivitySubcomponentBuilder builder) {
      initialize(builder);
    }

    private DispatchingAndroidInjector<android.support.v4.app.Fragment>
        getDispatchingAndroidInjectorOfFragment() {
      return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
          Collections
              .<Class<? extends android.support.v4.app.Fragment>,
                  Provider<AndroidInjector.Factory<? extends android.support.v4.app.Fragment>>>
                  emptyMap());
    }

    private SignupModelImpl getSignupModelImpl() {
      return new SignupModelImpl(AppModule_ProvideFirebaseAuthFactory.proxyProvideFirebaseAuth());
    }

    private SignupPresenter getSignupPresenter() {
      return SignupActivityModule_ProvideSignupPresenterFactory.proxyProvideSignupPresenter(
          seedInstance, getSignupModelImpl());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final SignupActivitySubcomponentBuilder builder) {
      this.seedInstance = builder.seedInstance;
    }

    @Override
    public void inject(SignupActivity arg0) {
      injectSignupActivity(arg0);
    }

    private SignupActivity injectSignupActivity(SignupActivity instance) {
      DaggerAppCompatActivity_MembersInjector.injectSupportFragmentInjector(
          instance, getDispatchingAndroidInjectorOfFragment());
      DaggerAppCompatActivity_MembersInjector.injectFrameworkFragmentInjector(
          instance, DaggerAppComponent.this.getDispatchingAndroidInjectorOfFragment());
      SignupActivity_MembersInjector.injectPresenter(instance, getSignupPresenter());
      SignupActivity_MembersInjector.injectContext(instance, DaggerAppComponent.this.application);
      return instance;
    }
  }

  private final class AlmostThereActivitySubcomponentBuilder
      extends ActivityBuilder_BindAlmostThereActivity.AlmostThereActivitySubcomponent.Builder {
    private AlmostThereActivity seedInstance;

    @Override
    public ActivityBuilder_BindAlmostThereActivity.AlmostThereActivitySubcomponent build() {
      if (seedInstance == null) {
        throw new IllegalStateException(
            AlmostThereActivity.class.getCanonicalName() + " must be set");
      }
      return new AlmostThereActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(AlmostThereActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class AlmostThereActivitySubcomponentImpl
      implements ActivityBuilder_BindAlmostThereActivity.AlmostThereActivitySubcomponent {
    private AlmostThereActivity seedInstance;

    private AlmostThereActivitySubcomponentImpl(AlmostThereActivitySubcomponentBuilder builder) {
      initialize(builder);
    }

    private DispatchingAndroidInjector<android.support.v4.app.Fragment>
        getDispatchingAndroidInjectorOfFragment() {
      return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
          Collections
              .<Class<? extends android.support.v4.app.Fragment>,
                  Provider<AndroidInjector.Factory<? extends android.support.v4.app.Fragment>>>
                  emptyMap());
    }

    private AlmostThereModelImpl getAlmostThereModelImpl() {
      return new AlmostThereModelImpl(
          AppModule_ProvideFirebaseAuthFactory.proxyProvideFirebaseAuth(),
          AppModule_ProvideFirebaseFirestoreFactory.proxyProvideFirebaseFirestore());
    }

    private AlmostTherePresenter getAlmostTherePresenter() {
      return AlmostThereActivityModule_ProvideAlmostTherePresenterFactory
          .proxyProvideAlmostTherePresenter(seedInstance, getAlmostThereModelImpl());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final AlmostThereActivitySubcomponentBuilder builder) {
      this.seedInstance = builder.seedInstance;
    }

    @Override
    public void inject(AlmostThereActivity arg0) {
      injectAlmostThereActivity(arg0);
    }

    private AlmostThereActivity injectAlmostThereActivity(AlmostThereActivity instance) {
      DaggerAppCompatActivity_MembersInjector.injectSupportFragmentInjector(
          instance, getDispatchingAndroidInjectorOfFragment());
      DaggerAppCompatActivity_MembersInjector.injectFrameworkFragmentInjector(
          instance, DaggerAppComponent.this.getDispatchingAndroidInjectorOfFragment());
      AlmostThereActivity_MembersInjector.injectPresenter(instance, getAlmostTherePresenter());
      AlmostThereActivity_MembersInjector.injectContext(
          instance, DaggerAppComponent.this.application);
      return instance;
    }
  }

  private final class HomepageActivitySubcomponentBuilder
      extends ActivityBuilder_BindHomepageActivity.HomepageActivitySubcomponent.Builder {
    private HomepageActivity seedInstance;

    @Override
    public ActivityBuilder_BindHomepageActivity.HomepageActivitySubcomponent build() {
      if (seedInstance == null) {
        throw new IllegalStateException(HomepageActivity.class.getCanonicalName() + " must be set");
      }
      return new HomepageActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(HomepageActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class HomepageActivitySubcomponentImpl
      implements ActivityBuilder_BindHomepageActivity.HomepageActivitySubcomponent {
    private HomepageActivitySubcomponentImpl(HomepageActivitySubcomponentBuilder builder) {}

    private DispatchingAndroidInjector<android.support.v4.app.Fragment>
        getDispatchingAndroidInjectorOfFragment() {
      return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
          Collections
              .<Class<? extends android.support.v4.app.Fragment>,
                  Provider<AndroidInjector.Factory<? extends android.support.v4.app.Fragment>>>
                  emptyMap());
    }

    @Override
    public void inject(HomepageActivity arg0) {
      injectHomepageActivity(arg0);
    }

    private HomepageActivity injectHomepageActivity(HomepageActivity instance) {
      DaggerAppCompatActivity_MembersInjector.injectSupportFragmentInjector(
          instance, getDispatchingAndroidInjectorOfFragment());
      DaggerAppCompatActivity_MembersInjector.injectFrameworkFragmentInjector(
          instance, DaggerAppComponent.this.getDispatchingAndroidInjectorOfFragment());
      return instance;
    }
  }

  private final class GoogleLoginActivitySubcomponentBuilder
      extends ActivityBuilder_BindGoogleLoginActivity.GoogleLoginActivitySubcomponent.Builder {
    private GoogleLoginActivity seedInstance;

    @Override
    public ActivityBuilder_BindGoogleLoginActivity.GoogleLoginActivitySubcomponent build() {
      if (seedInstance == null) {
        throw new IllegalStateException(
            GoogleLoginActivity.class.getCanonicalName() + " must be set");
      }
      return new GoogleLoginActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(GoogleLoginActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class GoogleLoginActivitySubcomponentImpl
      implements ActivityBuilder_BindGoogleLoginActivity.GoogleLoginActivitySubcomponent {
    private GoogleLoginActivity seedInstance;

    private GoogleLoginActivitySubcomponentImpl(GoogleLoginActivitySubcomponentBuilder builder) {
      initialize(builder);
    }

    private DispatchingAndroidInjector<android.support.v4.app.Fragment>
        getDispatchingAndroidInjectorOfFragment() {
      return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
          Collections
              .<Class<? extends android.support.v4.app.Fragment>,
                  Provider<AndroidInjector.Factory<? extends android.support.v4.app.Fragment>>>
                  emptyMap());
    }

    private GoogleLoginModelImpl getGoogleLoginModelImpl() {
      return new GoogleLoginModelImpl(
          AppModule_ProvideFirebaseAuthFactory.proxyProvideFirebaseAuth(),
          AppModule_ProvideFirebaseFirestoreFactory.proxyProvideFirebaseFirestore());
    }

    private GoogleLoginPresenter getGoogleLoginPresenter() {
      return GoogleLoginActivityModule_ProvideGoogleLoginPresenterFactory
          .proxyProvideGoogleLoginPresenter(seedInstance, getGoogleLoginModelImpl());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final GoogleLoginActivitySubcomponentBuilder builder) {
      this.seedInstance = builder.seedInstance;
    }

    @Override
    public void inject(GoogleLoginActivity arg0) {
      injectGoogleLoginActivity(arg0);
    }

    private GoogleLoginActivity injectGoogleLoginActivity(GoogleLoginActivity instance) {
      DaggerAppCompatActivity_MembersInjector.injectSupportFragmentInjector(
          instance, getDispatchingAndroidInjectorOfFragment());
      DaggerAppCompatActivity_MembersInjector.injectFrameworkFragmentInjector(
          instance, DaggerAppComponent.this.getDispatchingAndroidInjectorOfFragment());
      GoogleLoginActivity_MembersInjector.injectPresenter(instance, getGoogleLoginPresenter());
      GoogleLoginActivity_MembersInjector.injectContext(
          instance, DaggerAppComponent.this.application);
      return instance;
    }
  }

  private final class FacebookLoginActivitySubcomponentBuilder
      extends ActivityBuilder_BindFacebookLoginActivity.FacebookLoginActivitySubcomponent.Builder {
    private FacebookLoginActivity seedInstance;

    @Override
    public ActivityBuilder_BindFacebookLoginActivity.FacebookLoginActivitySubcomponent build() {
      if (seedInstance == null) {
        throw new IllegalStateException(
            FacebookLoginActivity.class.getCanonicalName() + " must be set");
      }
      return new FacebookLoginActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(FacebookLoginActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class FacebookLoginActivitySubcomponentImpl
      implements ActivityBuilder_BindFacebookLoginActivity.FacebookLoginActivitySubcomponent {
    private FacebookLoginActivity seedInstance;

    private FacebookLoginActivitySubcomponentImpl(
        FacebookLoginActivitySubcomponentBuilder builder) {
      initialize(builder);
    }

    private DispatchingAndroidInjector<android.support.v4.app.Fragment>
        getDispatchingAndroidInjectorOfFragment() {
      return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
          Collections
              .<Class<? extends android.support.v4.app.Fragment>,
                  Provider<AndroidInjector.Factory<? extends android.support.v4.app.Fragment>>>
                  emptyMap());
    }

    private FacebookLoginModelImpl getFacebookLoginModelImpl() {
      return new FacebookLoginModelImpl(
          AppModule_ProvideFirebaseAuthFactory.proxyProvideFirebaseAuth(),
          AppModule_ProvideFirebaseFirestoreFactory.proxyProvideFirebaseFirestore());
    }

    private FacebookLoginPresenter getFacebookLoginPresenter() {
      return FacebookLoginActivityModule_ProvideFacebookLoginPresenterFactory
          .proxyProvideFacebookLoginPresenter(seedInstance, getFacebookLoginModelImpl());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final FacebookLoginActivitySubcomponentBuilder builder) {
      this.seedInstance = builder.seedInstance;
    }

    @Override
    public void inject(FacebookLoginActivity arg0) {
      injectFacebookLoginActivity(arg0);
    }

    private FacebookLoginActivity injectFacebookLoginActivity(FacebookLoginActivity instance) {
      DaggerAppCompatActivity_MembersInjector.injectSupportFragmentInjector(
          instance, getDispatchingAndroidInjectorOfFragment());
      DaggerAppCompatActivity_MembersInjector.injectFrameworkFragmentInjector(
          instance, DaggerAppComponent.this.getDispatchingAndroidInjectorOfFragment());
      FacebookLoginActivity_MembersInjector.injectPresenter(instance, getFacebookLoginPresenter());
      FacebookLoginActivity_MembersInjector.injectContext(
          instance, DaggerAppComponent.this.application);
      return instance;
    }
  }
}
