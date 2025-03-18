package b250318;

import java.util.Scanner;

public class prob10810 {
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);	
	 
	 int n = sc.nextInt();
	 int baguni[] = new int[n]; // n개의 바구니 
	 
	 int m = sc.nextInt(); // 공을 넣을 횟수 : m
	 
	 int i, j, k;   // i부터 j까지 k 값을 입력

	 for(int I=0; I<m; I++) {  //총 m번 실행할 것이다.
		 i = sc.nextInt();
		 j = sc.nextInt();
		 k = sc.nextInt();
		 
		 /* 배열의 인덱스는 0부터 시작이다. 
		  * 바구니는 1번부터 N개고, 인덱스는 0번부터 N-1 개다.
		  * 즉 [i번 바구니 = i-1번 인덱스] 라는 의미이므로, i-1 를 해줘야 한다.
		  * */
	 	 for(int J=i-1; J<j; J++) { 
			 baguni[J] = k;
		 }
     }
	 
	 for(int K=0; K<baguni.length; K++) {
		 System.out.print(baguni[K]+" ");
	 }
	 sc.close();
  }
}
