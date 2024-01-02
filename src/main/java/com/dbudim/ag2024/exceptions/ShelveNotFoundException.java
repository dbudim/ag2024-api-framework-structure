package com.dbudim.ag2024.exceptions;

public class ShelveNotFoundException extends RuntimeException {

    public ShelveNotFoundException(String name) {
        super("Shelve [" + name + "] not found");
    }

}
