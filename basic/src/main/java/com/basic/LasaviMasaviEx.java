package com.basic;

import java.util.Scanner;
import java.util.logging.Logger;

public class LasaviMasaviEx {
	public static final Logger log = Logger.getLogger(LasaviMasaviEx.class.getName());

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		log.info("enter the first number :");
		int num1 = sc.nextInt();
		log.info("enter the second number :");
		int num2 = sc.nextInt();

		int bigNum = 0;
		if (num1 > num2) {
			bigNum = num1;
		} else {
			bigNum = num2;
		}

		int lasavi = bigNum;
		boolean status = true;

		for (int i = 2;status; i++) {
			lasavi = bigNum * i;
			if (lasavi % num1 == 0 && lasavi % num2 == 0) {
				status = false;
			}
		}
		log.info(lasavi + "");
		
//		int index = 2;
//		int lasavi = bigNum*index;
//		boolean status = true;
//
//		while(status) {
//			if(lasavi%num1==0 && lasavi%num2==0) {
//				status =false;
//			}
//			else {
//				index++;
//				lasavi = bigNum*index;
//			}
//		}
//		System.out.println(lasavi);
		sc.close();
	}
}
