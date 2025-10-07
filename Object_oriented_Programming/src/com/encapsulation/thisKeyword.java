package com.encapsulation;

public class thisKeyword {
	
int a=10; //instance variable
	
	thisKeyword(){
		
		//defaultConstructor
		this(20);
		System.out.println("default constructor");
		
	}
	thisKeyword(int a){
		System.out.println("paramitrized constructor");
	}
	
	void show() {
		int a=20; //local variable
		
		System.out.println("a =" + this.a);
		
		System.out.println("");
		this.m2();
	}
	
	void m2() {
		System.out.println("m2 method that is inside the class test");
	}
	
	public static void main(String[] args) {
		
		thisKeyword e=new thisKeyword();
		e.show();
		
	
		
	}

}
