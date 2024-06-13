package com.kaaddevelopers.myprescriptor.activities;

import com.kaaddevelopers.myprescriptor.prescription.core.Prescription;
import com.kaaddevelopers.myprescriptor.prescription.presenter.PrescriptionPresenterImpl;
import com.kaaddevelopers.myprescriptor.prescription.repository.PrescriptionRepository;
import com.kaaddevelopers.myprescriptor.prescription.view.PrescriptionView;

import junit.framework.Assert;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Abid-Temp on 30-Dec-17.
 */
public class PrescriptionPresenterImplTest {

    /*
    test method checks if all prescriptions are passed successfully to View
     */
    @Test
    public void shouldPassPrescriptionsToView() {
        // given
        PrescriptionRepository prescriptionRepository = new MockPrescriptionRepository(false);
        CommonPresenter commonPresenter = new CommonPresenter(new CommonModel(null, prescriptionRepository));
        PrescriptionView view = new MockPrescriptionView();

        // when
        PrescriptionPresenterImpl presenter = new PrescriptionPresenterImpl(view, commonPresenter);
        presenter.getPrescriptions();

        // then
        Assert.assertEquals(true, ((MockPrescriptionView) view).displayPrescriptionsCalled);
    }

    /*
   test method checks if no prescription or empty prescription list is passed successfully to View
    */
    @Test
    public void shouldPassNoPrescriptionToView() {
        // given
        PrescriptionRepository prescriptionRepository = new MockPrescriptionRepository(true);
        CommonPresenter commonPresenter = new CommonPresenter(new CommonModel(null, prescriptionRepository));
        PrescriptionView view = new MockPrescriptionView();

        // when
        PrescriptionPresenterImpl presenter = new PrescriptionPresenterImpl(view, commonPresenter);
        presenter.getPrescriptions();

        // then
        Assert.assertEquals(true, ((MockPrescriptionView) view).displayNoPrescriptionCalled);
    }

    /*
    test method checks if a new prescription added from View is passed to Repository successfully
     */
    @Test
    public void shouldPassPrescriptionToRepository() {
        // given
        PrescriptionRepository prescriptionRepository = new MockPrescriptionRepository(true);
        CommonPresenter commonPresenter = new CommonPresenter(new CommonModel(null, prescriptionRepository));
        PrescriptionView prescriptionView = new MockPrescriptionView();

        // when
        PrescriptionPresenterImpl presenter = new PrescriptionPresenterImpl(prescriptionView, commonPresenter);
        presenter.createPrescription("Paracetemol", "Harry", 3, "mg", 'A');

        // then
        Assert.assertEquals(true, ((MockPrescriptionRepository) prescriptionRepository).savePrescriptionCalled);
    }

    /*
    private mock classes to recreate the production classes without modifying the original ones
     */
    private class MockPrescriptionView implements PrescriptionView {

        boolean displayPrescriptionsCalled;
        boolean displayNoPrescriptionCalled;

        @Override
        public void displayPrescriptions(List<Prescription> prescriptionList) {
            if (prescriptionList.size() == 3)
                displayPrescriptionsCalled = true;
        }

        @Override
        public void displayNoPrescription() {
            displayNoPrescriptionCalled = true;
        }
    }

    private class MockPrescriptionRepository implements PrescriptionRepository {

        boolean savePrescriptionCalled;
        private boolean isEmpty;

        public MockPrescriptionRepository(boolean isEmpty) {
            this.isEmpty = isEmpty;
        }

        @Override
        public List<Prescription> getPrescriptions() {
            if (isEmpty)
                return Collections.emptyList();
            else
                return Arrays.asList(new Prescription(), new Prescription(), new Prescription());
        }

        @Override
        public void savePrescription(Prescription prescription) {
            if (prescription.getName().equals("Paracetemol"))
                savePrescriptionCalled = true;
        }
    }
}