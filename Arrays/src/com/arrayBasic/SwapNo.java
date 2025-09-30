package com.arrayBasic;

import java.util.Scanner;

public class SwapNo {
	
	public static void main(String[] args) {
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		if(x<=arr.length-1 && y<=arr.length-1) {
			int temp=arr[x];
			arr[x]=arr[y];
			arr[y]=temp;
		}
		else {
			System.out.println("not valid");
		}
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]);
		}
		
		
	}

}
