package com.loops;

import java.util.Scanner;

public class SumOfOdd {
	public static void main(String[] args) {
		int n;
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int sum=0;
	    while(n>0){
			int r=n%10;
			if(r%2!=0) {
				sum+=r;
			}
			n=n/10;
		}
		System.out.println(sum);
	}

}
