import java.awt.*;


public class Btn extends Frame{



public Btn(){
this.setTitle("button");
this.setSize(400,400);
this.setLayout(null);
this.setVisible(true);




Button b1 = new Button();
b1.setLabel("hello");
b1.setBounds(20,30,40,50);

add(b1);




}

public static void main(String[] args){

new Btn();
}
}