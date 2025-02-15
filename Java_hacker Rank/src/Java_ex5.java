import java.io.*;
import java.util.*;

public class Java_ex5 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
     int num = scan.nextInt();
     for(int i = 1;i<=10;i++){
       System.out.println( num + " x " + i + " = " + num*i );  
     }   
    }
    
}
