import java.util.Scanner;

public class basicDataTypes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int intValue = s.nextInt();
        long longValue = s.nextLong();
        char charValue = s.next().charAt(0);
        float floatValue = s.nextFloat();
        double doubleValue = s.nextDouble();

        System.out.println(intValue);
        System.out.println(longValue);
        System.out.println(charValue);
        System.out.println(floatValue);
        System.out.println(doubleValue);

        s.close();
    }

}
