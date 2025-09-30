package com.loops;

import java.util.Scanner;

public class DiagonalElement {
	public static void main(String[] args) {
		int arr[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int n=arr.length;
		int i,j;
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Printing.....");
		
		for(i=0 ; i<n ; i++) {
			for(j=0 ; j<n ;j++) {
				if(i==j) {
					System.out.print(arr[i][j] +" ");
				} else  if(i + j==n-1 ){
					System.out.print(arr[i][j]+" ");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}

}
