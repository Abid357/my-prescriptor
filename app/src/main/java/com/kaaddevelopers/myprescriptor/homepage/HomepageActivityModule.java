package com.kaaddevelopers.myprescriptor.homepage;

import com.kaaddevelopers.myprescriptor.homepage.fragment.prescription.model.PrescriptionModel;
import com.kaaddevelopers.myprescriptor.homepage.fragment.prescription.presenter.PrescriptionPresenter;
import com.kaaddevelopers.myprescriptor.homepage.fragment.prescription.presenter.PrescriptionPresenterImpl;
import com.kaaddevelopers.myprescriptor.homepage.fragment.prescription.view.PrescriptionView;
import com.kaaddevelopers.myprescriptor.homepage.view.HomepageActivity;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Kamil Kamili CEO of KAAD Developers on 12/30/2017.
 */

@Module
public abstract class HomepageActivityModule {
    @Provides
    static PrescriptionPresenter provideSignupPresenter(PrescriptionView prescriptionView, PrescriptionModel prescriptionModel) {
        return new PrescriptionPresenterImpl(prescriptionView, prescriptionModel);
    }
}
