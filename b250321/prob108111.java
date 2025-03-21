package b250321;

import java.util.Scanner;

public class prob108111 {
	public static void main(String[] args) {
	 
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[] = new int[n];

 		
		for(int i=0; i<n; i++) {  
			arr[i]=i+1;      // index는 [0]부터 시작이니 i+1 
		}
		
		for(int i=0; i<m; i++) {
			int I = sc.nextInt()-1; 
			int J = sc.nextInt()-1; 
			
			int tmp[] = new int[J-I+1];
			int tmpindex = 0;
			
			for(int o=J; o>=I; o--) {
				tmp[tmpindex++] = arr[o];
			}
			
			tmpindex = 0;
			for(int o=I; o<=J; o++) {
				arr[o] = tmp[tmpindex++];
			}
			
		}
		  // 결과 출력
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}