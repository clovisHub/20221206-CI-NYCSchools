package com.clovis.dataprovider.net;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

class NetworkCallerTest {

    protected String BASE_URL = "https://data.cityofnewyork.us/resource/";
    OkHttpClient client;

    @BeforeEach
    public void setUp() {
        OkHttpClient.Builder clientBuilder = new OkHttpClient.Builder();
        client = clientBuilder.build();
    }

    @Test
    public void whenGetHighSchoolsSATRequest_thenCorrect() {

        HttpUrl.Builder urlBuilder
                = HttpUrl.parse(BASE_URL + "f9bf-2cp4.json").newBuilder();

        String url = urlBuilder.build().toString();

        Request request = new Request.Builder()
                .url(url)
                .get()
                .build();

        Call call = client.newCall(request);
        call.enqueue(new Callback() {
            public void onResponse(Call call, Response response) throws IOException {
                assert(response.isSuccessful());
                assert(response.body().contentLength() > 0);
            }

            public void onFailure(Call call, IOException e) {
                fail();
            }
        });
    }

    @Test
    public void whenGetNewYorkHighSchoolsListRequest_thenCorrect() {

        HttpUrl.Builder urlBuilder
                = HttpUrl.parse(BASE_URL + "s3k6-pzi2.json")
                .newBuilder();
        String url = urlBuilder.build().toString();

        Request request = new Request.Builder()
                .url(url)
                .get()
                .build();

        Call call = client.newCall(request);
        call.enqueue(new Callback() {
            public void onResponse(Call call, Response response) throws IOException {
                assert(response.isSuccessful());
                assert(response.body().contentLength() > 0);
            }

            public void onFailure(Call call, IOException e) {
                fail();
            }
        });
    }

}