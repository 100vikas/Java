package com.basic;

import java.util.Scanner;

public class ArmstrongNum {
	    public static void main(String[] args) {
			int num;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("enter number");
            
			 num=sc.nextInt();
			 int temp=num;
			  int sum=0;
			 while(num>0) {
				 int rem=num%10;
				 sum= sum+rem*rem*rem;
				  num=num/10;
			 }
			 if(temp==sum) {
				 System.out.println("armstrong number");
			 }
			 else {
				 System.out.println("not a armstrog number");
			 }
			 
			
		}

}
