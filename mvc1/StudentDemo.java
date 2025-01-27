import javax.swing.*;
import java.awt.*;

public class StudentDemo extends JFrame { 
    private JTextField[] marks = new JTextField[5];

    public StudentDemo() {
        
        setSize(400, 400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

       
        for (int i = 0; i < 5; i++) {
            add(new JLabel("Enter your Marks for subject " + (i + 1) + ":"));
            marks[i] = new JTextField(20);
            add(marks[i]);
        }

       
        setVisible(true);
    }

    public static void main(String[] args) {
        new StudentDemo();
    }
}
