package Stage2;

import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int m = sc.nextInt();
        int newH, newM;
	   
		if(m>=45) {
			newH = h;
			newM = m-45;
		} else {
			newH = h-1;
			newM = m+15;
			if (newH < 0) {
				newH=23;
			}
		} 
		System.out.println(newH+" "+newM);
		
	}
}


