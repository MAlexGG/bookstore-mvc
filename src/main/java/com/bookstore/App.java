package com.bookstore;

import com.bookstore.controller.BooksController;
import com.bookstore.model.BookDAO;
import com.bookstore.model.BookDAOInterface;
import com.bookstore.view.BookView;

public class App 
{
    public static void main( String[] args )
    {
        BookDAOInterface bookDao = new BookDAO();
        BooksController bookController = new BooksController(bookDao);
        BookView bookView = new BookView(bookController);

        bookView.showBooks();
    }
}
