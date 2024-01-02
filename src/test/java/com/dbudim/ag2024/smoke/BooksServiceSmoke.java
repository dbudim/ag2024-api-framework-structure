package com.dbudim.ag2024.smoke;

import com.dbudim.ag2024.client.models.Book;
import com.dbudim.ag2024.client.models.DataList;
import com.dbudim.ag2024.fixtures.FixtureSmoke;
import org.testng.annotations.Test;

import java.io.IOException;

public class BooksServiceSmoke extends FixtureSmoke {

    @Test
    public void getBooks() throws IOException {
        DataList<Book> books = client.booksService.getBooks().execute().body();
        books.data.stream().forEach(b-> {
            try {
                client.booksService.deleteBook(b.id).execute();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    @Test
    public void createBook() throws IOException {
        client.booksService.createBook(new Book("1","2")).execute();
    }
}
