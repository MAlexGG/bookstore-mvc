package com.bookstore.view;

import java.util.List;

import com.bookstore.controller.BooksController;
import com.bookstore.model.Book;

public class BookView {
    
    private BooksController booksController;

    public BookView(BooksController booksController){
        this.booksController = booksController;
    }

    public void showBooks(){
        List<Book> books = booksController.getBooks();

        for (Book book : books) {
            System.out.println(book.getId());
            System.out.println(book.getTitle());
            System.out.println(book.getAuthor());
            System.out.println(book.getIsbn());
            System.out.println("-------------------");
            
           }
        
    }
}
