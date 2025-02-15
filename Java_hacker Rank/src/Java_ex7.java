import java.util.*;

public class Java_ex7 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int t = input.nextInt();

    for (int i = 0; i < t; i++) {
        try {
            long num = input.nextLong();
            System.out.println(num + " can be fitted in:");
            boolean canFit = false;

            if (num >= Byte.MIN_VALUE && num <= Byte.MAX_VALUE) {
                System.out.println("* byte");
                canFit = true;
            }
            if (num >= Short.MIN_VALUE && num <= Short.MAX_VALUE) {
                System.out.println("* short");
                canFit = true;
            }
            if (num >= Integer.MIN_VALUE && num <= Integer.MAX_VALUE) {
                System.out.println("* int");
                canFit = true;
            }
            if (num >= Long.MIN_VALUE && num <= Long.MAX_VALUE) {
                System.out.println("* long");
                canFit = true;
            }

            if (!canFit) {
                System.out.println(num + " can't be fitted anywhere");
            }
        } catch (Exception e) {
            System.out.println(input.next() + " can't be fitted anywhere."); // Clear the invalid input
        }
    }
    input.close(); // Close the scanner to prevent resource leaks
}
    
}
