import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CheckRadio extends JFrame implements ItemListener{

	private JCheckBox cb1,cb2,cb3;
	private JLabel txt,txt2;
	private JPanel panel;
	private JRadioButton male,female;

	public CheckRadio(){

		setTitle("Radio Button and CheckBox Example");
		setSize(300,200);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		cb1  = new JCheckBox("Python");
		cb2  = new JCheckBox("C++");
		cb3  = new JCheckBox("Java");

		male = new JRadioButton("Male");
		female = new JRadioButton("Female");

		ButtonGroup bg = new ButtonGroup();
		bg.add(male);
		bg.add(female);


		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);

		male.addItemListener(this);
		female.addItemListener(this);

		txt = new JLabel("Select Your Language");
		txt2 = new JLabel("Select Your Geneder");

		panel = new JPanel();

		panel.setLayout(new FlowLayout());
		panel.add(cb1);
		panel.add(cb2);
		panel.add(cb3);
		panel.add(txt);

		panel.add(male);
		panel.add(female);
		panel.add(txt2);

		getContentPane().add(panel);
		setVisible(true);

	}
public void itemStateChanged(ItemEvent e){
    // Create a StringBuilder to store selected items
    StringBuilder selectedItems = new StringBuilder();
    
    // Check the state of the checkboxes cb1, cb2, and cb3
    if(cb1.isSelected()){
        selectedItems.append(cb1.getText() + " selected\n");
    }
    if(cb2.isSelected()){
        selectedItems.append(cb2.getText() + " selected\n");
    }
    if(cb3.isSelected()){
        selectedItems.append(cb3.getText() + " selected\n");
    }
    
    // Check the state of the radio buttons male and female
    if(male.isSelected()){
        selectedItems.append(male.getText() + " selected\n");
    }
    if(female.isSelected()){
        selectedItems.append(female.getText() + " selected\n");
    }
    
    // If no checkboxes or radio buttons are selected, display "Not selected"
    if (selectedItems.length() == 0) {
        selectedItems.append("Not selected");
    }
    
    // Set the selected items' text in the txt label
    txt.setText(selectedItems.toString());
}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
		  	public void run(){
            new CheckRadio();
       } });
	}
}