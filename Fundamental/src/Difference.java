import java.util.Scanner;

public class Difference {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        long firstNum = s.nextLong();
        long secondNum = s.nextLong();
        long thirdNum = s.nextLong();
        long fourthNum = s.nextLong();

        System.out.println("Difference = " + (firstNum * secondNum - thirdNum * fourthNum));

        s.close();
    }
}