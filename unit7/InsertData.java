import java.sql.*;
import java.util.Scanner;

public class InsertData {

    private static final String url = "jdbc:mysql://localhost:3306/bcis";
    private static final String username = "root";
    private static final String password = "";

    public static void main(String args[]) throws SQLException, ClassNotFoundException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student address: ");
        String address = scanner.nextLine();

        System.out.print("Enter student date of birth (YYYY-MM-DD): ");
        String dobString = scanner.nextLine();

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, username, password);
        String query = "INSERT INTO student (id, name, address, dob) VALUES (?, ?, ?, ?)";

        PreparedStatement preparedStatement = conn.prepareStatement(query);

        preparedStatement.setInt(1, id);        
        preparedStatement.setString(2, name); 
        preparedStatement.setString(3, address);        
        preparedStatement.setDate(4, Date.valueOf(dobString)); 

        int rowsAffected = preparedStatement.executeUpdate();

        if (rowsAffected > 0) {
            System.out.println("Data inserted successfully!");
        } else {
            System.out.println("Failed to insert data.");
        }

        conn.close();
    }
}
