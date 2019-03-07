package com.wxy.www;

import java.util.Iterator;
import java.util.List;

public class ComputerStore {
	private Computer[] computers = new Computer[3];

	public ComputerStore(List<Computer> computers) {
		if(computers.size() != 3) {
			System.out.println("计算机数量不为3");
			System.exit(0);
		}
		Iterator<Computer> it = computers.iterator();
		int i = 0;
		while (it.hasNext()) {
			this.computers[i] = it.next();
			i++;
		}
	}

	public void show() {
		for(int i = 0 ; i < computers.length ; i++) {
			Computer c = computers[i];
			System.out.println("计算机名称: " + c.getName() + 
					" 价格: " + c.getPrice() + 
					" 描述: " + c.getDescription());
			c.work();
			System.out.println("---------------------------");
		}
	}
}
