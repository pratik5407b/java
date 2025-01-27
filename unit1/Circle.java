import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Circle extends Frame {

    // Constructor to set up the Frame
    public Circle() {
        this.setTitle("Draw Circle");
        this.setSize(400, 400); // Adjusted size for better visibility
        this.setLayout(null);
        this.setVisible(true);

        // Add a window listener to handle the close operation
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    // Overriding the paint method to draw the circle
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.RED);

        // Draw the circle (as an oval with equal width and height)
        g.drawOval(100, 100, 200, 200); // x, y, width, height
    }

    public static void main(String[] args) {
        // Create an instance of the Circle class to display the frame
        new Circle();
    }
}
