package com.arrayBasic;

import java.util.Scanner;

public class MiddleElement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter size:");
		 int n=sc.nextInt();
		 if(n%2==0) {
			 System.out.println("Array length must be odd");
			 return ;
		 }
		 
		 int arr[]=new int[n];
		 
		
		 System.out.println("enter" +n+ " array:");
		 for(int i=0;i<arr.length-1;i++) {
			 arr[i]=sc.nextInt();
		 }
		 
		 int middleIndex=n/2;
		 
		 System.out.println("Middle Element" + arr[middleIndex]);
		  sc.close();
		 
		 
	}

}
