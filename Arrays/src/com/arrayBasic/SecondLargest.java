package com.arrayBasic;

import java.util.Scanner;

public class SecondLargest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		
		 int arr[]= new int[n];
		 for(int i=0;i<n;i++) {
			 arr[i]=sc.nextInt();
		 }
		 
		 
		 int max=arr[0];
		
		
		 
		 
		 for(int  i=0;i<=arr.length-1;i++) {
			 if(arr[i]>max) {
				 max=arr[i];
			 }
			 
		 }
		 System.out.println("the maximum is :"+ max);
		 
		 int secondLargest=arr[0];
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]>secondLargest && arr[i]!=max) {
				secondLargest=arr[i];
			}
		}
		System.out.println("the second largest is:" +secondLargest);
	}

}
