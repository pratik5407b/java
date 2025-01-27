import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/*	<applet code="SimpleApplet.class" height="700" width="700"></applet> */
public class SimpleApplet extends Applet{
	
	public void init(){
		setBackground(Color.CYAN);
	}

	public void paint(Graphics g){
		g.drawString("My First Applet", 50,60);
	}

}
