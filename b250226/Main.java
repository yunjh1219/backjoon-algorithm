package b250226;

import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		

		if(A==B && B==C) {
			System.out.print(10000+(A*1000));
		}
		
	}

}
