import java.awt.*;
import javax.swing.*;

public class LabelIcon extends JFrame{


	public LabelIcon(){

		setTitle("Label and Icon");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ImageIcon img = new ImageIcon("java.png");
        JLabel javaLabel = new JLabel("Java Logo",img,JLabel.LEFT);
		JPanel panel = new JPanel();
		//panel.add(img);
		panel.add(javaLabel);
		panel.setLayout(new GridBagLayout());
		//add(panel);
		getContentPane().add(panel);
        setVisible(true);
	}

 public static void main(String arg[]){
 	 SwingUtilities.invokeLater(new Runnable() {   //help for running multiple threads 
		  	public void run(){
            new LabelIcon();
       } }); 
 }	
}