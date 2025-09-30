package com.arrayBasic;

import java.util.Scanner;


//Find out the digits at the current position of an array

public class ArrayFindout {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter size:");
		 int n=sc.nextInt();
		 
		 int arr[]=new int[n];
		 
		
		 System.out.println("enter the array:");
		 for(int i=0;i<arr.length;i++) {
			 arr[i]=sc.nextInt();
		 }
		 
		 System.out.println("enter the position");
		 int pos=sc.nextInt();
		 
		 if(pos>0 && pos<arr.length) {
			 System.out.println("array find out at"+ pos +"="+arr[pos]);
		 }
		 else {
			 System.out.println("element not found");
		 }
		 
		 

	}

}

