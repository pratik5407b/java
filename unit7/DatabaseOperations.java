import java.sql.*;
import java.util.Scanner;

public class DatabaseOperations {

    private static final String url = "jdbc:mysql://localhost:3306/bcis";
    private static final String username = "root";
    private static final String password = "";

    public static void main(String args[]) throws SQLException, ClassNotFoundException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an operation:");
        System.out.println("1. Insert Data");
        System.out.println("2. Update Data");
        System.out.println("3. Delete Data");
        int choice = scanner.nextInt();
        scanner.nextLine(); 

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, username, password);

        switch (choice) {
            case 1:
                //  for Inserting Data
                System.out.print("Enter student ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter student name: ");
                String name = scanner.nextLine();

                System.out.print("Enter student address: ");
                String address = scanner.nextLine();

                System.out.print("Enter student date of birth (YYYY-MM-DD): ");
                String dobString = scanner.nextLine();

                String insertQuery = "INSERT INTO student (id, name, address, dob) VALUES (?, ?, ?, ?)";
                PreparedStatement insertStatement = conn.prepareStatement(insertQuery);

                insertStatement.setInt(1, id);
                insertStatement.setString(2, name);
                insertStatement.setString(3, address);
                insertStatement.setDate(4, Date.valueOf(dobString));

                int insertRowsAffected = insertStatement.executeUpdate();
                if (insertRowsAffected > 0) {
                    System.out.println("Data inserted successfully!");
                } else {
                    System.out.println("Failed to insert data.");
                }
                break;

            case 2:
                // Update Data
                System.out.print("Enter student ID to update: ");
                int updateId = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter new student name: ");
                String newName = scanner.nextLine();

                System.out.print("Enter new student address: ");
                String newAddress = scanner.nextLine();

                System.out.print("Enter new student date of birth (YYYY-MM-DD): ");
                String newDobString = scanner.nextLine();

                String updateQuery = "UPDATE student SET name = ?, address = ?, dob = ? WHERE id = ?";
                PreparedStatement updateStatement = conn.prepareStatement(updateQuery);

                updateStatement.setString(1, newName);
                updateStatement.setString(2, newAddress);
                updateStatement.setDate(3, Date.valueOf(newDobString));
                updateStatement.setInt(4, updateId);

                int updateRowsAffected = updateStatement.executeUpdate();
                if (updateRowsAffected > 0) {
                    System.out.println("Data updated successfully!");
                } else {
                    System.out.println("Failed to update data.");
                }
                break;

            case 3:
                // Delete Data
                System.out.print("Enter student ID to delete: ");
                int deleteId = scanner.nextInt();
                
                String deleteQuery = "DELETE FROM student WHERE id = ?";
                PreparedStatement deleteStatement = conn.prepareStatement(deleteQuery);

                deleteStatement.setInt(1, deleteId);

                int deleteRowsAffected = deleteStatement.executeUpdate();
                if (deleteRowsAffected > 0) {
                    System.out.println("Data deleted successfully!");
                } else {
                    System.out.println("Failed to delete data.");
                }
                break;

            default:
                System.out.println("Invalid choice! Please enter 1, 2, or 3.");
                break;
        }

        conn.close();
        scanner.close();
    }
}
