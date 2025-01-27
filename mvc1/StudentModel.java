public class StudentModel {
    private int[] marks = new int[5];
    private double percentage;
    private String grade;
    private String result;
    private String bestSubject;

    public void setMarks(int[] marks) {
        this.marks = marks;
        calculateResults();
    }

    public int[] getMarks() {
        return marks;
    }

    public double getPercentage() {
        return percentage;
    }

    public String getGrade() {
        return grade;
    }

    public String getResult() {
        return result;
    }

    public String getBestSubject() {
        return bestSubject;
    }

    private void calculateResults() {
        int total = 0;
        int bestIndex = 0;
        int minPassingScore = 40;

        result = "Pass"; // Default to Pass

        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
            if (marks[i] < minPassingScore) {
                result = "Fail"; // If any subject fails
            }
            if (marks[i] > marks[bestIndex]) {
                bestIndex = i; // Find best subject index
            }
        }

        percentage = total / 5.0;

        // Assign grade using if-else
        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 75) {
            grade = "A";
        } else if (percentage >= 50) {
            grade = "B";
        } else {
            grade = "C";
        }

        bestSubject = "Subject " + (bestIndex + 1); // Convert index to 1-based
    }
}
