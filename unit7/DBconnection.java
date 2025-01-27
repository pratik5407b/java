import java.sql.*;

public class DBconnection {
    private static final String url = "jdbc:mysql://localhost:3306/bcis";
    private static final String username = "root";
    private static final String password = "";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);

            if (conn != null) {
                System.out.println("Connection Successful");
            } else {
                System.out.println("Failed");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
