import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SwingExample extends JFrame {

    public SwingExample() {
        setTitle("Swing");
        setSize(400, 400);
        setLayout(new FlowLayout());
        setVisible(true); // Corrected the case of "setvisible" to "setVisible"

        JButton b1 = new JButton("Click me");
        add(b1);

        // Corrected "ActionListner" to "ActionListener" and "ActionPerformed" to "actionPerformed"
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { // Correct method signature
                System.out.println("This is a JButton"); // Fixed "system.out.println" to "System.out.println"
            }
        });
    }

    public static void main(String[] args) {
        new SwingExample();
    }
}
