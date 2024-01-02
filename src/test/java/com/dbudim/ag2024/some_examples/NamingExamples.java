package com.dbudim.ag2024.some_examples;

import com.dbudim.ag2024.client.models.Book;
import com.dbudim.ag2024.fixtures.FixtureSmoke;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

import static com.dbudim.ag2024.utils.ExecutionUtils.execute;

public class NamingExamples extends FixtureSmoke {


    @Test
    public void variablesExample() throws IOException {
        //smell
        List<Book> bookList = client.booksService.getBooks().execute().body().data;

        //well
        List<Book> books = client.booksService.getBooks().execute().body().data;

        class Shelve {
            //smell
            boolean books = true;
            //well
            boolean hasBooks = true;
        }

        //smell
        Book adminCreate = execute(client.booksService.createBook(new Book("some"))).body();

        //well
        Book bookCreatedByAdmin = execute(client.booksService.createBook(new Book("some"))).body();
        Book bookOfAdmin = execute(client.booksService.createBook(new Book("some"))).body();

        renameBook(bookOfAdmin.id, "new name");
    }





    /**
     * Method name, argument name
     */

    //smell
    private Book bookCreate(String bookName) {
        return execute(client.booksService.createBook(new Book(bookName))).body();
    }

    //well
    private Book createBook(String name) {
        return execute(client.booksService.createBook(new Book(name))).body();
    }


    /**
     * test name as action
     */

    //smell
    @Test
    public void bookCreatedByAdmin() {

    }


    //well
    @Test
    public void createBookByAdminTest() {

    }


    //smell - we don't understand from name what's happening
    private void renameBook(String id, String newName) {
        Book book = new Book();
        book.name = newName;
        book.updated_at = LocalDateTime.now().toString();
        execute(client.booksService.updateBook(id, book));
    }


}
