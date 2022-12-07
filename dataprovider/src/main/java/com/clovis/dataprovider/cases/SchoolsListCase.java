package com.clovis.dataprovider.cases;

import com.clovis.dataprovider.models.NewYorkCitySchool;
import com.clovis.dataprovider.repositories.NewYorkCityHighSchoolRepository;
import com.clovis.dataprovider.repositories.Repository;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SchoolsListCase {

    private static NewYorkCitySchool school;
    private static List<String> exceptionList = new ArrayList<>();
    private static Stack<Integer> errorStack = new Stack<>();
    private Repository repository;
    private static SchoolsInterface schoolUpdater;
    private static List<NewYorkCitySchool> schools;

    public SchoolsListCase() {
        repository = new NewYorkCityHighSchoolRepository();
    }

    public void setSchoolUpdater(SchoolsInterface schoolObserver) {
       schoolUpdater = schoolObserver;
    }

    public List<NewYorkCitySchool> getSchools() {
        return schools;
    }

    public void fetchSchool() {
        repository.fetchHighSchoolLists();
    }

    public void setSchoolsListCase(List<NewYorkCitySchool> schoolsList) {
        if(null != schoolsList) {
            schools = schoolsList;
            schoolUpdater.updateSchoolsList(schoolsList);
        }
    }

    public void setErrorCase(int error) {
        errorStack.add(error);
    }

    public void setExceptionCase(String exceptionMessage) {
        exceptionList.add(exceptionMessage);
    }
}

