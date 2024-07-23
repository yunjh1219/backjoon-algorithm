package Stage3;

import java.util.*;

public class Prob10_2439 {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
     int n = sc.nextInt();
     
     for(int i=1; i<=n; i++) {
    	 for(int k=1; k<=n-i; k++) {
			 System.out.print("_");
		 }
    	 for(int j=1; j<=i; j++) {
    		 System.out.print("*");
    	 }
    	 System.out.println(" ");
     }
     
     
	}
}

 