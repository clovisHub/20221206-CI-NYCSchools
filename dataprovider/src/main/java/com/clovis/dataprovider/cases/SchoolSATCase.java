package com.clovis.dataprovider.cases;

import com.clovis.dataprovider.models.NewYorkCitySchool;
import com.clovis.dataprovider.models.SchoolSATData;
import com.clovis.dataprovider.repositories.NewYorkCityHighSchoolRepository;
import com.clovis.dataprovider.repositories.Repository;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SchoolSATCase {
    private static NewYorkCitySchool school;
    private static List<String> exceptionList = new ArrayList<>();
    private static Stack<Integer> errorStack = new Stack<>();
    private Repository repository;
    private static SchoolsInterface schoolUpdater;
    private static List<SchoolSATData> schoolsSAT;

    public SchoolSATCase() {
        repository = new NewYorkCityHighSchoolRepository();
    }

    public void setSchoolUpdater(SchoolsInterface schoolObserver) {
        schoolUpdater = schoolObserver;
    }

    public List<SchoolSATData> getSchoolsSATs() {
        return schoolsSAT;
    }

    public void fetchSchoolsSAT() {
        repository.fetchSATScores();
    }

    public void setSchoolsSATScoretCase(List<SchoolSATData> schoolsSATScores) {
        if(null != schoolsSATScores) {
            schoolsSAT = schoolsSATScores;
            schoolUpdater.updateSchoolsSATScores(schoolsSATScores);
        }
    }

    public void setErrorCase(int error) {
        errorStack.add(error);
    }

    public void setExceptionCase(String exceptionMessage) {
        exceptionList.add(exceptionMessage);
    }
}
