package com.java.迪米特原则;

public class Room {
	public float area;
	public float price;
	
	public Room(float area,float price){
		this.area=area;
		this.price=price;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Room [ area = "+area+" , price = "+ price +"]";
	}
}
