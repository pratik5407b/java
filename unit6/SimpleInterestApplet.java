import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/* <applet code="SimpleInterestApplet.class" width="300" height="200"></applet>*/
public class SimpleInterestApplet extends Applet implements ActionListener {

    TextField LengthField, BreadthField, resultField;
    Button calculateButton;

    public void init() {
        setLayout(new GridLayout(5, 2, 5, 5));

        add(new Label("Length:"));
        LengthField = new TextField(10);
        add(LengthField);

        add(new Label("Breadth:"));
        BreadthField = new TextField(10);
        add(BreadthField);


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
            double Length = Double.parseDouble(LengthField.getText());
            double Breadth = Double.parseDouble(BreadthField.getText());

            double Area = (Length * Breadth);
            resultField.setText(String.valueOf(Area));
        } catch (NumberFormatException ex) {
            resultField.setText("Invalid input. Please enter numbers only.");
        }
    }
}

