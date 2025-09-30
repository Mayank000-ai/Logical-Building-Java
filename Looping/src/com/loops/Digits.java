package com.loops;

import java.util.Scanner;

public class Digits {
	public static void main(String[] args) {
		int n;
		System.out.println("Enter the no");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.println(i);
		}
	}

}
