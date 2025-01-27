import java.awt.*;

public class GridBagLayoutDemo extends Frame{

public GridBagLayoutDemo(){
this.setTitle("button");
this.setSize(400,400);
this.setLayout(new GridBagLayout());
this.setVisible(true);

GridBagConstraints gd= new GridBagConstraints();


Button b = new Button("Button1");
gd.gridx=0;
gd.gridy=0;
add(b);
Button b1 = new Button("Button2");
gd.gridx=1;
gd.gridy=0;
add(b1);
Button b2 = new Button("Button3");
gd.gridx=2;
gd.gridy=0;
add(b2);
Button b3 = new Button("Button4");
gd.gridx=3;
gd.gridy=0;
add(b3);


}
public static void main(String[] args){

new GridBagLayoutDemo();
}
}