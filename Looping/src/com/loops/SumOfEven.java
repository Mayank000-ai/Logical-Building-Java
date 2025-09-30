package com.loops;

import java.util.Scanner;

public class SumOfEven {
   public static void main(String[] args) {
	   int n;
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int m;
		System.out.println("enter m:");
		m=sc.nextInt();
	
		int sum=0;
		
		for(int i=n;i<=m;i++){
			if(i%2==0) {
				sum+=i;	
			}
			
			
		}
		System.out.println("the sum is:" + sum);
}
}
