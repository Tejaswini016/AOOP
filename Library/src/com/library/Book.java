package com.library;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Book {
	private String ISBN, title, author, genre;

    public Book(String ISBN, String title, String author, String genre) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.genre = genre;
    }
    public String toString() {
        return title + " by " + author;
    }
    public boolean equals(Object o) {
        return (o instanceof Book) && ((Book) o).ISBN.equals(this.ISBN);
    }
    public int hashCode() {
        return ISBN.hashCode();
    }

}
