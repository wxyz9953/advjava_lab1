package com.wxy.www;

public class WestDigitalsDisk extends Disk {

	public WestDigitalsDisk(String name, int volume, int price) {
		super(name, volume, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void workMethod() {
		System.out.println("WestDigitalsDisk work");

	}

}
