import java.awt.*;
import java.awt.event*;

public class KeyListnerEx extends Frame{


KeyListnerEx (){
setTitle("Key Example");
setSize(400,400);
setLayout(new FlowLayout());

TextFeild t1 = new TextFeild();
add(t1);

t1.addKeyListner(new KeyListner(){
 void keyPressed (KeyEvent ke){

system.out.println(t1.getText());

 

}

 void keyReleased (KeyEvent ke){

}

 void keyTyped (KeyEvent ke){

}

});




}





public static void main(String args[]){
 new KeyListnerEx();
}
}