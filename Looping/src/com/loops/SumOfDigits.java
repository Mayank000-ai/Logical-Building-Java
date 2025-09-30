package com.loops;

import java.util.Scanner;

public class SumOfDigits {
	
	public static void main(String[] args) {
		int n;
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int sum=0;
		
		for(int i=1;i<=n;i++) {
			int r=n%10;
			sum+=r;
			n=n/10;
			
		}
		System.out.println("the sum is:" + sum);
	}

}
