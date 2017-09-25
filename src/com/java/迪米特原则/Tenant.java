package com.java.迪米特原则;

public class Tenant {
	
	public float roomArea=16;
	public float roomPrice=2500;
	public static final float diffprice = 100.001f;
	public static final float diffArea= 0.00001f;
	
	public void rentRoom(Mediator mediator) {
		System.out.println("租到房子拉 : "+mediator.rentOut(roomArea, roomPrice));
	}
}
