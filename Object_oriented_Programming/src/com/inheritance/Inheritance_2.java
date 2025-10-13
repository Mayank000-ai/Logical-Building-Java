package com.inheritance;

class C{
	
	int a;
	int b;
	C(int a,int b){
		this.a=a;
		this.b=b;
	}
	
	void display() {
		System.out.println("display");
	}
}

class D extends C{
	int c;
	int d;
	D(int c,int d,int a,int b){
		  //super calls to constructor
		super(a,b);
		this.c=c;
		this.d=d;
	}
	void show() {
		System.out.println("a=" +a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		
	}
	
}

public class Inheritance_2 {
	public static void main(String[] args) {
		D b=new D(40,20,10,5);
		b.show();
	}

}
