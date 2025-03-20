package b250320;

import java.util.Scanner;

public class prob3052 {
	public static void main(String[]args) {
	  Scanner sc = new Scanner(System.in);
	  int arr[] = new int[10];
	  boolean b;
	  int count = 0;
	  
	  for (int i=0; i<arr.length; i++) {
        arr[i] = sc.nextInt()%42;	  
	}
	  
	  
	  for(int i=0; i<arr.length; i++) {
		  b = false;
		  
		  for(int j=i+1; j<arr.length; j++) {
			  if(arr[i] == arr[j]) {
				  b = true;
				  break;
			  }
		  }
		  if (b == false) {
			  count++;
		  }
		  
	  }
	  
	  System.out.print(count);
	  
  }
}
