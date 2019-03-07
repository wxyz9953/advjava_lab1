main函数在Application.java文件内

使用方法：

1. 根据相对应的构造函数实例化四种组件

   > 四种组件构造函数参数如下：

   ```java
   public CPU(String name, int coreNum, int price)
   public Disk(String name, int volume, int price)
   public Mainboard(String name, int volume, int price)
   public Memory(String name, int speed, int price)
   例如：
   CPU cpuA = new IntelCPU("X233", 8, 20);
   CPU cpuB = new AMDCPU("A233", 2, 22);
   Disk diskA = new SeagateDisk("f", 20, 20);
   Disk diskB = new WestDigitalsDisk("B2", 250, 23);
   Mainboard mainboardA = new GigabyteMainboard("C4", 20, 20);
   Mainboard mainboardB = new AsusMainboard("A4", 22222, 983487);
   Memory memoryA = new SamsungMemory("G8", 245, 47985);
   Memory memoryB = new SamsungMemory("JB21", 242222, 12);
   ```

2. 实例化计算机类

   > 计算机类构造函数如下：

   ```java
   public Computer(Mainboard mainboard, CPU cpu, Disk disk, Memory memory, String name, int price)
   ```

3. 实例化计算机销售主类

   > 计算机销售主类构造函数如下:

   ```java
   public ComputerStore(List<Computer> computers)
   其中computers为三个Computer实例的数组
   ComputerStore中 show()方法展示三种电脑的信息
   ```

