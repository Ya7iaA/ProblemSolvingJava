import java.util.Scanner;

public class Difference {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        long firstNumber = s.nextLong();
        long secondNumber = s.nextLong();
        long thirdNumber = s.nextLong();
        long fourthNumber = s.nextLong();

        System.out.println("Difference = " + (firstNumber * secondNumber - thirdNumber * fourthNumber));

        s.close();
    }
}