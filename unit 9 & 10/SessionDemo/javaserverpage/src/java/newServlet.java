import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import java.util.*;

public class newServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Database connection details
        String url = "jdbc:mysql://localhost:3306/bcis"; // Update with your database URL
        String user = "root"; // Your DB username
        String password = ""; // Your DB password

        // Prepare the response
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // List to store student data
        List<Student> students = new ArrayList<>();

        try {
            // Step 1: Load JDBC driver (optional for newer versions of JDBC)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Establish connection
            Connection con = DriverManager.getConnection(url, user, password);
            
            // Step 3: Create SQL query
            String query = "SELECT * FROM student";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            // Step 4: Process the result set and store data in List
            while (rs.next()) {
                Student student = new Student();
                student.setId(rs.getInt("id"));
                student.setName(rs.getString("name"));
                student.setAddress(rs.getString("address"));
                student.setDob(rs.getDate("dob"));
                students.add(student);
            }

            // Step 5: Close connection
            con.close();
            
            // Step 6: Set the list of students as a request attribute
            request.setAttribute("students", students);

            // Step 7: Forward to the JSP page
            RequestDispatcher dispatcher = request.getRequestDispatcher("new.jsp");
            dispatcher.forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();
            out.println("Error: " + e.getMessage());
        }
    }
}
