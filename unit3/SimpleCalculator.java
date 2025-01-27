import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends Frame implements ActionListener {
    
    // Declare components
    TextField inputField;
    Button[] numberButtons = new Button[10];
    Button add, subtract, multiply, divide, equals, clear, decimal;
    String operator = "";  // To store operator like +, -, *, /
    double num1, num2, result;
    
    // Constructor to setup the GUI
    public SimpleCalculator() {
        // Set the frame title and layout
        setTitle("Simple Calculator");
        setSize(400, 500);  // Set window size
        setLayout(new BorderLayout());  // Use BorderLayout to place components
        
        // Create a text field to display the input/output
        inputField = new TextField();
        inputField.setFont(new Font("Arial", Font.BOLD, 20));  // Set font for text field
        inputField.setEditable(false);  // Make the text field non-editable
        add(inputField, BorderLayout.NORTH);  // Add text field to the top of the frame
        
        // Create a panel to hold the buttons and set a GridLayout
        Panel buttonPanel = new Panel();
        buttonPanel.setLayout(new GridLayout(4, 4, 10, 10));  // 4x4 grid layout with 10px gaps
        
        // Create number buttons (0-9) and add them to the panel
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new Button(String.valueOf(i));
            numberButtons[i].addActionListener(this);  // Add action listener to each button
            buttonPanel.add(numberButtons[i]);
        }
        
        // Create operator buttons and other controls
        add = new Button("+");
        subtract = new Button("-");
        multiply = new Button("*");
        divide = new Button("/");
        equals = new Button("=");
        clear = new Button("C");
        decimal = new Button(".");
        
        // Add action listeners for each operator button
        add.addActionListener(this);
        subtract.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);
        equals.addActionListener(this);
        clear.addActionListener(this);
        decimal.addActionListener(this);
        
        // Add operator buttons to the panel
        buttonPanel.add(add);
        buttonPanel.add(subtract);
        buttonPanel.add(multiply);
        buttonPanel.add(divide);
        buttonPanel.add(equals);
        buttonPanel.add(clear);
        buttonPanel.add(decimal);
        
        // Add the panel to the center of the frame
        add(buttonPanel, BorderLayout.CENTER);
        
        // Make the frame visible
        setVisible(true);
    }
    
    // ActionListener for handling button clicks
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();  // Get the command of the clicked button
        
        // If a number button (0-9) is clicked, append the number to the text field
        if (command.charAt(0) >= '0' && command.charAt(0) <= '9') {
            inputField.setText(inputField.getText() + command);
        }
        
        // If an operator button is clicked (+, -, *, /), store the operator and current number
        else if (command.equals("+") || command.equals("-") || command.equals("*") || command.equals("/")) {
            operator = command;
            num1 = Double.parseDouble(inputField.getText());  // Save the first number
            inputField.setText("");  // Clear the text field for the second number
        }
        
        // If the equals button is clicked, perform the calculation
        else if (command.equals("=")) {
            num2 = Double.parseDouble(inputField.getText());  // Get the second number
            
            // Perform the calculation based on the operator
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        inputField.setText("Error");  // Handle division by zero
                        return;
                    }
                    break;
            }
            inputField.setText(String.valueOf(result));  // Display the result
        }
        
        // If the clear button ("C") is clicked, reset everything
        else if (command.equals("C")) {
            inputField.setText("");  // Clear the text field
            num1 = num2 = result = 0;  // Reset the numbers and result
        }
        
        // If the decimal button (".") is clicked, add a decimal point to the input
        else if (command.equals(".")) {
            inputField.setText(inputField.getText() + ".");
        }
    }
    
    // Main method to create and show the calculator
    public static void main(String[] args) {
        new SimpleCalculator();  // Create a new instance of the calculator
    }
}
