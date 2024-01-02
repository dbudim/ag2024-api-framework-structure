package com.dbudim.ag2024.client.models;

public class Book extends BaseResource {

    public String name;
    public String slug;
    public String description;
    public String created_at;
    public String updated_at;

    public Book() {

    }

    public Book(String name) {
        this.name = name;
    }

    public Book(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
