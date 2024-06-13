package com.kaaddevelopers.myprescriptor.prescription.view;

import com.kaaddevelopers.myprescriptor.prescription.core.Prescription;

import java.util.List;

/**
 * Created by Abid-Temp on 30-Dec-17.
 */

public interface PrescriptionView {

    void displayPrescriptions(List<Prescription> prescriptionList);

    void displayNoPrescription();
}
