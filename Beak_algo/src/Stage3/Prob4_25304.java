package Stage3;

import java.util.Scanner;

public class Prob4_25304 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int n = sc.nextInt();
        
        int hab=0;
        
        for(int i=0; i<n; i++) {
        	int a = sc.nextInt(); //가격
        	int b = sc.nextInt(); //갯수
        	hab += a*b;
        }
        if(sum == hab) {
        	System.out.println("Yes");
        } else {
        	System.out.println("No");
        }
	}
}
