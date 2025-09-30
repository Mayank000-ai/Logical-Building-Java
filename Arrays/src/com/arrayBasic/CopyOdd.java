package com.arrayBasic;

public class CopyOdd {
	public static void main(String[] args) {
		 int [] src={3,7,8,2,5,6,4};
		 int n=src.length;
		
		 int count=0;
		 
		 for(int i=0;i<n;i++) {
			 if(src[i]%2!=0) {
				 count++;
				 
			 }
			
		 }
		 
		 
		 int evenArray[]=new int [count];
		 int j=0;
		 
		 for(int i=0;i<=src.length-1;i++) {
			 if(src[i]%2!=0) {
				 evenArray[j]=src[i];
				 j++;
			 }
		 }
		 
		 
		 for(int i=0;i<evenArray.length;i++) {
			 System.out.print(evenArray[i] +" ");
		 }
	}

}
