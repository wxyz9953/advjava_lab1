package com.wxy.www;

public abstract class Memory implements Component {

	private String name;
	private int speed;
	private int price;

	public Memory(String name, int speed, int price) {
		this.name = name;
		this.speed = speed;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
