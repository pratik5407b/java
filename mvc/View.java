import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame {
    private JLabel nameLabel, displayLabel, nameLabel1;
    private JTextField nameField, nameField1;
    private JButton displayButton;

    public View(Controller controller) {
        // Set up the window (frame)
        setTitle("Add Numbers");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);

        // Initialize components
        displayLabel = new JLabel("Your Total number is: ");
        nameLabel = new JLabel("A: ");
        nameField = new JTextField(10);
        nameLabel1 = new JLabel("B: ");
        nameField1 = new JTextField(10);
        displayButton = new JButton("Add");

        // Button ActionListener
        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Parse the text fields into integers and pass them to the controller
                    int a = Integer.parseInt(nameField.getText());
                    int b = Integer.parseInt(nameField1.getText());

                    // Pass the values to the controller to update the model
                    controller.processNumbers(a, b);

                } catch (NumberFormatException ex) {
                    // Handle invalid input (non-numeric input)
                    JOptionPane.showMessageDialog(View.this, "Please enter valid integers.");
                }
            }
        });

        // Layout setup for the panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2)); // 3 rows, 2 columns
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(nameLabel1);
        panel.add(nameField1);
        panel.add(displayButton);
        panel.add(displayLabel);

        getContentPane().add(BorderLayout.CENTER, panel);
        setVisible(true);
    }

    // Method to update the display label with the result
    public void updateDisplay(int result) {
        displayLabel.setText("Your Total number is: " + result);
    }
}
