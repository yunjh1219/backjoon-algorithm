package b250222;

//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

import java.util.Scanner;

public class step18 {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		for(int i=1; i<=a; i++){
			int b = scan.nextInt();
			int c = scan.nextInt();
			System.out.println(b+c);
		}
		
		scan.close();
	}
}
