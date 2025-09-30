package com.arrayBasic;

public class SecondSmallest {
	public static void main(String[] args) {
		int arr[]= {3,7,8,2,5,6,4};
		
        int min=arr[0];
		
		 
		 for(int  i=0;i<=arr.length-1;i++) {
			 if(arr[i]<min) {
				 min=arr[i];
			 }
			 
		 }
		 System.out.println("the min is :"+ min);
		 
		 int secondSmallest=arr[0];
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]<secondSmallest && arr[i]!=min) {
				secondSmallest=arr[i];
			}
		}
		System.out.println("the second Smallest is:" +secondSmallest);
		
	}

}
