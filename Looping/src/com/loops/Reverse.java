package com.loops;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		int n;
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int rev=0;
		while(n>0) {
			int r=n%10;
			rev=(rev*10)+r;
			n=n/10;
		}
		System.out.println("the reverse is:" + rev);
	}

}
