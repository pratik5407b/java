/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package classes;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class DisplayUserServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve name and DOB from session
        HttpSession session = request.getSession(true);
        String name = (String) session.getAttribute("name");
        String dobString = (String) session.getAttribute("dob");

        // Check if data exists in session
        if (name != null && dobString != null) {
            // Calculate age from DOB
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate dob = LocalDate.parse(dobString, formatter);
            LocalDate today = LocalDate.now();
            int age = Period.between(dob, today).getYears();

            // Prepare the HTML response
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html>");
            out.println("<head><title>User Information</title></head>");
            out.println("<body>");
            out.println("<h2>User Information</h2>");
            out.println("<p>Name: " + name + "</p>");
            out.println("<p>Date of Birth: " + dobString + "</p>");
            out.println("<p>Age: " + age + "</p>");
            out.println("</body>");
            out.println("</html>");
        } else {
            // If session data is not available, redirect to name input page
            response.sendRedirect("name.html");
        }
    }
}
