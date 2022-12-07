package com.clovis.a20221206_ci_nycschools.ui.school;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;

import com.clovis.a20221206_ci_nycschools.R;
import com.clovis.a20221206_ci_nycschools.ui.schoolsList.SchoolsListViewModel;
import com.clovis.dataprovider.models.SchoolSATData;


@SuppressLint({"MissingInflatedId", "LocalSuppress"})
public class SchoolSATActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = this.getIntent();
        setContentView(R.layout.activity_school);
        TextView SchoolName = findViewById(R.id.satSchoolNameId);
        SchoolName.setText(intent.getStringExtra("schoolName"));
        TextView matchScore = findViewById(R.id.satMathScoreId);
        TextView writingScore = findViewById(R.id.satWritingScoreId);
        TextView readingScore = findViewById(R.id.satReadingScoreId);
        String dbn = intent.getStringExtra("dbn");

        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBarId);
        progressBar.setVisibility(View.VISIBLE);

        if(dbn.isEmpty()) {
            Log.d("yorkNews", dbn + " "+intent.getStringExtra("schoolName"));
        }
        Handler mHandler = new Handler();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 40; i++) {
                    final int currentProgressCount = i;
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //Update the value background thread to UI thread
                }
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        progressBar.setVisibility(View.GONE);
                        if(matchScore.getText().toString().isEmpty()) {
                            matchScore.setText("No Score Available");
                        }

                        if(writingScore.getText().toString().isEmpty()) {
                            writingScore.setText("No Score Available");
                        }

                        if(readingScore.getText().toString().isEmpty()) {
                            readingScore.setText("No Score Available");
                        }
                    }
                });
            }
        }).start();

        SchoolsListViewModel schoolsListViewModel = new SchoolsListViewModel(this.getApplication());
        schoolsListViewModel.retrieveSATScores();
        schoolsListViewModel.getSchoolScores(dbn)
                .observe(this, new Observer<SchoolSATData>() {
            @Override
            public void onChanged(SchoolSATData schoolSATData) {
                if(null != schoolSATData) {
                    progressBar.setVisibility(View.GONE);
                    matchScore.setText(schoolSATData.getSatMathAvgScore());
                    writingScore.setText(schoolSATData.getSatWritingAvgScore());
                    readingScore.setText(schoolSATData.getSatCriticalReadingAvgScore());
                }
            }
        });
    }
}