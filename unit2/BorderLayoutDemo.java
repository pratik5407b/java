import java.awt.*;

public class BorderLayoutDemo extends Frame{

public BorderLayoutDemo(){
this.setTitle("button");
this.setSize(400,400);
this.setLayout(new BorderLayout());
this.setVisible(true);



Button b = new Button("hello");
add(b,BorderLayout.NORTH);


Button b1 = new Button("hello"); 
add(b1,BorderLayout.WEST);

Button b2 = new Button("hello");
add(b2,BorderLayout.SOUTH);

Button b3 = new Button("hello");
add(b3,BorderLayout.EAST);

Button b4 = new Button("hello");
add(b4,BorderLayout.CENTER);
}
public static void main(String[] args){

new BorderLayoutDemo();
}
}