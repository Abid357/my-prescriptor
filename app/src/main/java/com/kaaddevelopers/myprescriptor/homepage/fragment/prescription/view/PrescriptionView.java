package com.kaaddevelopers.myprescriptor.homepage.fragment.prescription.view;

import com.kaaddevelopers.myprescriptor.homepage.fragment.prescription.presenter.PrescriptionPresenter;
import com.kaaddevelopers.myprescriptor.homepage.base.BaseView;

/**
 * Created by Abid-Temp on 09-Jan-18.
 */

public interface PrescriptionView extends BaseView<PrescriptionPresenter> {
    void populate();
}
