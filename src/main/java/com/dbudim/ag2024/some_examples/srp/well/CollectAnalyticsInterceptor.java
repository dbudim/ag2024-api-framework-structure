package com.dbudim.ag2024.some_examples.srp.well;

import okhttp3.Interceptor;
import okhttp3.Response;

import java.io.IOException;

public class CollectAnalyticsInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        //code to push data to analytics storage
        return chain.proceed(chain.request());
    }
}
