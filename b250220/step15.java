package b250220;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class step15{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
        
        int A = Integer.parseInt(st.nextToken());
        
        //연도가 4의 배수이면서, 100의 배수가 아닐때 혹은 400의 배수 일때 
        if ( A%4==0 && A%100!=0 || A%400==0) {
        	bw.append("1");
        } else {
        	bw.append("0");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}