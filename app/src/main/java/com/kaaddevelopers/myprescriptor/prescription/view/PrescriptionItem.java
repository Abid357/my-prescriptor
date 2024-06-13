package com.kaaddevelopers.myprescriptor.prescription.view;

import com.kaaddevelopers.myprescriptor.prescription.core.Prescription;

/**
 * Created by Muhammed on 1/3/2018.
 */

public class PrescriptionItem {
    private int iconId;
    private Prescription prescription;


    public Prescription getPrescription() {
        return prescription;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }

    public int getIconId() {
        return iconId;
    }

    public void setIconId(int iconId) {
        this.iconId = iconId;
    }
}
