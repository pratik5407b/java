import java.awt.*;

public class myDemo extends Frame {

public myDemo(){
this.SetVisible(true);
this.SetSize(400,400);
this.SetLayout(null);

Label text=new Label("name");
text.setBounds(60,40,150,150);
TextFeild text1=new Label("");
text1.setBounds(60,190,150,150);
this.add(text);
this.add(text1);


}
public static void main(String[] args){
new myDemo();

}

}