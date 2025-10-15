package com.hasArel;

import java.util.ArrayList;
import java.util.List;

//Association------>Has-A-Relationship
class Department{
	 private String name;
	 public Department(String name) {
		 this.name=name;
	 }
	 @Override
	 public String toString() {
		return "Department [name=" + name + "]";
	 }
}

class University{
	
	private String name;
	
	private List<Department> departments; //Aggregation
	
	public University(String name) {
		this.name=name;
		this.departments=new ArrayList<>();
		
	}
	public void addDepartment(Department department) {
		departments.add(department);
	}
	
	void display() {
		System.out.println(name+" "+departments);
	}
	
}

public class Composition {
	public static void main(String[] args) {
		
		Department d=new Department("CSE");
		
		University u=new University("NIT Jaipur");
		u.addDepartment(d);
		u.display();
		
		
		
		
	}

}
