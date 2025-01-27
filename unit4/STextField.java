import java.awt.*;
import javax.swing.*;
import java.awt.event.*; 

public class STextField extends JFrame implements ActionListener{

    private JTextField first, second;
    private JButton add, sub, imgBtn;
    private JLabel res;

    public STextField(){

        setTitle("Text Field");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        first = new JTextField(20);
        second = new JTextField(20);

        add = new JButton("Add +");
        sub = new JButton("Sub -");

        res = new JLabel("Output is :-");

        add.addActionListener(this);  
        sub.addActionListener(this); 

        imgBtn = new JButton();
        imgBtn.addActionListener(this);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));

        panel.add(first);
        panel.add(second);
        panel.add(res);
        panel.add(add);
        panel.add(sub);
        panel.add(imgBtn);

        getContentPane().add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){

        String result = "";
        String s1 = first.getText();  
        String s2 = second.getText();  

        try {
            int a = Integer.parseInt(s1);  
            int b = Integer.parseInt(s2);
            int c = 0;  
            if(e.getSource() == add){  
                c = a + b;
                result = String.valueOf(c);
                res.setText("Output is :- " + result);
            } else if(e.getSource() == sub){  
                c = a - b; 
                result = String.valueOf(c);
                res.setText("Output is :- " + result); 
            } else if(e.getSource() == imgBtn){
                res.setText("Output is :- " + e.getActionCommand());
            } 
        } catch (NumberFormatException ex) {
            // Handle invalid number format
            res.setText("Error: Please enter valid numbers.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                new STextField();
            } 
        }); 
    }
}
