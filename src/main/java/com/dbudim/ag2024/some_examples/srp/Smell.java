package com.dbudim.ag2024.some_examples.srp;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class Smell implements Interceptor {

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request modified = chain.request()
                .newBuilder()
                //add user agent header
                .addHeader("user-agent", "awesome test agent")
                //add authorization header
                .addHeader("Authorization", "Bearer {token}")
                .build();
        //push analytics data about request
        pushData(modified);
        return chain.proceed(modified);
    }


    private void pushData(Request request) {
        //code to push data to analytics storage
    }
}
