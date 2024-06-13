package com.kaaddevelopers.myprescriptor.prescription.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kaaddevelopers.myprescriptor.R;
import com.kaaddevelopers.myprescriptor.prescription.core.Prescription;
//import com.kaaddevelopers.myprescriptor.prescription.view.
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

/**
 * Created by Muhammed on 1/3/2018.
 */

public class prescription_adapter extends RecyclerView.Adapter <prescription_adapter.viewholder>{

    public class viewholder extends RecyclerView.ViewHolder {
        TextView prescriptionName;
        ImageView prescriptionImage;
        TextView info1,info2,info3;

        public viewholder (View itemView) {//constructor
            super(itemView);

            prescriptionName=(TextView)itemView.findViewById(R.id.prescription_name);//initialise
            prescriptionImage=(ImageView)itemView.findViewById(R.id.prescription_image);
            info1=(TextView)itemView.findViewById(R.id.row_info1);
            info2=(TextView)itemView.findViewById(R.id.row_info2);
            info3=(TextView)itemView.findViewById(R.id.row_info3);
        }
    }
    private LayoutInflater inflater;

    private List<Prescription> mPrescriptions= Collections.emptyList();//initialisation. takes care of null pointer exception

    public Context getmContext() {
        return mContext;
    }

    private Context mContext;

    public prescription_adapter(Context context,List<Prescription>prescriptions) {
        mContext=context;
        mPrescriptions=prescriptions;

        //inflater.from(context); ????
    }

    @Override
    public prescription_adapter.viewholder onCreateViewHolder(ViewGroup parent, int viewType) {//inflating a layout from XML and returning the holder
        Context context=parent.getContext();
        inflater=LayoutInflater.from(context);

        // Inflate the custom layout
        View prescriptionView=inflater.inflate(R.layout.prescription_row,parent,false);//get root for custom row

        viewholder holder=new viewholder(prescriptionView);//pass root inside viewholder to return a new viewholder instance
        return holder;
    }

    @Override
    public void onBindViewHolder(viewholder holder, int position) { // Involves populating data into the item through holder
        //get data model based on position
        Prescription current=mPrescriptions.get(position);

        // Set item views based on your views and data model
        //should I make local variables and set those instead?
        holder.prescriptionName.setText(current.getName());
        holder.prescriptionImage.setImageResource(R.drawable.user_icon);
        holder.info1.setText(current.getDOW());
        holder.info2.setText(current.getWRT_food());
        holder.info3.setText("12AM");

    }

    @Override
    public int getItemCount() {// Returns the total count of items in the list
        return mPrescriptions.size();
    }
}

