package b250219;


	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.InputStreamReader;
	import java.io.OutputStreamWriter;
	import java.util.StringTokenizer;

	public class step13 {
	    public static void main(String[] args) throws Exception {
	        // BufferedReader와 BufferedWriter 객체 생성
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        
	        // 입력받은 값을 StringTokenizer로 분리
	        StringTokenizer st = new StringTokenizer(br.readLine());

	        // 토큰을 정수로 변환
	        int A = Integer.parseInt(st.nextToken());
	        int B = Integer.parseInt(st.nextToken());

	        // 삼항 연산자를 사용하여 A와 B 비교 후 결과 출력
	        String result = (A > B) ? ">" : (A < B) ? "<" : "==";
	        bw.append(result);

	        // 출력 버퍼 비우기
	        bw.flush();
	        bw.close();
	    }
	}

