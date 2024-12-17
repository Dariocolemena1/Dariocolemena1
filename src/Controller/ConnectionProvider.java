/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ghost
 */
public class ConnectionProvider {
    private static final String URL = "jdbc:mysql://localhost/gms";
    private static final String USER = "ghost";  
    private static final String PASSWORD = "1234567890";
    
    public static Connection getCon() throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            return con;
        } catch (SQLException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, "Erro na conexão com o banco de dados", ex);
        return null;
        }
        
    }
}
