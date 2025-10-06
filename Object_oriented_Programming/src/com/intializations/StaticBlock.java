package com.intializations;

public class StaticBlock {
	StaticBlock(){
		System.out.println("this is constructor");
	}
	//StaticBlock
	static {
		System.out.println("static block......");
	}
	
	//InstanceBlock
	{
		System.out.println("Instance Block.....");
	}
	public static void main(String[] args) {
		
		StaticBlock s=new StaticBlock();
		StaticBlock s1=new StaticBlock();
		 
	}

}
