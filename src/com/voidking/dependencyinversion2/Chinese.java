package com.voidking.dependencyinversion2;

public class Chinese implements Human {
	
	private Languige lan;
	
	public Chinese() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Chinese(Languige lan) {
		super();
		this.lan = lan;
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println(lan.kind());
	}

}
