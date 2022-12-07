package com.clovis.dataprovider.repositories;


import com.clovis.dataprovider.cases.SchoolSATCase;
import com.clovis.dataprovider.cases.SchoolsListCase;
import com.clovis.dataprovider.models.NewYorkCitySchool;
import com.clovis.dataprovider.models.SchoolSATData;
import com.clovis.dataprovider.net.Listeners.SchoolsListListener;
import com.clovis.dataprovider.net.Listeners.SchoolsSATListener;
import com.clovis.dataprovider.net.NetworkCaller;
import com.clovis.dataprovider.net.request.builders.HighSchoolRequestBuilder;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Response;

public class NewYorkCityHighSchoolRepository extends Repository {

    NetworkCaller caller;

    private final SchoolsListListener schoolListener = new SchoolsListListener() {
        @Override
        public void onSuccess(Response response) {
            Type listOfMyClassObject = new TypeToken<ArrayList<NewYorkCitySchool>>() {}
                    .getType();
            Gson gson = new Gson();
            if(response.isSuccessful()) {
                List<NewYorkCitySchool> schools = gson
                        .fromJson(response.body().charStream(), listOfMyClassObject);
                new SchoolsListCase().setSchoolsListCase(schools);
            }
        }

        @Override
        public void onFailure(int error) {
            new SchoolsListCase().setErrorCase(error);
        }

        @Override public void onException(String exceptionMessage) {
            new SchoolsListCase().setExceptionCase(exceptionMessage);
        }
    };


    private final SchoolsSATListener schoolSATListener = new SchoolsSATListener() {
        @Override
        public void onSuccess(Response response) {
            Type listOfMyClassObject = new TypeToken<ArrayList<SchoolSATData>>() {}
                    .getType();
            Gson gson = new Gson();
            if(response.isSuccessful()) {
                List<SchoolSATData> schools = gson
                        .fromJson(response.body().charStream(), listOfMyClassObject);
                new SchoolSATCase().setSchoolsSATScoretCase(schools);
            }
        }

        @Override
        public void onFailure(int error) {
            new SchoolSATCase().setErrorCase(error);
        }

        @Override public void onException(String exceptionMessage) {
            new SchoolSATCase().setExceptionCase(exceptionMessage);
        }
    };

    public NewYorkCityHighSchoolRepository() {
        caller = new  NetworkCaller();
    }

    @Override
    public void fetchHighSchoolLists() {
        caller.makeAsyncHttpCall(schoolListener, new HighSchoolRequestBuilder()
                .getNewYorkHighSchoolsListRequest());
    }

    @Override
    public void fetchSATScores() {
        caller.makeAsyncHttpCall(schoolSATListener, new HighSchoolRequestBuilder()
                .getHighSchoolsSATRequest());
    }
}
