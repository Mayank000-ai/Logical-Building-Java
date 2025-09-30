package com.demo;

import java.util.Scanner;

public class Perform {
public static void main(String args[]) {
		
		int a;
		int b;
		
		float c;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a:");
		a=sc.nextInt();
		
		System.out.println("enter b:");
		b=sc.nextInt();
		
		System.out.println("enter c:");
		c=sc.nextFloat();
		
		System.out.println("arthimetic operator:");
		
		//arthimetic operator
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		//divsion answer in float
		System.out.println(a/c);
		System.out.println(a%c);
		
		// Assignment operator
		a+=5;
		System.out.println("result is:" +a);
		a-=5;
		System.out.println("result is:" +a);
		b*=5;
		System.out.println("result is:" +b);
		a/=5;
		System.out.println("result is:" +a);
		a%=5;
		System.out.println("result is:" +a);
		
		//relational operator
		
		System.out.println("result is:" +(a<b));
		System.out.println("result is:" +(a>b));
		System.out.println("result is:" +(a==b));
		System.out.println("result is:" +(a<=b));
		System.out.println("result is:" +(a>=b));
		System.out.println("result is:" +(a!=b));
		
		//logical operator
		 boolean x;
		 System.out.println("enter x:");
		 x=sc.nextBoolean();
		 
		 boolean y;
		 System.out.println("enter y:");
		 y=sc.nextBoolean();
		 
		 System.out.println("result is:" +(x&&y));
		 System.out.println("result is:" +(x||y));
		 System.out.println("result is:" +!(x&&y));

}

}
