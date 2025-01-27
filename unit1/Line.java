import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Line extends Frame {

    // Constructor to set up the Frame
    public Line() {
        this.setTitle("Draw Line");
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

    // Overriding the paint method to draw the straight line
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.GREEN);

        // Draw the straight line
        g.drawLine(50, 50, 300, 300); // (x1, y1, x2, y2)
    }

    public static void main(String[] args) {
        // Create an instance of the Line class to display the frame
        new Line();
    }
}
