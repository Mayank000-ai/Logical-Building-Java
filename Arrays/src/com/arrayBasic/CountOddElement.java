package com.arrayBasic;

import java.util.Scanner;

public class CountOddElement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter size:");
		 int n=sc.nextInt();
		 
		 int arr[]=new int[n];
		 
		 
		
		 
		 for(int i=0;i<arr.length;i++) {
			 arr[i]=sc.nextInt();
		 }
		 
		int count=0;
		 for(int i=0;i<=n-1;i++) {
			 if( arr[i] % 2!=0) { 
			    count++;
			 }
		
	}
	   System.out.println(count);
	}

}
