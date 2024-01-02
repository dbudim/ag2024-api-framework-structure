package com.dbudim.ag2024.client.interceptors;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class AuthInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request authentificated = chain.request().newBuilder()
                .addHeader("Authorization", "Token BfppyRziejCdv2PM7DAxIPvdkmLMagJO:7vvq3jkXDTSpGeInbl2gbRO5N2cn6EYW")
                .build();
        return chain.proceed(authentificated);
    }
}
