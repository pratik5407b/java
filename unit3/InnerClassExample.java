import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerClassExample extends Frame {
    private Button button;

    public InnerClassExample() {
        setTitle("Inner Class Event Handling Example");
        setSize(300, 200);

        button = new Button("Click Me");
        add(button);

        // Register an ActionListener using an inner class
        button.addActionListener(new MyActionListener());

        setVisible(true);
    }

    // Inner class for ActionListener
    class MyActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // Handle the button click event
            System.out.println("Button clicked");
        }
    }

    public static void main(String[] args) {
        new InnerClassExample();
    }
}
