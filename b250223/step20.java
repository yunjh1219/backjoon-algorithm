package b250223;

//첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제

import java.util.Scanner;

public class step20 {
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int u=1; u<=i; u++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
