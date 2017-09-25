package com.java.迪米特原则;

public class Main {

	public static void main(String[] args) {
		Tenant tenant= new Tenant();
		Mediator mediator = new Mediator();
		tenant.rentRoom(mediator);

	}

}
