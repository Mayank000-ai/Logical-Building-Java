package com.arrayBasic;

import java.util.Scanner;

public class EvenOrNot {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter size:");
		 int n=sc.nextInt();
		 
		 int arr[]=new int[n];
		 
		 
		 int firstElement=0;
		 
		 for(int i=0;i<arr.length-1;i++) {
			 arr[i]=sc.nextInt();
		 }
		 
		 if(arr[firstElement]%2==0) {
			 System.out.println("it is even");
		 }
		 System.out.println("invalid");
		
	}

}
