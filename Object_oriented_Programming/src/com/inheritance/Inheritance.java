package com.inheritance;
//inheritance--------------->relation between the classes
//Is-A-relationship------>extends------->
class A{
	int a=10;
	int b=20;
	
	void m1() {
		System.out.println("m1 mwthod inside the class A");
	}
}
class B extends A{
	int c=20;
	int d=15;
	void m1() {
		System.out.println("m2 method");
	}
	void show() {
		System.out.println(super.a+" "+super.b);
		System.out.println(c+" "+d);
		super.m1();
		m1();
	}
}
public class Inheritance {
	
	public static void main(String[] args) {
		B b=new B();
		b.show();
	}

}
