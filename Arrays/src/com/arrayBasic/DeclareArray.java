package com.arrayBasic;

import java.util.Scanner;

//DeclareArray
public class DeclareArray {
	public static void main(String[] args) {
		//dynamic intialization
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the array:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("printing elements:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		//static  intialization
		int arr1[]= {1,2,3,4};
		 for(int i=0;i<arr1.length;i++) {
			 System.out.print(arr1[i]);
		 }
		
	
		
	}

}
