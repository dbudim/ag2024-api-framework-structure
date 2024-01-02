package com.dbudim.ag2024.some_examples.chaining_exceptions_clear_report;

import com.dbudim.ag2024.client.BookStackRestClient;
import com.dbudim.ag2024.client.models.Book;
import com.dbudim.ag2024.client.models.Shelve;
import com.dbudim.ag2024.exceptions.BookNotFoundException;
import com.dbudim.ag2024.exceptions.ShelveNotFoundException;

import static com.dbudim.ag2024.utils.ExecutionUtils.execute;


public class Well {

    private BookStackRestClient client;

    public Well(BookStackRestClient client) {
        this.client = client;
    }

    public Book findBookInShelve(String shelveName, String bookName) {
        Shelve shelve = execute(client.shelvesService.getShelves()).body()
                .data
                .stream()
                .filter(s -> s.name.equals(shelveName))
                .findFirst()
                .orElseThrow(() -> new ShelveNotFoundException(shelveName));

        Book book = execute(client.booksService.getBooks()).body()
                .data
                .stream()
                .filter(b -> b.name.equals(bookName))
                .findFirst()
                .orElseThrow(() -> new BookNotFoundException(bookName));

        return book;
    }
}
