import java.awt.*;

public class Traingle extends Frame{

public Traingle(){
this.setTitle("draw");
this.setSize(200,200);
this.setLayout(null);
this.setVisible(true);

}
public void paint(Graphics g){
g.setColor(Color.red);

     int[] xPoints = {150, 250, 50};
     int[] yPoints = {50, 200, 200};

                // Draw the triangle
     g.drawPolygon(xPoints, yPoints, 3);

}


public static void main(String[] args){

new Traingle();
}

}