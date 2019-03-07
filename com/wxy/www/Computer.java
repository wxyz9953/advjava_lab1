package com.wxy.www;

public class Computer {
	private Mainboard mainboard;
	private Memory memory;
	private CPU cpu;
	private Disk disk;
	private String name;
	private int price;

	public String getDescription() {
		return "cpu名为 " + cpu.getName() + 
				" 主板名为 " + mainboard.getName() + 
				" 硬盘名为 " + disk.getName() + 
				" 内存名为 " + memory.getName();
	}

	public void work() {
		cpu.workMethod();
		disk.workMethod();
		mainboard.workMethod();
		memory.workMethod();
	}
	
	public Computer(Mainboard mainboard, CPU cpu, Disk disk, Memory memory, String name, int price) {
		this.name = name;
		this.cpu = cpu;
		this.mainboard = mainboard;
		this.memory = memory;
		this.disk = disk;
		this.price = price;
	}
	
	public Mainboard getMainboard() {
		return mainboard;
	}

	public void setMainboard(Mainboard mainboard) {
		this.mainboard = mainboard;
	}

	public Memory getMemory() {
		return memory;
	}

	public void setMemory(Memory memory) {
		this.memory = memory;
	}

	public CPU getCpu() {
		return cpu;
	}

	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}

	public Disk getDisk() {
		return disk;
	}

	public void setDisk(Disk disk) {
		this.disk = disk;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
}
