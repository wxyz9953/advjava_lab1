package com.wxy.www;

public class AMDCPU extends CPU {

	public AMDCPU(String name, int coreNum, int price) {
		super(name, coreNum, price);
	}

	@Override
	public void workMethod() {
		System.out.println("AMDCPU work");
	}

}
