package newpackage;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;


@WebServlet("/javaServlet")
public class javaServlet extends HttpServlet {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/bcis?useSSL=false&serverTimezone=UTC";
    private static final String JDBC_USERNAME = "root";
    private static final String JDBC_PASSWORD = "password";

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        super.init(servletConfig);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String dob = request.getParameter("dob");

        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD)) {
            String insertSQL = "INSERT INTO student (id, name, address, dob) VALUES (?, ?, ?, ?)";
            try (PreparedStatement ps = conn.prepareStatement(insertSQL)) {
                ps.setInt(1, Integer.parseInt(id));
                ps.setString(2, name);
                ps.setString(3, address);

                try {
                    ps.setDate(4, Date.valueOf(dob));
                } catch (IllegalArgumentException e) {
                    throw new ServletException("Invalid date format. Use yyyy-MM-dd.", e);
                }

                int result = ps.executeUpdate();

                response.setContentType("text/html");
                try (PrintWriter out = response.getWriter()) {
                    if (result > 0) {
                        out.println("<h3>Record successfully inserted!</h3>");
                    } else {
                        out.println("<h3>Sorry, something went wrong. Please try again!</h3>");
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            response.setContentType("text/html");
            try (PrintWriter out = response.getWriter()) {
                out.println("<h3>Error connecting to database: " + e.getMessage() + "</h3>");
            }
        }
    }
}
