import java.awt.*;

public class Square extends Frame{

public Square(){
this.setTitle("draw");
this.setSize(200,200);
this.setLayout(null);
this.setVisible(true);

}
public void paint(Graphics g){
g.setColor(Color.red);
g.fillRect(20,40,80,80);
}


public static void main(String[] args){

new Square();
}

}