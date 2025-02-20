package b250220;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class step14 {
	public static void main(String[]args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		
		if(A>=90) {
			bw.append("A");
		} else if (A >=80) {
			bw.append("B");
		} else if (A>=70) {
			bw.append("C");
		} else if (A>=60) {
			bw.append("D"); 
		} else {
			bw.append("F");
		}
	bw.flush();
	bw.close();
	}
}
