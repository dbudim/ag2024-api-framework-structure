package com.dbudim.ag2024.client;

import com.dbudim.ag2024.client.wrappers.BooksApi;
import com.dbudim.ag2024.client.wrappers.ShelvesApi;

public class BookStack {

    public BooksApi books;
    public ShelvesApi shelves;

    public BookStack(BookStackRestClient client) {
        this.books = new BooksApi(client);
        this.shelves = new ShelvesApi(client);
    }
}
