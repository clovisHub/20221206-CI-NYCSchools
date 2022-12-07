package com.clovis.dataprovider.cases;



import com.clovis.dataprovider.models.NewYorkCitySchool;
import com.clovis.dataprovider.repositories.NewYorkCityHighSchoolRepository;

import java.util.List;
import java.util.Stack;

public class SchoolCase {

    private static NewYorkCitySchool school;
    private static List<String> exceptionList;
    private static Stack<Integer> errorStack;
    private NewYorkCityHighSchoolRepository repository;

    public SchoolCase() {
        repository = new NewYorkCityHighSchoolRepository();
    }

    public void fetchSchool() {
        repository.fetchSATScores();
    }

    public NewYorkCitySchool getHighSchoolsList() {
        return school;
    }


    public void setErrorCase(int error) {
        errorStack.add(error);
    }

    public void setExceptionCase(String exceptionMessage) {
        exceptionList.add(exceptionMessage);
    }
}
