package b250318;

import java.util.Scanner;

public class prob2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[9];

		int max = arr[0];
		int n = 0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				n = i+1;
			}
		}
		

		System.out.println(max);
		System.out.print(n);
		sc.close();
	}
}
