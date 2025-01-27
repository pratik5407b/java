import java.awt.*;

public class Shape extends Frame{

public Shape(){
this.setTitle("draw");
this.setSize(200,200);
this.setLayout(null);
this.setVisible(true);

}
public void paint(Graphics g){
g.setColor(Color.red);
g.fillRect(20,40,60,80);
}


public static void main(String[] args){

new Shape();
}

}