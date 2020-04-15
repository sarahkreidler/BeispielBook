package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Book {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    // standard constructors
    public Book() {
    }

    public Book(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    // standard getters and setters
    public String getBooks() {
        return name;
    }
}