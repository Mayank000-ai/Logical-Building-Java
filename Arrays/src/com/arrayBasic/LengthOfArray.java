package com.arrayBasic;

import java.util.Scanner;

public class LengthOfArray {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter size:");
		 int n=sc.nextInt();
		 
		 int arr[]=new int[n];
		 System.out.println("enter array");
		 for(int i=0;i<arr.length;i++) {
			 arr[i]=sc.nextInt();
		 }
		  System.out.println(arr.length);
	}

}
