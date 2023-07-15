package com.hdh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
    public Connection conn = null;

    public DBConnector() {
        this.ConnectMariaDB();
    }

    public void ConnectMariaDB() {

        try {
            Class.forName("org.mariadb.jdbc.Driver");

            try {
                conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/day9", "root", "");

            } catch (SQLException e) {
                System.out.println("connection error! : " + e.getMessage());
            }

            System.out.println("success connect!");

        } catch (ClassNotFoundException e) {
            System.out.println("driver err! : " + e.getMessage());
        }
    }
}
