package com.java.外观模式;

public class SamsungCamera implements Camera{

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("打开相机");
	}

	@Override
	public void takePicture() {
		// TODO Auto-generated method stub
		System.out.println("拍照");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("关闭");
	}

}
