package com.arrayBasic;

public class SwapEvenOrOdd {
	
	public static void main(String[] args) {
		int arr[]= {3,7,8,2,1,4};
		int firstEven=0;
		int lastOdd=arr.length-1;
		
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]%2==0) {
				firstEven=i;
				break;
			}
		}
		
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]%2!=0) {
			   lastOdd=i;
			   break;
			}
			
		}
		
		System.out.println(arr[firstEven]);
		System.out.println(arr[lastOdd]);
		
		
		int temp=arr[firstEven];
		arr[firstEven]=arr[lastOdd];
		arr[lastOdd]=temp;
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i] +" ");
		}
	}

}
