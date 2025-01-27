import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentController {
    private StudentModel model;
    private StudentView view;

    public StudentController(StudentModel model, StudentView view) {
        this.model = model;
        this.view = view;

        view.getSubmitButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int[] marks = new int[5];
               
                    for (int i = 0; i < 5; i++) {
                        marks[i] = Integer.parseInt(view.getMarksFields()[i].getText());
                    }
                    model.setMarks(marks);
                    view.displayResults(
                            model.getResult(),
                            model.getGrade(),
                            model.getPercentage(),
                            model.getBestSubject()
                    );
              
            }
        });
    }
}
