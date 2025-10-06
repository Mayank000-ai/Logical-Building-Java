package com.intializations;

public class InstanceBlock {
	
	InstanceBlock(){
		System.out.println("Non paramtrized Constructor");
	}
	
	{
		System.out.println("Instance Block");
	}
	public static void main(String[] args) {
		System.out.println("Main method.....");
		InstanceBlock i=new InstanceBlock();
	}

}
