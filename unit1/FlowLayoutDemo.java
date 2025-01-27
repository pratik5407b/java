import java.awt.*;

public class FlowLayoutDemo extends Frame{

public FlowLayoutDemo(){
this.setTitle("button");
this.setSize(600,600);
this.setLayout(new FlowLayout());
this.setVisible(true);



Button b = new Button("hello");
add(b);

}