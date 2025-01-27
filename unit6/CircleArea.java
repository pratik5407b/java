import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/* <applet code="CircleArea.class" height="700" width="700"></applet> */
public class CircleArea extends Applet implements ActionListener {
    TextField RadiusField;
    TextField resultField;
    Button calculateButton;

    public void init() {
        setLayout(new GridLayout(5, 2, 5, 5));

        add(new Label("Radius:"));
        RadiusField = new TextField(10);
        add(RadiusField);

        calculateButton = new Button("Calculate");
        calculateButton.addActionListener(this);
        add(calculateButton);

        add(new Label("Area is:"));
        resultField = new TextField(10);
        resultField.setEditable(false); 
        add(resultField);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double radius = Double.parseDouble(RadiusField.getText());
            double area = 3.14 * radius * radius;  
            resultField.setText(String.valueOf(area));
        } catch (NumberFormatException ex) {
            resultField.setText("Invalid input. Please enter numbers only.");
        }
    }
}
