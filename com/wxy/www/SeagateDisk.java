package com.wxy.www;

public class SeagateDisk extends Disk {

	public SeagateDisk(String name, int volume, int price) {
		super(name, volume, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void workMethod() {
		System.out.println("SeagateDisk work");

	}
	
	

}
