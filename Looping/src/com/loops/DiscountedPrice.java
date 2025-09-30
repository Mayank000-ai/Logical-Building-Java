package com.loops;

import java.util.Scanner;

public class DiscountedPrice {
	
	public static void main(String[] args) {
		int n;
		System.out.println("Enter n:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int disCountedPrice=0;
		
		for(int i=1;i<=n;i++) {
			int r=n%10;
			if(r==2||r==3||r==5||r==7) {
				disCountedPrice+=r;
			}
			n=n/10;
		}
		System.out.println("the discounted price is:" +disCountedPrice);
	}

}
