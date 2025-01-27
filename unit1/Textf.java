import java.awt.*;


public class Textf extends Frame{



public Textf(){
this.setTitle("button");
this.setSize(400,400);
this.setLayout(null);
this.setVisible(true);




TextField b1 = new TextField();
b1.setBounds(50,30,150,60);

add(b1);




}

public static void main(String[] args){

new Textf();
}
}