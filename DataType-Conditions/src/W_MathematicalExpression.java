import java.util.Scanner;

public class W_MathematicalExpression {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int firstNumber = s.nextInt();
        String inputOperator = s.next();
        int secondNumber = s.nextInt();
        String assignmentOperator = s.next();
        int inputResult = s.nextInt();

        if (inputOperator == "+") {
            if (firstNumber + secondNumber == inputResult) {
                System.out.println("Yes");
            } else {
                System.out.println(firstNumber + secondNumber);
            }
        } else if (inputOperator == "-") {
            if (firstNumber + secondNumber == inputResult) {
                System.out.println("Yes");
            } else {
                System.out.println(firstNumber - secondNumber);
            }
        } else if (inputOperator == "*") {
            if (firstNumber + secondNumber == inputResult) {
                System.out.println("Yes");
            } else {
                System.out.println(firstNumber * secondNumber);
            }
        }

        s.close();
    }
}