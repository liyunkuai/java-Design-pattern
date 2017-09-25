package com.java.外观模式;

public class MobilePhone {
	private Phone mPhone = new PhoneImpl();
	private Camera mCamera = new SamsungCamera();
	public void dail(){
		mPhone.dail();
	}
	public void videoChat(){
		System.out.println("--->视频聊天通话中");
		mCamera.open();
		mPhone.dail();
	}
	public void hangup(){
		mPhone.hagup();
	}
	public void takePicture(){
		mCamera.open();
		mCamera.takePicture();
	}
	public void closeCamera(){
		mCamera.close();
	}
}
