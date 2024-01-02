package com.dbudim.ag2024.client.models;

import java.util.List;

public class Shelve extends BaseResource {

    public String name;
    public String slug;
    public String description;
    public String created_at;
    public String updated_at;
    public User created_by;
    public User updated_by;
    public User owned_by;
    public List<Book> books;

    public Shelve() {
    }

    public Shelve(String name) {
        this.name = name;
    }

    public Shelve(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Shelve(String name, List<Book> books) {
        this.name = name;
        this.books = books;
    }

    public Shelve(String name, String slug, String description, String created_at, String updated_at, User created_by, User updated_by, User owned_by, List<Book> books) {
        this.name = name;
        this.slug = slug;
        this.description = description;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.created_by = created_by;
        this.updated_by = updated_by;
        this.owned_by = owned_by;
        this.books = books;
    }

    public static class Builder {

        private Shelve shelve = new Shelve();

        public Builder withName(String name) {
            this.shelve.name = name;
            return this;
        }

        public Builder withSlug(String slug) {
            this.shelve.slug = slug;
            return this;
        }

        public Builder withDescription(String description) {
            this.shelve.description = description;
            return this;
        }

        public Builder withCreatedAt(String createdAt) {
            this.shelve.created_at = createdAt;
            return this;
        }

        public Builder withUpdatedAt(String updatedAt) {
            this.shelve.updated_at = updatedAt;
            return this;
        }

        public Builder withCreatedBy(User createdBy) {
            this.shelve.created_by = createdBy;
            return this;
        }

        public Builder withUpdatedBy(User updatedBy) {
            this.shelve.updated_by = updatedBy;
            return this;
        }

        public Builder withOwnedBy(User ownedBy) {
            this.shelve.owned_by = ownedBy;
            return this;
        }

        public Builder withBooks(List<Book> books) {
            this.shelve.books = books;
            return this;
        }

        public Shelve build() {
            return shelve;
        }
    }
}
