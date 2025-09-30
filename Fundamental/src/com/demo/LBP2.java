package com.demo;

import java.util.Scanner;

public class LBP2{
	public static void main(String args[]) {
		int n;
		System.out.println("enter n:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		if(n%2!=0) {
			System.out.println("weird");
		}
		else if(n%2==0) {
			if(n>=2 && n<=5) {
				System.out.println("not weird");
			}
			
			else if(n>=6 && n<=20) {
				System.out.println("weird");
			}
			else {
				System.out.println("not weird");
			}
		}
	}
	

}
