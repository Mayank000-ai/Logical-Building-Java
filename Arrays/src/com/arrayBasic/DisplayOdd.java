package com.arrayBasic;

import java.util.Scanner;

public class DisplayOdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter size:");
		 int n=sc.nextInt();
		 
		 int arr[]=new int[n];
		 
		 
		
		 
		 for(int i=0;i<arr.length;i++) {
			 arr[i]=sc.nextInt();
		 }
		 
		 
		 for(int i=n-1;i>=0;i--) {
			 if(arr[i]%2!=0) {
				 
			    System.out.println("the digits are:" +arr[i]+" ");
			    break ;
			 }
		
	}
	}

}
