package com.dbudim.ag2024.some_examples.srp.well;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class AuthorizationInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request modified = chain.request()
                .newBuilder()
                .addHeader("Authorization", "Bearer {token}")
                .build();
        return chain.proceed(modified);
    }
}
