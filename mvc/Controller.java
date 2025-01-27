public class Controller {
    private Student student;  // The Model
    private View view;       // The View

    public Controller() {
        student = new Student();  // Initialize the model
        view = new View(this);    // Initialize the view and pass this (the controller) to it
    }

    // This method is called when the user clicks the "Add" button in the view
    public void processNumbers(int a, int b) {
        student.setNumbers(a, b);  // Pass the numbers to the model to calculate the sum
        int sum = student.getSum();  // Retrieve the calculated sum from the model
        view.updateDisplay(sum);     // Update the view with the result
    }
}
