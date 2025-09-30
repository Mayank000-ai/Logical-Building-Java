package com.arrayBasic;

import java.util.Scanner;

public class DIsplayEven {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter size:");
		 int n=sc.nextInt();
		 
		 int arr[]=new int[n];
		 
		 
		
		 
		 for(int i=0;i<arr.length;i++) {
			 arr[i]=sc.nextInt();
		 }
		 
		 
		 for(int i=0;i<=n-1;i++) {
			 if( arr[i]%2==0) {
				 
			    System.out.print("the digits are:" +arr[i]+" ");
			 }
		
	}
	

}
	
}
