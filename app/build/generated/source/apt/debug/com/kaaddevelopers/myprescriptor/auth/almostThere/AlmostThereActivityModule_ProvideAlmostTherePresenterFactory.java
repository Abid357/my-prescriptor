package com.kaaddevelopers.myprescriptor.auth.almostThere;

import com.kaaddevelopers.myprescriptor.auth.almostThere.model.AlmostThereModel;
import com.kaaddevelopers.myprescriptor.auth.almostThere.presenter.AlmostTherePresenter;
import com.kaaddevelopers.myprescriptor.auth.almostThere.view.AlmostThereView;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AlmostThereActivityModule_ProvideAlmostTherePresenterFactory
    implements Factory<AlmostTherePresenter> {
  private final Provider<AlmostThereView> almostThereViewProvider;

  private final Provider<AlmostThereModel> almostThereModelProvider;

  public AlmostThereActivityModule_ProvideAlmostTherePresenterFactory(
      Provider<AlmostThereView> almostThereViewProvider,
      Provider<AlmostThereModel> almostThereModelProvider) {
    this.almostThereViewProvider = almostThereViewProvider;
    this.almostThereModelProvider = almostThereModelProvider;
  }

  @Override
  public AlmostTherePresenter get() {
    return Preconditions.checkNotNull(
        AlmostThereActivityModule.provideAlmostTherePresenter(
            almostThereViewProvider.get(), almostThereModelProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static AlmostThereActivityModule_ProvideAlmostTherePresenterFactory create(
      Provider<AlmostThereView> almostThereViewProvider,
      Provider<AlmostThereModel> almostThereModelProvider) {
    return new AlmostThereActivityModule_ProvideAlmostTherePresenterFactory(
        almostThereViewProvider, almostThereModelProvider);
  }

  public static AlmostTherePresenter proxyProvideAlmostTherePresenter(
      AlmostThereView almostThereView, AlmostThereModel almostThereModel) {
    return Preconditions.checkNotNull(
        AlmostThereActivityModule.provideAlmostTherePresenter(almostThereView, almostThereModel),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
