package com.bookstore.controller;

import java.util.List;

import com.bookstore.model.Book;
import com.bookstore.model.BookDAOInterface;

public class BooksController {
    
    private BookDAOInterface bookDAOInterface;

    public BooksController(BookDAOInterface bookDAOInterface){
        this.bookDAOInterface = bookDAOInterface;
    }

    public List<Book> getBooks(){
        List<Book> books = bookDAOInterface.getBooks();
        return books;
    }


}
