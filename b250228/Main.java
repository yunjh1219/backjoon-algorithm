package b250228;

import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		for(int i=1; i<=a; i++) {
			int b = scan.nextInt();
			int c = scan.nextInt();
			System.out.printf("Case #%d: %d + %d = %d\n", i, b, c, b+c);
		}
		scan.close();
	}
}
