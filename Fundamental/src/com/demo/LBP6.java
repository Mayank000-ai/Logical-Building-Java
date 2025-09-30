package com.demo;

import java.util.Scanner;

public class LBP6 {
	public static void main(String args[]) {
		int cup;
		System.out.println("enter cup");
		Scanner sc=new Scanner(System.in);
		cup=sc.nextInt();
		int totalCup=cup+(cup/6);
		System.out.println(totalCup);
	}

}
