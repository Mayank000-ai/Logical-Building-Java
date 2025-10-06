package com.intializations;

public class ConstructorIntialize {
	
	String name;
	int age;
	//defaultConstructor
	ConstructorIntialize(){
		System.out.println("This is Constructor Intializing.....");
	}
	//paramitrizedConstructor
	ConstructorIntialize(String na,int ag){
		name=na;
		age=ag;
		
	  System.out.println("name:"+name);
	  System.out.println("age:"+age);
	  
	   }
		

		public static void main(String[] args) {
			ConstructorIntialize obj=new ConstructorIntialize();
			ConstructorIntialize obj2=new ConstructorIntialize("Mayank",21);
		
		
	}
		
}


				