package Stage3;

import java.util.Scanner;

public class Prob11_10952_for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for( int i=1; i>=1; i++) {	
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a<=0 || b<=0) {
				break;
			}
			
			int sum = a + b;
			System.out.println(sum);
		}
    }
}