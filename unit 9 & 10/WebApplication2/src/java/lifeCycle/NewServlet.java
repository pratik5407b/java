package lifeCycle;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class NewServlet extends HttpServlet {

    // Database connection details
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/bcis";
    private static final String JDBC_USERNAME = "root"; // Update with your database username
    private static final String JDBC_PASSWORD = ""; // Update with your database password

    // Initialization method (if needed)
    public void init(ServletConfig servletConfig) throws ServletException {
        // Any initialization tasks can be done here (if needed)
    }

    // Handling GET request
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Just a placeholder; handling form submission with POST request
    }

    // Handling POST request for form submission
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Retrieve form parameters from the request
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String dob = request.getParameter("dob");

        // Database connection logic
        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD)) {

            // Prepare SQL insert statement
            String insertSQL = "INSERT INTO student (id, name, address, dob) VALUES (?, ?, ?, ?)";
            try (PreparedStatement ps = conn.prepareStatement(insertSQL)) {

                // Set the parameters for the prepared statement
                ps.setInt(1, Integer.parseInt(id)); // ID
                ps.setString(2, name); // Name
                ps.setString(3, address); // Address
                ps.setDate(4, Date.valueOf(dob)); // Date of Birth

                // Execute the insert query
                int result = ps.executeUpdate();

                // Check if the insertion was successful
                response.setContentType("text/html");
                PrintWriter out = response.getWriter();
                if (result > 0) {
                    out.println("<h3>Record successfully inserted!</h3>");
                } else {
                    out.println("<h3>Sorry, something went wrong. Please try again!</h3>");
                }
            } catch (SQLException e) {
                e.printStackTrace();
                response.setContentType("text/html");
                PrintWriter out = response.getWriter();
                out.println("<h3>Error inserting record: " + e.getMessage() + "</h3>");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<h3>Error connecting to database: " + e.getMessage() + "</h3>");
        }
    }

    @Override
    public String getServletInfo() {
        return "Servlet that handles student form submissions and inserts them into the database.";
    }
}
