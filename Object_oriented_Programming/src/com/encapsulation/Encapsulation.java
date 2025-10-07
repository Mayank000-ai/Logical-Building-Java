package com.encapsulation;

public class Encapsulation {
	private int sid;
	private String name;
	
	public void setData(int sid,String name) {
		this.sid=sid;
		this.name=name;
		
		System.out.println("studentId=" +sid);
		System.out.println("StudentName=" +name);
	}
	
	 public int getSid() {
		return sid;
	}
	
	public String getName() {
		return name;
	}
	public static void main(String args[]) {
		Encapsulation e=new Encapsulation();
		e.setData(1,"Mayank");
	}


}
