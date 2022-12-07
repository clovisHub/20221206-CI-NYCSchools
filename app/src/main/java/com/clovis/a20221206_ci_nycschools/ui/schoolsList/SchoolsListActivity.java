package com.clovis.a20221206_ci_nycschools.ui.schoolsList;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.clovis.a20221206_ci_nycschools.R;
import com.clovis.dataprovider.models.NewYorkCitySchool;

import java.util.List;

@SuppressLint({"MissingInflatedId", "LocalSuppress"})
public class SchoolsListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schools_list);

        RecyclerView schoolsRecycler = (RecyclerView) findViewById(R.id.schoolsRecyclerId);
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBarId);
        progressBar.setVisibility(View.VISIBLE);


        SchoolsListAdapter adapter = new SchoolsListAdapter();
        schoolsRecycler.setAdapter(adapter);
        schoolsRecycler.setLayoutManager(new LinearLayoutManager(this));
        schoolsRecycler.setHasFixedSize(true);

        SchoolsListViewModel schoolsListViewModel = new SchoolsListViewModel(this.getApplication());
        schoolsListViewModel.retrieveHighSchoolsList();
        schoolsListViewModel.getSchoolsList().observe(this, new Observer<List<NewYorkCitySchool>>() {
            @Override
            public void onChanged(@Nullable List<NewYorkCitySchool> newYorkCitySchools) {
                if(null != newYorkCitySchools) {
                    progressBar.setVisibility(View.GONE);
                    adapter.setSchoolsListAdapter(newYorkCitySchools);
                }
            }
        });
    }
}