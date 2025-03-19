package b250319;

import java.util.Scanner;

public class prob10813 {
	public static void main(String[] args) {
	  
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int arr[] = new int[N];
		int I, J;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		
		for(int i=0; i<M; i++) {
			I = sc.nextInt();
			J = sc.nextInt();
			
			int temp = arr[I-1];
			arr[I-1] = arr[J-1];
			arr[J-1] = temp; 
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}
}
