package com.r;

public class Instance {
	int x;
	static int y;

	static {
		y=10;
		System.out.println("static block executed");
		
	}
	void show() {
		System.out.println("Y="+y);
	}
	
	
	public static void main(String[] args) {
		new Instance();
		
		
		Instance s1=new Instance();
		s1.show();
		s1.show();
		
		Instance s2=new Instance();
		s2.show();
		
	}

	

}
