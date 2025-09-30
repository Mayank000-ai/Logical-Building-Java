package com.arrayBasic;

import java.util.Scanner;

public class ReverseArray {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
		 System.out.println("enter size:");
		 int n=sc.nextInt();
		 
		 int arr[]=new int[n];
		 
		
		 System.out.println("enter the array:");
		 for(int i=0;i<arr.length;i++) {
			 arr[i]=sc.nextInt();
		 }
		 int temp;
		 int i=0;
		 int j=arr.length-1;
		 while(i<j) {
			 temp=arr[i];
			 arr[i]=arr[j];
			 arr[j]=temp;
			 i++;
			 j--;
			 
		 }
		 System.out.println("Reversed Array :");
		 for(int  k=0;k<arr.length;k++) 
		 {
			 System.out.print(arr[k]+" ");
			 
		 }
}
}
