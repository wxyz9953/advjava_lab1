package com.wxy.www;

import java.util.ArrayList;
import java.util.List;

public class Application {
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
