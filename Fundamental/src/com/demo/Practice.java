package com.demo;

import java.util.Scanner;

public class Practice {
	public static void main(String args[]) {
		int num;
		System.out.println("enter the value of num");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		if(num>=0) {
			System.out.println("control enter successfully in outer if block");
			
			if(num==0) {
				System.out.println("number is zero");
			}
			else {
				System.out.println("number is greater than zero");
			}
		}
	}

}
