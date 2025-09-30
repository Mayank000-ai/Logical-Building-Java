package com.for_each_Imp;

import java.util.Scanner;

public class EvenElements {
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
			 if(num % 2==0) {
				 System.out.print(num);
			 }
		 }
	}

}
