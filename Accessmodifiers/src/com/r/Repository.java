package com.r;

import com.s.Service;

public class Repository {
	
	private String name="Mayank";
	
	public static void main(String[] args) {
		Service s1=new Service();
		System.out.println(s1.service);
		
		Repository r1=new Repository();
		System.out.println(r1.name);
		
		Path p4=new Path();
		System.out.println(p4.city);
	}

}
