package b250317;

//문제 : 개수 세기 

import java.util.Scanner;

public class prob10807 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		int count = 0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int v = sc.nextInt();
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==v) {
				count += 1;
			}
		}
		
		System.out.print(count);
		sc.close();
	}
}
