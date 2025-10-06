package com.intializations;

public class SetterIntialization {
	String model;
	int price;
	//SetterIntialization
	void setCar(String m, int p) {
		model=m;
		price=p;
		
		System.out.println("model:" +model);
		System.out.println("price:"+price);
	}
	
	public static void main(String[] args) {
		
		SetterIntialization s1=new SetterIntialization();
		s1.setCar("creta", 1500000);
		
	}

}
