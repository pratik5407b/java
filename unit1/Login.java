import java.awt.*;


public class Login extends Frame{



public Login(){
this.setTitle("button");
this.setSize(600,600);
this.setLayout(null);
this.setVisible(true);



Label l= new Label("Email");
l.setBounds(50,30,150,40);
TextField b1 = new TextField();
b1.setBounds(200,30,150,25);

Label l1= new Label("password");
l1.setBounds(50,80,150,60);
TextField b2 = new TextField();
b2.setBounds(200,95,150,25);


Button b = new Button("login");
b.setBounds(70,150,50,35);
add(b);

Button b3 = new Button("Reset");
b3.setBounds(160,150,50,35);
add(b3);

add(l);
add(b1);
add(l1);
add(b2);




}

public static void main(String[] args){

new Login();
}
}