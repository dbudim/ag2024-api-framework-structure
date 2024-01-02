package com.dbudim.ag2024.some_examples.srp.well;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class UserAgentInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request modified = chain.request()
                .newBuilder()
                .addHeader("user-agent", "awesome test agent")
                .build();
        return chain.proceed(modified);
    }
}
