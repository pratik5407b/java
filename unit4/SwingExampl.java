import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SwingExampl extends JFrame {

    public SwingExampl() {
        setTitle("Swing");
        setSize(400, 400);
        setLayout(new FlowLayout());
        setVisible(true); 

        // Create a JTextField
        JTextField textField = new JTextField(20); 
        add(textField);

        JButton b1 = new JButton("Click me");
        add(b1);

       
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { 
                
                String text = textField.getText();
                System.out.println(text);
            }
        });
    }

    public static void main(String[] args) {
        new SwingExampl();
    }
}
