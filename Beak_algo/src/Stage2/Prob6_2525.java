package Stage2;

import java.util.Scanner;

public class Prob6_2525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();   //시간
		int m = sc.nextInt();   //분
		int ov = sc.nextInt();  //오븐
		
		int sum = m+ov;
		int hour;
		int min;
		
		if(sum>59) {
			hour = h + (sum/60); //hour 시간 
			min = sum%60; //min 분 
			if(hour>=24) {
				hour = hour%24;
			} 
		}
		  else {
		    hour = h;
		    min = sum;
		} 
		System.out.println(hour+" "+min);
	}

}

// [%] : 나머지
// [/] : 몫