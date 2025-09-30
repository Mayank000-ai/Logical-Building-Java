package com.for_each_Imp;

import java.util.Scanner;

public class SumOfOdd {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter size:");
		 int n=sc.nextInt();
		 
		 int arr[]=new int[n];
		 int sum=0;
		 
		
		 
		 for(int i=0;i<arr.length;i++) {
			 arr[i]=sc.nextInt();
		 }
		 
		 
		 for( int num:arr) {
			 if(num%2!=0) {
				 sum+=num;
				 
			 }
				 
		 }
		 
	}
	  

}
