package com.loops;

import java.util.Scanner;

public class Count {
	public static void main(String[] args) {
		int n;
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int count=0;
		while(n>0) {
			count++;
			n=n/10;
			
		}
		System.out.println("the count is:" + count);
	}

}
