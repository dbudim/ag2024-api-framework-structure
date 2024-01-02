package com.dbudim.ag2024.client.services;

import com.dbudim.ag2024.client.models.DataList;
import com.dbudim.ag2024.client.models.Shelve;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

import java.util.List;

public interface ShelvesService {

    @GET("shelves")
    Call<DataList<Shelve>> getShelves();

    @GET("shelves/{id}")
    Call<Shelve> getShelve(@Path("id") String id);

    @POST("shelves")
    Call<Shelve> createShelve(@Body Shelve shelve);

    @DELETE("shelves/{id}")
    Call<Void> deleteShelve(@Path("id") String id);

}
