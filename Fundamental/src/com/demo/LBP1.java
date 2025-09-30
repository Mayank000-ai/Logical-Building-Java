package com.demo;

import java.util.Scanner;

public class LBP1 {
	
	public static void main(String args[]) {
		int n;
		System.out.println("enter n:");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		
		if(n%2==0) {
			System.out.println("even");
		}
		else if(n%2!=0) {
			System.out.println("odd");
		}
		else {
			System.out.println("invalid");
		}
	}

}
