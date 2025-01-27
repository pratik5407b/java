import javax.swing.*;
import java.awt.*;

public class StudentView {
    private JFrame frame;
    private JTextField[] marksFields = new JTextField[5];
    private JButton submitButton;
    private JLabel resultLabel, gradeLabel, percentageLabel, bestSubjectLabel;

    public StudentView() {
        frame = new JFrame("Student Exam Performance");
        frame.setLayout(new GridLayout(8, 2));
        frame.setSize(400, 300);

        for (int i = 0; i < 5; i++) {
            frame.add(new JLabel("Marks for Subject " + (i + 1) + ":"));
            marksFields[i] = new JTextField();
            frame.add(marksFields[i]);
        }

        submitButton = new JButton("Calculate Results");
        frame.add(submitButton);

        resultLabel = new JLabel("Result:");
        gradeLabel = new JLabel("Grade:");
        percentageLabel = new JLabel("Percentage:");
        bestSubjectLabel = new JLabel("Best Subject:");

        frame.add(resultLabel);
        frame.add(new JLabel()); // Placeholder
        frame.add(gradeLabel);
        frame.add(new JLabel()); // Placeholder
        frame.add(percentageLabel);
        frame.add(new JLabel()); // Placeholder
        frame.add(bestSubjectLabel);
        frame.add(new JLabel()); // Placeholder

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public JTextField[] getMarksFields() {
        return marksFields;
    }

    public JButton getSubmitButton() {
        return submitButton;
    }

    public void displayResults(String result, String grade, double percentage, String bestSubject) {
        resultLabel.setText("Result: " + result);
        gradeLabel.setText("Grade: " + grade);
        percentageLabel.setText("Percentage: " + percentage + "%");
        bestSubjectLabel.setText("Best Subject: " + bestSubject);
    }
}
