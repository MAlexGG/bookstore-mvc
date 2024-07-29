package com.bookstore.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bookstore.config.DBManager;

public class BookDAO implements BookDAOInterface {

    private Connection connection;
    private PreparedStatement stmn;
    
    public List<Book> getBooks(){
        List<Book> books = new ArrayList<>();
        String sql = "SELECT * FROM books";

        try {
            connection = DBManager.initConnection();
            stmn = connection.prepareStatement(sql);
            ResultSet result = stmn.executeQuery();

            while (result.next()) {
                Book book = new Book();
                book.setId(result.getInt("id"));
                book.setTitle(result.getString("title"));
                book.setAuthor(result.getString("author"));
                book.setIsbn(result.getLong("isbn"));
                books.add(book);
            }
        } catch (Exception e) {
            System.out.println("Conexión fallida");
        } finally {
            DBManager.closeConnection();
        }
        return books;
    }
}
