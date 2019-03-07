package com.wxy.www;

public abstract class CPU implements Component {

	private String name;
	private int coreNum;
	private int price;

	public CPU(String name, int coreNum, int price) {
		this.name = name;
		this.coreNum = coreNum;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCoreNum() {
		return coreNum;
	}

	public void setCoreNum(int coreNum) {
		this.coreNum = coreNum;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
