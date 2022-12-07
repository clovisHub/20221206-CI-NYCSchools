package com.clovis.dataprovider.net.request.builders;

import okhttp3.HttpUrl;
import okhttp3.Request;

public class HighSchoolRequestBuilder extends RequestBuilder {


    @Override
    public Request getHighSchoolsSATRequest() {
        StringBuilder schoolsUrl = new StringBuilder();
        schoolsUrl.append(BASE_URL);
        schoolsUrl.append("f9bf-2cp4.json");

        Request request = new Request.Builder()
                .url(schoolsUrl.toString())
                .get()
                .build();

        return request;
    }

    @Override
    public Request getNewYorkHighSchoolsListRequest() {

        StringBuilder schoolsUrl = new StringBuilder();
        schoolsUrl.append(BASE_URL);
        schoolsUrl.append("s3k6-pzi2.json");

        HttpUrl.Builder urlBuilder
                = HttpUrl.parse(schoolsUrl.toString())
                .newBuilder();

        String schoolListUrl = urlBuilder.build().toString();

        Request request = new Request.Builder()
                .url(schoolListUrl)
                .get()
                .build();

        return request;
    }
}
