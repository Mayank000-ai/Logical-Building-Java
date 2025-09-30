package com.arrayBasic;

import java.util.Scanner;

public class LargestElement {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter size:");
		 int n=sc.nextInt();
		 
		 int arr[]=new int[n];
		 int max=arr[0];
		
		 
		 System.out.println("enter the array:");
		 for(int i=0;i<=arr.length-1;i++) {
			 arr[i]=sc.nextInt();
		 }
		 
		 for(int  i=0;i<=arr.length-1;i++) {
			 if(arr[i]>max) {
				 max=arr[i];
			 }
		 }
		 System.out.println("the maximum is :"+ max);
		 
		 
	}

}
