import java.awt.*;


public class CheckB extends Frame{



public CheckB(){
this.setTitle("Check Box");
this.setSize(500,500);
this.setLayout(null);
this.setVisible(true);


CheckboxGroup cb = new CheckboxGroup();  


Checkbox ch= new Checkbox("male",cb,true);
ch.setBounds(40,30,50,50);
add(ch);

Checkbox ch1= new Checkbox("female",cb,false);
ch1.setBounds(100,30,50,50);
add(ch1);

Label l = new Label("Country");

Choice c = new Choice();
c.setBounds(100, 100, 75, 75);    
   
c.add("Nepal");
c.add("India");

add(l);
add(c);



}

public static void main(String[] args){

new CheckB();
}
}