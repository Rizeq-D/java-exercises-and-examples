package Rizeq.JavaLearning;

public class NonZeroDivision{

    public int nunZeros(int num1, int num2) {

        if (num1 == 0 || num2 == 0) {
            throw new ArithmeticException("Division by zero");
        } else {
            return num1 / num2;
        }

    }
}
