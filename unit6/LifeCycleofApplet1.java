import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;



/* <applet code="LifeCycleofApplet.class" height="700" width="700"></applet> */
public class LifeCycleofApplet extends Applet {
	String name,age,college;


	public void init(){
		System.out.println("Init is Initialised");
		name=getParameter("firstName")+" "+getParameter("lastName");
		age=getParameter("age");
		college=getParameter("college");

		}

	public void start(){
		System.out.println("Start is Initialised");
		System.out.println("The name is "+name+" age is "+age+" college is "+college);
	}

	public void paint(Graphics g){
		System.out.println("Paint is Initialised");
	}

	public void stop(){
		System.out.println("Stop is Initialised");		
	}

	public void destroy(){
		System.out.println("Destroy is Initialised");
	}

}