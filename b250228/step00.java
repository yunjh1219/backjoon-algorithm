package b250228;

public class step00 {
 public static void main(String[]args) {
	 
	 int a = 0;
	 int b = 0;
	 
	 for(int i=1; i<=1000; i++) {
		 if(i%3==0) {
			 a += i;
		 }
		 if(i%5 == 0) {
			 b += i;
		 }
	 }
	 System.out.print(a+b);
 }
}
