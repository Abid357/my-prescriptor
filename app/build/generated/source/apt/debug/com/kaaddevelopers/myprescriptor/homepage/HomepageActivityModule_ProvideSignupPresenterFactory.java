package com.kaaddevelopers.myprescriptor.homepage;

import com.kaaddevelopers.myprescriptor.homepage.fragment.prescription.model.PrescriptionModel;
import com.kaaddevelopers.myprescriptor.homepage.fragment.prescription.presenter.PrescriptionPresenter;
import com.kaaddevelopers.myprescriptor.homepage.fragment.prescription.view.PrescriptionView;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class HomepageActivityModule_ProvideSignupPresenterFactory
    implements Factory<PrescriptionPresenter> {
  private final Provider<PrescriptionView> prescriptionViewProvider;

  private final Provider<PrescriptionModel> prescriptionModelProvider;

  public HomepageActivityModule_ProvideSignupPresenterFactory(
      Provider<PrescriptionView> prescriptionViewProvider,
      Provider<PrescriptionModel> prescriptionModelProvider) {
    this.prescriptionViewProvider = prescriptionViewProvider;
    this.prescriptionModelProvider = prescriptionModelProvider;
  }

  @Override
  public PrescriptionPresenter get() {
    return Preconditions.checkNotNull(
        HomepageActivityModule.provideSignupPresenter(
            prescriptionViewProvider.get(), prescriptionModelProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static HomepageActivityModule_ProvideSignupPresenterFactory create(
      Provider<PrescriptionView> prescriptionViewProvider,
      Provider<PrescriptionModel> prescriptionModelProvider) {
    return new HomepageActivityModule_ProvideSignupPresenterFactory(
        prescriptionViewProvider, prescriptionModelProvider);
  }

  public static PrescriptionPresenter proxyProvideSignupPresenter(
      PrescriptionView prescriptionView, PrescriptionModel prescriptionModel) {
    return Preconditions.checkNotNull(
        HomepageActivityModule.provideSignupPresenter(prescriptionView, prescriptionModel),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
