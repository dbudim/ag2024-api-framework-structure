package com.dbudim.ag2024.some_examples.exceptions_handling.understandable_errors;

import com.dbudim.ag2024.client.models.Book;
import com.dbudim.ag2024.exceptions.BookNotFoundException;
import com.dbudim.ag2024.fixtures.FixtureSmoke;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Optional;

public class Well extends FixtureSmoke {

    private static final String BOOK_NAME = "***";

    @Test
    public void findBookWithThrowRuntime() throws IOException {
        Book book = client.booksService.getBooks().execute().body().data
                .stream()
                .filter(b -> b.name.equals(BOOK_NAME))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Book '" + BOOK_NAME + "' not found"));
    }

    @Test
    public void findBookWithCustomException() throws IOException {
        Book book = client.booksService.getBooks().execute().body().data
                .stream()
                .filter(b -> b.name.equals(BOOK_NAME))
                .findFirst()
                .orElseThrow(() -> new BookNotFoundException(BOOK_NAME));
    }
}
