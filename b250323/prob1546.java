package b250323;

// M = 최댓값
// 나머지 시험 점수 = 점수/M*100 으로 고쳤다 
// 시험 점수를 이렇게 고쳤을 때의 평균 
// (첫째줄) N = 시험 본 과목의 갯수 
// (둘째줄) : 시험 점수 

import java.util.Arrays;
import java.util.Scanner;

public class prob1546 {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	double score[] = new double[n];
	double max = 0;
	double sum = 0;
	
	for(int i=0; i<n; i++) {       //값 입력받고 오름차순 정렬
		score[i] = sc.nextInt();
	}
	
	Arrays.sort(score);
	max = score[n-1];  //최댓값
	
	for(int i=0; i<n; i++) {
		score[i] = score[i]/max*100;  // 그 기준으로 나머지 점수 재수정 
	}
	
	for(int i=0; i<n; i++) {
		sum += score[i];
	}
	
	System.out.print(sum/n);
	
	}
}
