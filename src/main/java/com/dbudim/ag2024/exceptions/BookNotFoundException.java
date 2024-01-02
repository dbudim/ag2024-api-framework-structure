package com.dbudim.ag2024.exceptions;

public class BookNotFoundException extends RuntimeException {

    public BookNotFoundException(String name) {
        super("Book '" + name + "' not found");
    }

}
