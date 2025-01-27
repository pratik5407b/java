/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package classes;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class SimpleInterestServlet extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double principal = Double.parseDouble(request.getParameter("principal"));
        double rate = Double.parseDouble(request.getParameter("rate"));
        double time = Double.parseDouble(request.getParameter("time"));

        // Calculate Simple Interest: SI = (P * R * T) / 100
        double simpleInterest = (principal * rate * time) / 100;

        // Insert the calculated values into the database
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bcis", "root", "");
            String query = "INSERT INTO interest_calculations (principal, rate, time, simple_interest) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setDouble(1, principal);
            pstmt.setDouble(2, rate);
            pstmt.setDouble(3, time);
            pstmt.setDouble(4, simpleInterest);
            pstmt.executeUpdate();
            
            // Close the connection
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Pass the result to another JSP page
        request.setAttribute("principal", principal);
        request.setAttribute("rate", rate);
        request.setAttribute("time", time);
        request.setAttribute("simpleInterest", simpleInterest);
        RequestDispatcher dispatcher = request.getRequestDispatcher("display.jsp");
        dispatcher.forward(request, response);
    }
}
