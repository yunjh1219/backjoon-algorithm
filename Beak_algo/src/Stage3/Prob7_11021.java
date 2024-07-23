package Stage3;

import java.util.*;

public class Prob7_11021 {
	public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        
        for(int i=0; i<n; i++){
          int a = sc.nextInt();
          int b = sc.nextInt();
          int sum = a + b;
          System.out.format("Case #%d: %d\n",i,a+b);
        }
    }
}