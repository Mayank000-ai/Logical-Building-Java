package com.arrayBasic;

import java.util.Scanner;

public class SmallestElement {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter size:");
	 int n=sc.nextInt();
	 
	 int arr[]=new int[n];
	 
	 
	 System.out.println("enter the array:");
	 for(int i=0;i<=arr.length-1;i++) {
		 arr[i]=sc.nextInt();
	 }
	 
	 int min=arr[0];
	 
	 for(int  i=0;i<=arr.length-1;i++) {
		 if(arr[i]<min) {
			 min=arr[i];
		 }
	 }
	 System.out.println("the minimum is :"+ min);
	 
}
}
