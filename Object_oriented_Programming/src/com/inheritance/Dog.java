package com.inheritance;

class Animal{
	Animal(){
		System.out.println("Animal constructor called");
	}
	
}
class Dogs extends Animal{
	Dogs(){
		System.out.println("Dog Constructor called");
	}
}

class German extends Dogs{
	German(){
		System.out.println("german sefaurt");
	}
}

public class Dog{
	public static void main(String[] args) {
		German g=new German();
	}
	

}
