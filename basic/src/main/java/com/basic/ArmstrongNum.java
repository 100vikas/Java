package com.basic;

public class ArmstrongNum {
	    public static void main(String[] args) {
		
			int num=153;
			int temp=num;
			int sum=0;
			int nleng=String.valueOf(num).length();
			
			while(num>0) {
				int rem=num%10;
				   num=num/10;
				  sum+=Math.pow(rem,nleng);
	     
			}
			
			if(temp==sum) {
				System.out.println("armstrong number");
			}
			else {
				System.out.println("not armstrong number");
			}
		}

}
