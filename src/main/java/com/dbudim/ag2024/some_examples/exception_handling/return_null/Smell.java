package com.dbudim.ag2024.some_examples.exception_handling.return_null;

import com.dbudim.ag2024.client.BookStackRestClient;
import com.dbudim.ag2024.client.models.Book;

import java.util.List;

import static com.dbudim.ag2024.utils.ExecutionUtils.execute;

public class Smell {

    private BookStackRestClient client;

    public Smell(BookStackRestClient client) {
        this.client = client;
    }

    public Book findBook(String name) {
        List<Book> books = execute(client.booksService.getBooks()).body().data;

        for (var book : books) {
            if (book.name.equals(name)) {
                return book;
            }
        }

        return null;
    }

}
