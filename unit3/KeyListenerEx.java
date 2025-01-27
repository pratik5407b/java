import java.awt.*;
import java.awt.event.*;

public class KeyListenerEx extends Frame {

    public KeyListenerEx() {
        setTitle("Key Example");
        setSize(400, 400);
        setLayout(new FlowLayout());
        setVisible(true);

        // Add window closing functionality
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0); // Exit the application when the frame is closed
            }
        });

        TextField t1 = new TextField(20); // Set the width for better display
        add(t1);

        t1.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent ke) {
                System.out.println(t1.getText()); // Print the text field content
            }

            @Override
            public void keyReleased(KeyEvent ke) {
                // Optional: Add functionality here if needed
            }

            @Override
            public void keyTyped(KeyEvent ke) {
                // Optional: Add functionality here if needed
            }
        });
    }

    public static void main(String[] args) {
        new KeyListenerEx();
    }
}
