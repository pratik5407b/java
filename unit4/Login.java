import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Login extends JFrame {

    public Login() {
        setTitle("Label and Icon");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Create labels
        JLabel label1 = new JLabel("Username");
        label1.setBounds(100, 20, 70, 20);
        add(label1);

        JLabel label2 = new JLabel("Password");
        label2.setBounds(100, 50, 70, 20);
        add(label2);

        // Create text fields
        JTextField t1 = new JTextField(20);
        t1.setBounds(170, 20, 150, 20);
        add(t1);

        JTextField t2 = new JTextField(20);  // Fixed the typo here
        t2.setBounds(170, 50, 150, 20);
        add(t2);

        // Create button
        JButton b1 = new JButton("Login");
        b1.setBounds(170, 80, 100, 30);  // Corrected button bounds
        add(b1);

        // ActionListener for the button
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String user = t1.getText();
                String pass = t2.getText();

                // Check if both username and password are at least 5 characters long
                if (user.length() >= 5 && pass.length() >= 5) {
                    if (user.equals(pass)) {
                        System.out.println("Success");
                    } else {
                        System.out.println("Failed");
                    }
                } else {
                    System.out.println("Username and password must be at least 5 characters long");
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() { // Ensures UI updates are handled properly
            public void run() {
                new Login();
            }
        });
    }
}
