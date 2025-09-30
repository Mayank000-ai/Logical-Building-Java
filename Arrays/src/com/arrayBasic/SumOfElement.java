package com.arrayBasic;

import java.util.Scanner;

public class SumOfElement {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter size:");
		 int n=sc.nextInt();
		 
		 int arr[]=new int[n];
		 
		 
		
		 
		 for(int i=0;i<arr.length;i++) {
			 arr[i]=sc.nextInt();
		 }
		 int sum=0;
		 
		 
		 for(int i=0;i<=n-1;i++) {
			 sum+=arr[i];
		 }
		 System.out.println(" the sum of" + n + "in an array is:" + sum);
	}

}
