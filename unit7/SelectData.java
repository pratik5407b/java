import java.sql.*;


public class SelectData {

    private static final String url = "jdbc:mysql://localhost:3306/bcis";
    private static final String username = "root";
    private static final String password = "";

    public static void main(String args[]) throws SQLException, ClassNotFoundException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = DriverManager.getConnection(url, username, password);

        String query = "SELECT * FROM student";

        Statement statement = conn.createStatement();

        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            int studentId = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String address = resultSet.getString("address");
            Date dob = resultSet.getDate("dob");

            System.out.println("Student ID: " + studentId);
            System.out.println("Student Name: " + name);
            System.out.println("Student Address: " + address);
            System.out.println("Date of Birth: " + dob);
	    System.out.println("");
            
           
        }

        conn.close();
    }
}
