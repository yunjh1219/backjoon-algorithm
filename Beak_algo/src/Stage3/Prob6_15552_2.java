import java.io.*;  // 입출력 관련 라이브러리들을 임포트합니다.
import java.util.StringTokenizer; // 문자열을 토큰으로 분리하기 위해 StringTokenizer를 임포트합니다.

public class Prob6_15552_2 {
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력을 받기 위한 BufferedReader를 생성합니다.
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 출력을 하기 위한 BufferedWriter를 생성합니다.

        int T = Integer.parseInt(br.readLine()); // 첫 번째 입력 값을 정수로 변환하여 T 변수에 저장합니다. (테스트 케이스 수)

        StringTokenizer st;
        for (int i = 0; i < T; i++) { // T 번 반복합니다.
            st = new StringTokenizer(br.readLine(), " "); // 입력된 한 줄을 공백을 기준으로 나눕니다.
            int A = Integer.parseInt(st.nextToken()); // 첫 번째 숫자를 정수로 변환하여 A에 저장합니다.
            int B = Integer.parseInt(st.nextToken()); // 두 번째 숫자를 정수로 변환하여 B에 저장합니다.
            bw.write((A + B) + "\n"); // A와 B의 합을 계산하여 결과를 문자열로 변환한 후 BufferedWriter에 씁니다.
        }
        br.close(); // BufferedReader를 닫습니다.
        
        bw.flush(); // 남아 있는 데이터를 모두 출력합니다.
        bw.close(); // BufferedWriter를 닫습니다.
    }
}