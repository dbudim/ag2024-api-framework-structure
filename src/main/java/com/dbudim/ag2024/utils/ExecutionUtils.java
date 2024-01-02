package com.dbudim.ag2024.utils;

import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;
import java.net.SocketTimeoutException;

public class ExecutionUtils<T> {

    public static <T> Response<T> execute(Call<T> call) {
        try {
            return call.execute();
        } catch (SocketTimeoutException e) {
            throw new RuntimeException("RESPONSE not received, " + call.request().method() + " " + call.request().url(), e);
        } catch (IOException e) {
            throw new RuntimeException("Failed to execute a request", e);
        }
    }
}


