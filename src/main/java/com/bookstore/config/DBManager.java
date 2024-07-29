package com.bookstore.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBManager {
    
    private static final String url = "jdbc:postgresql://localhost:5432/bookstore?charSet=UTF8";
    private static final String user = "postgres";
    private static final String pass = "12345";
    private static Connection connection;

    public static Connection initConnection() {
        try {
            connection = DriverManager.getConnection(url, user, pass);
            System.out.println("\033[0;32m" + "¡Conectado con éxito!" + "\033[0m");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }

    public static void closeConnection() {
        try {
            connection.close();
            System.out.println("\033[0;32m" + "Has salido correctamente del sistema" + "\033[0m");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
