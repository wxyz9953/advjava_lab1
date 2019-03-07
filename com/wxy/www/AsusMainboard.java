package com.wxy.www;

public class AsusMainboard extends Mainboard {

	public AsusMainboard(String name, int volume, int price) {
		super(name, volume, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void workMethod() {
		System.out.println("Asus mainboard work");

	}

}
