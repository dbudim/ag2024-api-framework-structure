package com.dbudim.ag2024.some_examples.exceptions_handling.try_catch_in_tests;

import com.dbudim.ag2024.client.models.Book;
import com.dbudim.ag2024.fixtures.FixtureSmoke;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import static com.dbudim.ag2024.utils.ExecutionUtils.execute;

public class Well extends FixtureSmoke {

    @Test
    public void findActiveBooksThrowExample() throws IOException {
        List<Book> books = client.booksService.getBooks().execute().body().data;

        List<Book> undefinedBooks = books.stream()
                .filter(book -> book.description.isEmpty())
                .collect(Collectors.toList());
    }

    @Test
    public void findActiveDragonsThrowExample() {
        List<Book> books = execute(client.booksService.getBooks()).body().data;

        List<Book> undefinedBooks = books.stream()
                .filter(book -> book.description.isEmpty())
                .collect(Collectors.toList());
    }

}
