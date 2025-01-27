/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package classes;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AgeInputServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        request.setAttribute("name", name); // Store the name in the request
        RequestDispatcher dispatcher = request.getRequestDispatcher("age.html");
        dispatcher.forward(request, response); // Forward to DOB input page
    }
}
