import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Oval extends Frame {

    // Constructor to set up the Frame
    public Oval() {
        this.setTitle("Draw Oval");
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

    // Overriding the paint method to draw the oval
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLUE);

        // Draw the oval (width and height are different)
        g.drawOval(100, 100, 200, 100); // x, y, width, height
    }

    public static void main(String[] args) {
        // Create an instance of the Oval class to display the frame
        new Oval();
    }
}
