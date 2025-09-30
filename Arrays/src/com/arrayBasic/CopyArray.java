package com.arrayBasic;

public class CopyArray {
	public static void main(String[] args) {
		 int [] src={3,7,8,2,5,6,4};
		 int n=src.length;
		 
		 int src2[]=new int[n];
		 
		 
		 for(int i=0;i<n;i++) {
			 src2[i]=src[i];
		 }
		 
		 for( int num:src2) {
			 System.out.print(num + " ");
		 }


	}

}
