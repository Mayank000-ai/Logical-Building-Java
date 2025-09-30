package com.arrayBasic;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter size:");
		 int n=sc.nextInt();
		 
		 int arr[]=new int[n];
		 
		
		 System.out.println("enter the array:");
		 for(int i=0;i<arr.length;i++) {
			 arr[i]=sc.nextInt();
		 }
		 
		 
		 int LastElement=arr[arr.length-1];
		 System.out.println("the muliplication table is:");
		 for(int i=1;i<=10;i++) {
			 System.out.println(LastElement +" * " + i + " = "+ (LastElement*i));
		 }
	}

}
