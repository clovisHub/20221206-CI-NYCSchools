package com.clovis.a20221206_ci_nycschools.ui.schoolsList;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.clovis.a20221206_ci_nycschools.R;
import com.clovis.a20221206_ci_nycschools.ui.school.SchoolSATActivity;
import com.clovis.dataprovider.models.NewYorkCitySchool;


import java.util.ArrayList;
import java.util.List;


public class SchoolsListAdapter  extends RecyclerView.Adapter<SchoolsListAdapter.ViewHolder> {

    List<NewYorkCitySchool> mNewYorkSchools = new ArrayList<>();

    public void  setSchoolsListAdapter(List<NewYorkCitySchool> schoolsList) {
        mNewYorkSchools = schoolsList;
        notifyItemRangeInserted(0, schoolsList.size());
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View contactView = inflater.inflate(R.layout.item_school, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        NewYorkCitySchool school = mNewYorkSchools.get(position);

        // Set item views based on your views and data model
        TextView highSchoolNameTv= holder.nameTextView;
        TextView contentTextView = holder.phoneTextView;
        TextView footerTextView = holder.emailTextView;

        highSchoolNameTv.setText(school.getSchoolName());
        contentTextView.setText(school.getPhoneNumber());
        footerTextView.setText(school.getSchoolEmail());

        if(null == school.getPhoneNumber() || school.getPhoneNumber().isEmpty()) {
            highSchoolNameTv.setText("No Phone Listed");
        }

        if(null == school.getSchoolEmail() || school.getSchoolEmail().isEmpty()) {
            footerTextView.setText("No Email Listed");
        }

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), SchoolSATActivity.class);
                intent.putExtra("dbn",mNewYorkSchools
                        .get(holder.getAdapterPosition()).getDbn());
                intent.putExtra("schoolName",mNewYorkSchools
                        .get(holder.getAdapterPosition()).getSchoolName());
                v.getContext().startActivity(intent);
            }
        });

    }

    // Returns the total count of items in the list
    @Override
    public int getItemCount() {
        return mNewYorkSchools.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView nameTextView;
        public TextView phoneTextView;
        public TextView emailTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.schoolNameId);
            phoneTextView =  itemView.findViewById(R.id.schoolPhoneId);
            emailTextView = itemView.findViewById(R.id.schoolEmailId);

        }
    }
}

