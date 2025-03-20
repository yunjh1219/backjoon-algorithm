package b250320;

import java.util.Scanner;

public class prob2439 {
	   public static void main(String[]args){
	        Scanner sc = new Scanner(System.in);
	        int t = sc.nextInt();
	        
	        for(int i=1; i<=t; i++){
	            for(int k=1; k<=t-i; k++){
	                System.out.print(" ");
	            }
	            for(int j=1; j<=i; j++){
	                System.out.print("*");
	            }
	            System.out.println("");
	        }
	    }
	}