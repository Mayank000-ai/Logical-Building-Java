package com.hasArel;

import java.util.ArrayList;
import java.util.List;

class Room{
	private String name;
	
	public Room(String name) {
		this.name=name;
		
	}
}
class House{
	private List<Room> rooms;
	
	public House() {
		this.rooms=new ArrayList<>();
		
		rooms.add(new Room("Living Room"));
		rooms.add(new Room("bed room"));
	}
	
	public List<Room> getRoom(){
		return rooms;
	}
}

public class Compostion {
	public static void main(String[] args) {
		House h1=new House();
		System.out.println(h1.getRoom());
		
		
		
	}

}
