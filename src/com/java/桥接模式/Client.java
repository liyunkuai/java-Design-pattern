package com.java.桥接模式;

public class Client {

	public static void main(String[] args) {
		Ordinary implOrdinary = new Ordinary();
		
		Sugar implSugar= new Sugar();
		
		LargeCoffee largeCoffeeimplOrdinary=new LargeCoffee(implOrdinary);
		largeCoffeeimplOrdinary.makeCoffee();
		
		SmallCoffee smallCoffeeimplOrdinary = new SmallCoffee(implOrdinary);
		smallCoffeeimplOrdinary.makeCoffee();
		
		LargeCoffee largeCoffeeimplSugar=new LargeCoffee(implSugar);
		largeCoffeeimplSugar.makeCoffee();
		
		SmallCoffee smallCoffeeimplSugar = new SmallCoffee(implSugar);
		smallCoffeeimplSugar.makeCoffee();

	}

}
