import java.awt.*;

public class GridBackLayoutDemo extends Frame{

public GridBackLayoutDemo(){
this.setTitle("button");
this.setSize(400,400);
this.setLayout(new GridLayout(2,2,20,20));
this.setVisible(true);



Button b = new Button("Button1");
add(b);
Button b1 = new Button("Button2");
add(b1);
Button b2 = new Button("Button3");
add(b2);
Button b3 = new Button("Button4");
add(b3);


}
public static void main(String[] args){

new GridBackLayoutDemo();
}
}