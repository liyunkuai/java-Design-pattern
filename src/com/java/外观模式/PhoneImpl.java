package com.java.外观模式;

public class PhoneImpl implements Phone{

	@Override
	public void dail() {
		// TODO Auto-generated method stub
		System.out.println("打电话");
	}

	@Override
	public void hagup() {
		// TODO Auto-generated method stub
		System.err.println("挂断");
	}

}
