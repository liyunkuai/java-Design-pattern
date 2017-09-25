package com.java.桥接模式;

public class SmallCoffee extends Coffee{

	public SmallCoffee(CoffeeAdditives impl) {
		super(impl);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeCoffee() {
		// TODO Auto-generated method stub
		System.out.println(" 小杯的 "+ impl.addSomething() + " 咖啡 ");
	}

}
