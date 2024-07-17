package Stage2;

import java.util.Scanner;

public class Prob7_2480 {
	public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int money;
	int max = a;
	
	if(a==b && b==c) {
		money = 10000 + (a*1000);
	} else if (a==b || a==c) {
		money = 1000 + (a*100);
	} else if (b==c) {
		money = 1000 + (b*100);
	} else {
		if(b>max) {
			max = b;
		} if(c>max) {
			max = c;
		}
		money = max*100;
	} 
	  System.out.println(money);
	}
}

	  

