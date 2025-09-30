package com.demo;

import java.util.Scanner;

public class LBP4 {
	
	public static void main(String args[]) {
		
		int num;
		System.out.println("enter the sale count");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		if(num>=30 && num<=50) {
			System.out.println("D");
		}else if(num>=51 && num<=60) {
			System.out.println("C");
			
		}else if(num>=61 && num<=80) {
			System.out.println("B");
		}
		else {
			System.out.println("A");
		}
		
	}

}
