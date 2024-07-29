package com.bookstore.model;

public class Book {
    
    private int id;
    private String title;
    private String author;
    private Long isbn;

    public Book(){}

    public Book(String title, String author, Long isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Long getIsbn() {
        return this.isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }


}
