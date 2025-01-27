import java.util.Scanner;

public class SimpleJavaExample {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Display a greeting
        System.out.println("Hello, " + name + "! Welcome to Java programming!");

        // Close the scanner
        scanner.close();
    }
}
