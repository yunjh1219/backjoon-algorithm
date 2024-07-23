package Stage3;

import java.util.Scanner;

public class Prob11_10952_while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a==0 || b==0) {
				break;
			}
			
			System.out.println(a+b);
		}
		
		
	}
}