import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseAdapter;

public class AdapterExample extends Frame{

    public AdapterExample(){
        setVisible(true);
        setSize(200,300);
        setLayout(new FlowLayout());

        addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                int x = e.getX();
                int y = e.getY();
               System.out.println("Mouse Clicked (" + x + ", " + y + ")");
            }
        });

    addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

    }
    
    public static void main(String arg[]){
        new AdapterExample();
    }
}