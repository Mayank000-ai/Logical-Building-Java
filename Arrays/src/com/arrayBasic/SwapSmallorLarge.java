package com.arrayBasic;

import java.util.Arrays;
import java.util.Scanner;

public class SwapSmallorLarge {
	public static void main(String[] args) {
		
		 int arr[]= {3,7,8,2,5,6,4};
		 int maxIndex=0;
		 int minIndex=0;
		 int n=arr.length;
		
		 for(int  i=0;i<n;i++) {
			 if(arr[i]>arr[maxIndex]) {
				 maxIndex=i;
			 }
			 if(arr[i]<arr[minIndex]) {
				 minIndex=i;
			 }
			  
		 }
		 System.out.println(arr[maxIndex]);
		 System.out.println(arr[minIndex]);
		 
         int temp=arr[minIndex];
         arr[minIndex]=arr[maxIndex];
         arr[maxIndex]=temp;
			
			 
	   for( int num:arr) {
		   System.out.print(num +" ");
		   
	   }
		 
	}

}
