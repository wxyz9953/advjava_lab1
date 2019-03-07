package com.wxy.www;

import java.util.ArrayList;
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

	public static void main(String[] args) {
		CPU cpuA = new IntelCPU("X233", 8, 20);
		CPU cpuB = new AMDCPU("A233", 2, 22);
		Disk diskA = new SeagateDisk("f", 20, 20);
		Disk diskB = new WestDigitalsDisk("B2", 250, 23);
		Mainboard mainboardA = new GigabyteMainboard("C4", 20, 20);
		Mainboard mainboardB = new AsusMainboard("A4", 22222, 983487);
		Memory memoryA = new SamsungMemory("G8", 245, 47985);
		Memory memoryB = new SamsungMemory("JB21", 242222, 12);

		Computer c1 = new Computer(mainboardA, cpuA, diskA, memoryA, "王电脑", 9999);
		Computer c2 = new Computer(mainboardB, cpuB, diskA, memoryB, "新电脑", 233);
		Computer c3 = new Computer(mainboardA, cpuA, diskB, memoryA, "名字真难起", 7897);
		List<Computer> computers = new ArrayList<>();
		computers.add(c1);
		computers.add(c2);
		computers.add(c3);

		ComputerStore cs = new ComputerStore(computers);
		cs.show();
	}
}
