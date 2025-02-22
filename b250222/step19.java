package b250222;

import java.util.Scanner;

public class step19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt(); // 사용자 입력 받기
        int sum = 0; // 합을 저장할 변수 초기화
        
        for (int i = 1; i <= n; i++) { // 1부터 n까지 반복
            sum += i; // 누적합 계산
        }
        
        System.out.println(sum); // 결과 출력
        scan.close(); // Scanner 닫기
    }
}
