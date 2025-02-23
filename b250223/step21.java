package b250223;

import java.util.Scanner;

public class step21 {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int  i=1; i<=n; i++) {
			for(int u=1; u<=n-i; u++) {
				System.out.print(" ");
			}
			for(int c=1; c<=i; c++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}
