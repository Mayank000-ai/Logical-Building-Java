package com.loops;

public class RotateArray {
	
	public static void reverse(int arr[],int start,int end) {
		while(start<=end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	public static void main(String[] args) {
		int num[]= {10,20,30,40,50,60,70};
		int k=3;
		
		k=k% num.length;
		
		reverse(num,0,num.length-1);
		reverse(num,0,k-1);
		reverse(num,k,num.length-1);
		
		for( int nums: num) {
			System.out.print(nums+" ");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
