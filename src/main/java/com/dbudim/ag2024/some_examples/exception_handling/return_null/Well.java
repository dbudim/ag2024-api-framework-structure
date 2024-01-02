package com.dbudim.ag2024.some_examples.exception_handling.return_null;

import com.dbudim.ag2024.client.BookStackRestClient;
import com.dbudim.ag2024.client.models.Book;
import com.dbudim.ag2024.exceptions.BookNotFoundException;

import java.util.Optional;

import static com.dbudim.ag2024.utils.ExecutionUtils.execute;

public class Well {

    private BookStackRestClient client;

    public Well(BookStackRestClient client) {
        this.client = client;
    }

    public Optional<Book> findBookOtional(String name) {
        return execute(client.booksService.getBooks()).body().data
                .stream()
                .filter(book -> book.name.equals(name))
                .findFirst();
    }

    public Book findBookWithThrowException(String name) {
        return execute(client.booksService.getBooks()).body().data
                .stream()
                .filter(book -> book.name.equals(name))
                .findFirst()
                .orElseThrow(() -> new BookNotFoundException(name));
    }
}
