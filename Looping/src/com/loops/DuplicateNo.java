package com.loops;

public class DuplicateNo {
	
	public static void main(String[] args) {
		 int arr[]= {3,5,5,6,7,7};
		 
		 for(int i=0;i<arr.length-1;i++) {
			 if(arr[i]==arr[i+1]) {
				 System.out.print(arr[i]+" ");
			 }
		 }
	}

}
