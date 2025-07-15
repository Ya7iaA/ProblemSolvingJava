import java.util.Scanner;

public class V_Comparison {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int firstNumber = s.nextInt();
        String inputOperator = s.next();
        int secondNumber = s.nextInt();

        if (inputOperator == "=") {
            if (firstNumber == secondNumber) {
                System.out.println("Right");
            } else {
                System.out.println("Wrong");
            }
        } else if (inputOperator == ">") {
            if (firstNumber > secondNumber) {
                System.out.println("Right");
            } else {
                System.out.println("Wrong");
            }
        } else if (inputOperator == "<") {
            if (firstNumber > secondNumber) {
                System.out.println("Right");
            } else {
                System.out.println("Wrong");
            }
        }

        s.close();
    }
}
