package com.clovis.dataprovider.net.Listeners;

import okhttp3.Response;

public interface AbstractNetworkListener {
     void onSuccess(Response response);
     void onFailure(int error);
     void onException(String exceptionMessage);
}

