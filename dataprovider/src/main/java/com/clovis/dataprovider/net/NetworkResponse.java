package com.clovis.dataprovider.net;

import okhttp3.Response;

public abstract class NetworkResponse {
    protected Response response;

    protected void setResponse(Response httpResponse) {
        response = httpResponse;
    }
    protected Response getResponse() {
       return response;
    }
}

