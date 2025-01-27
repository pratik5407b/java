/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package classes;
import java.sql.*;

public class DBConnection {
    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/simple_interest_db", "root", "password");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new SQLException("Database connection failed!");
        }
    }
}
