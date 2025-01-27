public class Student {
    private Integer a, b;   // Instance variables to hold the two numbers
    private Integer sum;    // Variable to hold the sum of the numbers

    // Getter for sum
    public Integer getSum() {
        return sum;
    }

    // Setter for a and b, calculates the sum and stores it in 'sum'
    public void setNumbers(int a, int b) {
        this.a = a;
        this.b = b;
        this.sum = a + b;   // Calculate the sum
    }
}
