package b250219;

import java.util.Scanner;

public class step10{
    public static void main(String[]args){
    	
        Scanner scan = new Scanner(System.in);
        
        int A = scan.nextInt();
        int B = scan.nextInt();
        
        int one = B%10;
        int ten = (B/10)%10;
        int hundred = B/100;
      
        System.out.println(A*one);
        System.out.println(A*ten);
        System.out.println(A*hundred);
        System.out.println(A*B);
    }
}