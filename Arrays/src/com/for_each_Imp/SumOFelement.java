package com.for_each_Imp;

import java.util.Scanner;

public class SumOFelement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter size:");
		 int n=sc.nextInt();
		 
		 int arr[]=new int[n];
		 
		 
		
		 
		 for(int i=0;i<arr.length;i++) {
			 arr[i]=sc.nextInt();
		 }
		 int sum=0;
		 
		 for( int num:arr) {
			 sum+=num;
		 }
		 System.out.println(sum);
	}

}
