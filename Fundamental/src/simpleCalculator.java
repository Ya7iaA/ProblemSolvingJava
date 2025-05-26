import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        long firstNum = s.nextLong();
        long secondNum = s.nextLong();

        System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
        System.out.println(firstNum + " * " + secondNum + " = " + (firstNum * secondNum));
        System.out.println(firstNum + " - " + secondNum + " = " + (firstNum - secondNum));

        s.close();
    }
}