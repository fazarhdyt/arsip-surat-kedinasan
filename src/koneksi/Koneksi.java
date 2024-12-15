/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 */
public class Koneksi {
    public Connection koneksi;
    public Statement stm;
    
    public Connection connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connection successful");
        } catch(ClassNotFoundException e) {
            System.out.println("Connection failed " + e);
        }
        
        String url = "jdbc:mysql://localhost/db_surat";
        try {
            koneksi = DriverManager.getConnection(url, "root", "root");
            stm = koneksi.createStatement();
            System.out.println("Connection to database successful");
        } catch(Exception e) {
            System.err.print(e);
            System.out.println("Connection to the database failed");
        }
        return koneksi;

    }
}
