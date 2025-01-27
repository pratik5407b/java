import java.awt.*;
import java.awt.event.*;

public class GradeCalculator extends Frame {

    public GradeCalculator() {
        setTitle("Subject Grades");
        setSize(400, 400);
        setLayout(new FlowLayout());
        setVisible(true);

        // Add window closing functionality
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Labels and TextFields for 5 subjects
        Label l1 = new Label("Math:");
        add(l1);
        TextField t1 = new TextField(10);
        add(t1);

        Label l2 = new Label("English:");
        add(l2);
        TextField t2 = new TextField(10);
        add(t2);

        Label l3 = new Label("Science:");
        add(l3);
        TextField t3 = new TextField(10);
        add(t3);

        Label l4 = new Label("History:");
        add(l4);
        TextField t4 = new TextField(10);
        add(t4);

        Label l5 = new Label("Programming:");
        add(l5);
        TextField t5 = new TextField(10);
        add(t5);

        // Button to calculate the total grade and average
        Button calculateButton = new Button("Calculate Total & Grade");
        add(calculateButton);

        // Labels to display the total grade, average, and letter grade
       // Label resultLabel = new Label("Total Grade: ");
        //add(resultLabel);

        Label averageLabel = new Label("Average: ");
        add(averageLabel);

        Label gradeLabel = new Label("Grade: ");
        add(gradeLabel);

        // Action Listener for the button
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                    // Parse grades from the text fields
                    int math = Integer.parseInt(t1.getText());
                    int english = Integer.parseInt(t2.getText());
                    int science = Integer.parseInt(t3.getText());
                    int history = Integer.parseInt(t4.getText());
                    int programming = Integer.parseInt(t5.getText());

                    // Calculate total and average grades
                    int total = math + english + science + history + programming;
                    int average = total / 5;

                    // Determine the grade based on the average
                    String grade;
                    if (average < 40) {
                        grade = "C";
                    } else if (average < 50) {
                        grade = "C+";
                    } else if (average < 60) {
                        grade = "B";
                    } else if (average < 70) {
                        grade = "B+";
                    } else if (average < 80) {
                        grade = "A";
                    } else {
                        grade = "A+";
                    }

                    // Update result labels
                    averageLabel.setText("Average: " + average);
                    gradeLabel.setText("Grade: " + grade);

              
            }
        });
    }

    public static void main(String[] args) {
        new GradeCalculator();
    }
}
