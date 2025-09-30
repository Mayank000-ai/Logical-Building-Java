package com.arrayBasic;

import java.util.Scanner;

public class LastElement {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter size:");
		 int n=sc.nextInt();
		 
		 int arr[]=new int[n];
		 
		 int LastElement=arr.length-1;
		 
		 System.out.println("enter the array:");
		 for(int i=0;i<=arr.length-1;i++) {
			 arr[i]=sc.nextInt();
		 }
		 
		 System.out.println(arr[LastElement]);
		 
	}

}
