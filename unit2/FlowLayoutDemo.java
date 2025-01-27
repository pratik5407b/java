import java.awt.*;

public class FlowLayoutDemo extends Frame{

public FlowLayoutDemo(){
this.setTitle("button");
this.setSize(600,600);
this.setLayout(new FlowLayout (FlowLayout.RIGHT));
this.setVisible(true);



Button b = new Button("hello");
add(b);


Button b1 = new Button("hello");
add(b1);
Button b2 = new Button("hello");
add(b2);
Button b3 = new Button("hello");
add(b3);
}
public static void main(String[] args){

new FlowLayoutDemo();
}
}