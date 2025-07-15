import java.util.Scanner;

public class N_Char {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        char inputChar = s.next().charAt(0);

        System.out.println(inputChar >= 97 ? (char) (inputChar - 32) : (char) (inputChar + 32));

        s.close();
    }
}