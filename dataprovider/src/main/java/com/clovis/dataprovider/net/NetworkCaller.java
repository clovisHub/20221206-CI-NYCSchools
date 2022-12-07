package com.clovis.dataprovider.net;

import com.clovis.dataprovider.net.Listeners.AbstractNetworkListener;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class NetworkCaller {
    OkHttpClient client;

   public NetworkCaller() {
        OkHttpClient.Builder clientBuilder = new OkHttpClient.Builder();
        client = clientBuilder.build();
   }

    public void makeAsyncHttpCall(AbstractNetworkListener listener, Request request) {
          if(null == client) {
              OkHttpClient.Builder clientBuilder = new OkHttpClient.Builder();
              client = clientBuilder.build();
          }

          Call call = client.newCall(request);
          call.enqueue(new Callback() {
              @Override
              public void onFailure(@NotNull Call call, @NotNull IOException e) {
                  listener.onException(e.getMessage());
              }

              @Override
              public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                  if(response.isSuccessful()) {
                      listener.onSuccess(response);
                  } else {
                      listener.onFailure(response.code());
                  }
              }
          });
    }
}
