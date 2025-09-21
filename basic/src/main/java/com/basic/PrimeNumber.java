package com.basic;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter number");
        
		 num=sc.nextInt();  // 7
		 boolean status = true;
		 for(int i=2;i<num;i++) {                        // 2 to 6 
			 if(num%i==0) {                     // 7%2=1 : false ,7%3=1 false ,... 7%6=0:true..
				status = false; 								//        0           0              0
				break;
			 }
			  
		 }
		 if(status) {
			 System.out.println("prime number");
		 }
		 else {
			 System.out.println("not a prime number");
		 }
	}

}
