package com.dbudim.ag2024.some_examples.exceptions_handling.understandable_errors;

import com.dbudim.ag2024.client.models.Book;
import com.dbudim.ag2024.exceptions.BookNotFoundException;
import com.dbudim.ag2024.fixtures.FixtureSmoke;
import org.testng.annotations.Test;

import java.io.IOException;

public class Smell extends FixtureSmoke {

    @Test
    public void findBook() throws IOException {
        Book book = client.booksService.getBooks().execute().body().data
                .stream()
                .filter(b -> b.name.equals("***"))
                .findFirst()
                .orElseThrow(() -> new BookNotFoundException("Book:" + "***" + "' not found"));
    }

}
