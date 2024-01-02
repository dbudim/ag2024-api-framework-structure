package com.dbudim.ag2024.client.interceptors;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class AddUserAgentInterceptor implements Interceptor {

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request modifiedRequest = chain.request()
                .newBuilder()
                .addHeader("user-agent", "awesome test")
                .build();
        return chain.proceed(modifiedRequest);
    }

}
