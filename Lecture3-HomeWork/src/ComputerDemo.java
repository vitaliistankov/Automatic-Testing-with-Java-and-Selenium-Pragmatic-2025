public class ComputerDemo {

    public static void main(String[] args) {

        Computer computer1 = new Computer();

        computer1.year = 2024;
        computer1.price = 2000;
        computer1.isNotebook = false;
        computer1.hardDiskMemory = 2000;
        computer1.freeMemory = 256;
        computer1.operationSystem = "Windows 11";

        Computer computer2 = new Computer();

        computer2.year = 2025;
        computer2.price = 4000;
        computer2.isNotebook = true;
        computer2.hardDiskMemory = 3000;
        computer2.freeMemory = 1024;
        computer2.operationSystem = "Kali Linux";


        computer1.useMemory(100);
        computer2.changeOperationSystem("Windows 11");

        System.out.println("\n");

        System.out.println("Computer1 year is: " + computer1.year);
        System.out.println("Computer1 price is: " + computer1.price);
        System.out.println("is Computer1 notebook: " + computer1.isNotebook);
        System.out.println("Computer1 hardDiskMemory is: " + computer1.hardDiskMemory);
        System.out.println("Computer1 freeMemory is: " + computer1.freeMemory);
        System.out.println("Computer1 operationSystem is: " + computer1.operationSystem);

        System.out.println("\n");

        System.out.println("Computer2 year is: " + computer2.year);
        System.out.println("Computer2 price is: " + computer2.price);
        System.out.println("is Computer2 notebook: " + computer2.isNotebook);
        System.out.println("Computer2 hardDiskMemory is: " + computer2.hardDiskMemory);
        System.out.println("Computer2 freeMemory is: " + computer2.freeMemory);
        System.out.println("Computer2 operationSystem is: " + computer2.operationSystem);


    }
}