package com.dbudim.ag2024.client.interceptors;

import com.moczul.ok2curl.CurlBuilder;
import okhttp3.Interceptor;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * Created by dbudim on 17.12.2023
 */

public class CurlLogInterceptor implements Interceptor {

    private Logger logger = LoggerFactory.getLogger(CurlLogInterceptor.class);

    @Override
    public Response intercept(Chain chain) throws IOException {
        String curl = new CurlBuilder(chain.request()).build();
        logger.info("Execute: " + System.lineSeparator() + curl + System.lineSeparator());

        Response response = chain.proceed(chain.request());
        //String body = response.peekBody(Long.MAX_VALUE).string();
        //logger.info("Response:" + System.lineSeparator() + body);
        return response;
    }

}
