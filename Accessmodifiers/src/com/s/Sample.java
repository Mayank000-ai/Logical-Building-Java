package com.s;

import com.r.Path;

public class Sample extends Path {
	//instance variable
	int s=10; //default
	
	public static void main(String[] args) {
		
	  Sample s1=new Sample();
	  System.out.println(s1.s);
	  
	  
	  Service ss=new Service();
	  System.out.println(ss.service);
	  
	  
	  Sample s3=new Sample();
	  System.out.println(s3.city);
		
	}

}
