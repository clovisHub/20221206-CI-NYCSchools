package com.clovis.dataprovider.net.request.builders;

import okhttp3.Request;

public abstract class RequestBuilder {

    protected String BASE_URL = "https://data.cityofnewyork.us/resource/";

    public abstract  Request getHighSchoolsSATRequest();

    public abstract  Request getNewYorkHighSchoolsListRequest();
}
