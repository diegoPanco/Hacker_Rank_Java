import java.util.*;

public class Java_ex8 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int lineNumber = 1;
        while(scan.hasNextLine()){
            String line = scan.nextLine();
            System.out.println(lineNumber+ " "+ line);
            lineNumber++;
        }
        scan.close();
    }
};
