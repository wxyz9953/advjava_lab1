package com.wxy.www;

public class IntelCPU extends CPU {

	public IntelCPU(String name, int coreNum, int price) {
		super(name, coreNum, price);
	}

	@Override
	public void workMethod() {
		System.out.println("IntelCPU work");
	}

}
