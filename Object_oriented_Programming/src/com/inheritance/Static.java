package com.inheritance;
//static behviour
public class Static {
	int a=10;
	static int b=10;
	public static void main(String[] args) {
		Static s=new Static();
		
		s.a++;
		s.b++;
		s.a++;
		s.b++;
		
		System.out.println(s.a);
		System.out.println(s.b);
	
		
		Static s1=new Static();
		s1.a++;
		s1.b++;
		s1.a++;
		s1.b++;
		
		
		System.out.println(s1.a);
		System.out.println(s1.b);
			
		
	}

}
