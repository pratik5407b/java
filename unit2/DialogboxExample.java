import java.awt.*;
import java.awt.event.*;

public class DialogboxExample extends Frame {
    Button buttomDialog;
    Dialog msgDialog;
    public DialogboxExample(){
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(300,500);

       
    
    }
    public void showMessageDialog(String message,String title){
        msgDialog = new Dialog(this, title, true);
        msgDialog.setLayout(new FlowLayout());
        msgDialog.add(new Label(message));
        Button okButton = new Button("OK");
      
        msgDialog.add(okButton);
        msgDialog.setSize(250, 100);
        msgDialog.setVisible(true);
    }
    public static void main(String arg[]){
        new DialogboxExample();
    }

}