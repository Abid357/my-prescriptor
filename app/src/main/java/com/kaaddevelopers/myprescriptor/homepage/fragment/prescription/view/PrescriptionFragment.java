package com.kaaddevelopers.myprescriptor.homepage.fragment.prescription.view;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kaaddevelopers.myprescriptor.R;

import butterknife.BindView;
import dagger.android.DaggerFragment;

/**
 * Created by Abid-Temp on 09-Jan-18.
 */

public class PrescriptionFragment extends DaggerFragment implements PrescriptionView{
    // Store instance variables
    private String title;
    private int page;

    @BindView(R.id.prescriptionFragmentRecyclerView)
    RecyclerView recyclerView;

    // newInstance constructor for creating fragment with arguments
    public static PrescriptionFragment newInstance(int page, String title) {
        PrescriptionFragment prescriptionFragment = new PrescriptionFragment();
        Bundle args = new Bundle();
        args.putInt("someInt", page);
        args.putString("someTitle", title);
        prescriptionFragment.setArguments(args);
        return prescriptionFragment;
    }

    // Store instance variables based on arguments passed
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt("someInt", 0);
        title = getArguments().getString("someTitle");
    }

    // Inflate the view for the fragment based on layout XML
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_prescription, container, false);
        int scrollPosition = 0;
        recyclerView.scrollToPosition(scrollPosition);
        return view;
    }

    @Override
    public void populate() {

    }
}

