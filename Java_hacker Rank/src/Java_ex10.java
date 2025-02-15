import java.util.Scanner;

public class Java_ex10 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        
        try {
            Byte.toString(scan.nextByte());
            System.out.println("Good job");
        }
        catch(Exception e) {
            System.out.println("Wrong answer");
        }
        
        scan.close();
    }
}