package b250221;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class step16 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int ov = Integer.parseInt(st.nextToken());
        
        int sum = m + ov;
        int hour, min;

        if (sum >= 60) {
            hour = h + (sum / 60);
            min = sum % 60;
            if (hour >= 24) {
                hour = hour % 24;
            }
        } else {
            hour = h;
            min = sum;
        }

        bw.append(hour + " " + min);
        bw.flush();

        br.close();
        bw.close();
    }
}