package com.dbudim.ag2024.client.wrappers;

import com.dbudim.ag2024.client.BookStackRestClient;
import com.dbudim.ag2024.client.models.Book;
import com.dbudim.ag2024.client.models.Shelve;
import com.dbudim.ag2024.utils.ExecutionUtils;

import java.util.List;

import static com.dbudim.ag2024.utils.ExecutionUtils.execute;

/**
 * Note: This is a placeholder class and does not contain actual implementation.
 */

public class ShelvesApi {

    private BookStackRestClient client;

    public ShelvesApi(BookStackRestClient client) {
        this.client = client;
    }

    public Shelve createShelve(String name, List<Book> books) {
        return execute(client.shelvesService.createShelve(new Shelve(name, books))).body();
    }

}
