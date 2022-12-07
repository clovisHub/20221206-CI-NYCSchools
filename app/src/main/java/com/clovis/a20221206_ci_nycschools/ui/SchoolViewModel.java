package com.clovis.a20221206_ci_nycschools.ui;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.clovis.dataprovider.cases.SchoolSATCase;
import com.clovis.dataprovider.cases.SchoolsInterface;
import com.clovis.dataprovider.cases.SchoolsListCase;
import com.clovis.dataprovider.models.NewYorkCitySchool;
import com.clovis.dataprovider.models.SchoolSATData;

import java.util.List;


public class SchoolViewModel extends AndroidViewModel implements SchoolsInterface {

    private MutableLiveData<List<NewYorkCitySchool>> liveSchoolsList;
    private MutableLiveData<List<SchoolSATData>> liveSchoolsScoresList;
    private MutableLiveData<SchoolSATData> liveSchoolScores;

    public SchoolViewModel(@NonNull Application application) {
        super(application);
        liveSchoolsList = new MutableLiveData<>();
        liveSchoolsScoresList = new MutableLiveData<>();
        liveSchoolScores = new MutableLiveData<>();
    }

    public void retrieveHighSchoolsList() {
        SchoolsListCase schoolCase =  new SchoolsListCase();
        schoolCase.setSchoolUpdater(this);
        schoolCase.fetchSchool();
    }

    public void retrieveSATScores() {
        SchoolSATCase schoolSATCase =  new  SchoolSATCase();
        schoolSATCase.setSchoolUpdater(this);
        schoolSATCase.fetchSchoolsSAT();
    }

    public LiveData<List<NewYorkCitySchool>> getSchoolsList() {
        return liveSchoolsList;
    }

    public LiveData<List<SchoolSATData>> getSchoolsScoresList() {
        return liveSchoolsScoresList;
    }

    public LiveData<SchoolSATData> getSchoolScores(String dbn) {
        List<SchoolSATData> schoolSAT = new SchoolSATCase().getSchoolsSATs();
        if(null == schoolSAT) {
            new SchoolSATCase().fetchSchoolsSAT();
        } else {
            for(int index = 0; index < schoolSAT.size(); index++) {
                if(schoolSAT.get(index).getDbn().equalsIgnoreCase(dbn)) {
                    liveSchoolScores.postValue(schoolSAT.get(index));
                    break;
                }
            }
        }

        return liveSchoolScores;
    }

    @Override
    public void updateSchoolsList(List<NewYorkCitySchool> schoolsList) {
        liveSchoolsList.postValue(schoolsList);
    }

    @Override
    public void updateSchoolsSATScores(List<SchoolSATData> schoolsScores) {
        liveSchoolsScoresList.postValue(schoolsScores);
    }

}

