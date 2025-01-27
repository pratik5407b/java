import java.awt.*;

public class LabelExample extends Frame{


public LabelExample(){
setTitle("label example");
setSize(400,400);
setLayout(null);
setVisible(true);

Label l1=new Label();
l1.setText("first text");
l1.setBounds(20,30,40,60);

Label l2=new Label("second label",Label.RIGHT);
l1.setBounds(20,75,40,60);

String text;
text=l2.getText();
System.out.println(text);
add(l1);
add(l2);


}

public static void main(String[] args){
new LabelExample();
}

}