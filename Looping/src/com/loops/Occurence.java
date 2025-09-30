package com.loops;

import java.util.Scanner;

public class Occurence {
	public static void main(String[] args) {
		int n;
		System.out.println("Enter n:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		int key;
		System.out.println("Enter the key");
		key=sc.nextInt();
		int count=0;
		
		
		while(n!=0) {
			if(n%10==key) {
				count++;
			}
			n=n/10;
		}
		System.out.println( "the count is:" +count);
	}

}
