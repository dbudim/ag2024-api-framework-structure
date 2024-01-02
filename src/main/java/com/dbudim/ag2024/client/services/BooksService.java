package com.dbudim.ag2024.client.services;

import com.dbudim.ag2024.client.models.Book;
import com.dbudim.ag2024.client.models.DataList;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface BooksService {

    @GET("books")
    Call<DataList<Book>> getBooks();

    @GET("books/{id}")
    Call<Book> getBook(@Path("id") String id);

    @POST("books")
    Call<Book> createBook(@Body Book shelve);

    @PUT("books/{id}")
    Call<Book> updateBook(@Path("id") String id, @Body Book book);

    @DELETE("books/{id}")
    Call<Void> deleteBook(@Path("id") String id);
}
