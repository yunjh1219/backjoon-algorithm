package b250319;

import java.util.Scanner;

public class prob5597 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
	  int stu[] = new int[30];
	  boolean sto[] = new boolean[30];
	  
	  for (int i=0; i<stu.length; i++) {
		  stu[i] = i+1;
	  }
	  
	  for (int i=0; i<28; i++) {
		  int n = sc.nextInt();
		  sto[n-1] = true;
	  }
	  
        
        for( int i=0; i<30; i++) {
        	if(sto[i] == false) {
       
        		System.out.println(stu[i]);
        	}
        }
        sc.close();
	}
}
