import java.util.*;


public class Java_ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int numDeQueries = scan.nextInt();
        
        for (int i = 0; i < numDeQueries; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();
            
            int result = a;
            for (int j = 0; j < n; j++) {
                result = result + (int)(Math.pow(2, j))*b;
                System.out.printf("%d ", result);
            }
            System.out.println();
        }
        
        scan.close();
    }
    
}
