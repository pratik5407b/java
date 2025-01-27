import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class SaveUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String dob = request.getParameter("dob");

        // Debugging: Check if parameters are received correctly
        System.out.println("Received Name: " + name);  // Debugging line
        System.out.println("Received DOB: " + dob);   // Debugging line

        // Store name and DOB in session
        HttpSession session = request.getSession();
        session.setAttribute("name", name);
        session.setAttribute("dob", dob); // Store DOB for age calculation

        // Validate input before saving to the database
        if (name == null || name.trim().isEmpty()) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Name cannot be empty.");
            return;
        }
        if (dob == null || dob.trim().isEmpty()) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Date of Birth cannot be empty.");
            return;
        }

        // Save to database
        try {
            // Database connection
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bcis", "root", "");

            String query = "INSERT INTO user (name, dob) VALUES (?, ?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, name);
            pst.setString(2, dob);
            pst.executeUpdate();

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "An error occurred while saving user data.");
            return;
        }

        // Redirect to display page
        response.sendRedirect("DisplayUserServlet");
    }
}
