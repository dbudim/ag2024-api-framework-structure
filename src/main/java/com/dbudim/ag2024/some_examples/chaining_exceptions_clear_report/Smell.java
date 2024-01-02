package com.dbudim.ag2024.some_examples.chaining_exceptions_clear_report;

import com.dbudim.ag2024.client.BookStackRestClient;
import com.dbudim.ag2024.client.models.Book;

import static com.dbudim.ag2024.utils.ExecutionUtils.execute;


public class Smell {

    private BookStackRestClient client;

    public Smell(BookStackRestClient client) {
        this.client = client;
    }

    public Book findBookInShelve(String shelveName, String bookName) {
        return execute(client.shelvesService.getShelves()).body()
                .data.stream()
                .filter(shelve -> shelve.name.equals(shelveName))
                .findFirst()
                .get()
                .books
                .stream()
                .filter(book -> book.name.equals(bookName))
                .findFirst()
                .get();
    }
}
