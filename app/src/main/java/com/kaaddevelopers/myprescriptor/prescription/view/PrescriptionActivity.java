package com.kaaddevelopers.myprescriptor.prescription.view;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.kaaddevelopers.myprescriptor.R;
import com.kaaddevelopers.myprescriptor.prescription.core.Prescription;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import dagger.android.support.DaggerAppCompatActivity;

import durdinapps.rxfirebase2.RxFirebaseAuth;


public class PrescriptionActivity extends DaggerAppCompatActivity implements PrescriptionView {
    @Override
    public void displayPrescriptions(List<Prescription> prescriptionList) {

    }

    @Override
    public void displayNoPrescription() {

    }


//    ArrayList<Prescription> prescriptions;
//    private prescription_adapter adapter;
//
//    @Inject
//    PrescriptionPresenter prescriptionPresenter;
//
//    @BindView(R.id.prescription_recyclerview)
//    RecyclerView rvPrescriptions;
//
//    private Unbinder unbinder;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_prescription);
//
//        // Find the toolbar view inside the activity layout
//        Toolbar toolbar = (Toolbar) findViewById(R.id.prescription_toolbar);
//        // Sets the Toolbar to act as the ActionBar for this Activity window.
//        // Make sure the toolbar exists in the activity and is not null
//        setSupportActionBar(toolbar);
//        unbinder = ButterKnife.bind(this);
//
//        // Initialize prescriptions
//       // prescriptions = Prescription.createPrescriptionsList(20);
//
//        // Create adapter passing in the sample user data
//        adapter = new prescription_adapter(this, prescriptions);
//
//        // Attach the adapter to the recyclerview to populate items
//        rvPrescriptions.setAdapter(adapter);
//
//        // Set layout manager to position the items
//        rvPrescriptions.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));
//
//
//    }
//
//    // Menu icons are inflated just as they were with actionbar
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main,menu);
//        return true;
//    }
//
//    //some code replicated from onCreate method. To be optimized
//    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
//        View layout=inflater.inflate(R.layout.activity_prescription,container,false);
//        rvPrescriptions=(RecyclerView)layout.findViewById(R.id.prescription_recyclerview);
//        adapter=new prescription_adapter(getApplicationContext(),prescriptions);
//        rvPrescriptions.setAdapter(adapter);
//
//        GridLayoutManager gridLayoutManager=new GridLayoutManager (getApplicationContext(),2);
//        rvPrescriptions.setLayoutManager(gridLayoutManager);
//
//        return layout;
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        unbinder.unbind();
//    }
//
//    @Override
//    public void displayPrescriptions(List<Prescription> prescriptionList) {
//
//    }
//
//    @Override
//    public void displayNoPrescription() {
//        Toast.makeText(this, "Prescription list is empty", Toast.LENGTH_SHORT).show();
//    }
}
