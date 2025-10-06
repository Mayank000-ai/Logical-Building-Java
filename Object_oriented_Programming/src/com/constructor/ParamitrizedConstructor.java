package com.constructor;

public class ParamitrizedConstructor {
	String name;
	int age;
	
	ParamitrizedConstructor(String na,int ag){
		name=na;
		age=ag;
		
	  System.out.println("name:"+name);
	  System.out.println("age:"+age);
	  
 }
		
	public static void main(String[] args) {
		ParamitrizedConstructor p=new ParamitrizedConstructor("Mayank",21);	
		
	}

}
