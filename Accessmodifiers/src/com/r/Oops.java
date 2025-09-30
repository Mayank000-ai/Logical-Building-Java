package com.r;

public class Oops {
	String name;
	int age;
	
	
	 private Oops(String na,int ag){
		name=na;
		age=ag;
	}
	 
	 void display() {
		 System.out.println("name=" +name);
		 System.out.println("age=" +age);
		 
	 }
	public static void main(String[] args) {
		Oops obj=new Oops("mayank",25);
		obj.display();
		
	}

}
