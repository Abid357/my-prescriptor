package com.kaaddevelopers.myprescriptor.homepage.fragment.prescription.presenter;

import com.kaaddevelopers.myprescriptor.homepage.fragment.prescription.model.PrescriptionModel;
import com.kaaddevelopers.myprescriptor.homepage.fragment.prescription.view.PrescriptionView;

import javax.inject.Inject;

/**
 * Created by Abid-Temp on 09-Jan-18.
 */

public class PrescriptionPresenterImpl implements PrescriptionPresenter {

    PrescriptionView view;
    PrescriptionModel model;

    @Inject
    public PrescriptionPresenterImpl(PrescriptionView view, PrescriptionModel model){
        this.view = view;
        this.model = model;
    }


    @Override
    public void takeView(PrescriptionView view) {

    }

    @Override
    public void dropView() {

    }
}
