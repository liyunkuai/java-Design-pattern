package com.java.桥接模式;

public class LargeCoffee extends Coffee{

	public LargeCoffee(CoffeeAdditives impl) {
		super(impl);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeCoffee() {
		System.out.println(" 大杯的 "+ impl.addSomething() + " 咖啡");
	}

}
