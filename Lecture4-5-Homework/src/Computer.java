public class Computer {
    int year;
    double price;
    boolean isNotebook;
    double hardDiskMemory;
    double freeMemory;
    String operationSystem;

    Computer() {
        this.isNotebook = false;
        this.operationSystem = "Win XP";
    }
    Computer(int year, double price, double hardDiskMemory, double freeMemory) {
        this();
        this.year = year;
        this.price = price;
        this.hardDiskMemory = hardDiskMemory;
        this.freeMemory = freeMemory;
    }
    Computer(int year, double price, boolean isNotebook, double hardDiskMemory, double freeMemory, String operationSystem) {
        this.year = year;
        this.price = price;
        this.isNotebook = isNotebook;
        this.hardDiskMemory = hardDiskMemory;
        this.freeMemory = freeMemory;
        this.operationSystem = operationSystem;
    }
    int comparePrice(bg.pragmatic.lecture3package.Computer otherComp) {
        if (this.price > otherComp.price) {
            System.out.println("This computer (" + this.price + ") is more expensive than the other (" + otherComp.price + ").");
            return -1;
        } else if (this.price < otherComp.price) {
            System.out.println("This computer (" + this.price + ") is cheaper than the other (" + otherComp.price + ").");
            return 1;
        } else {
            System.out.println("Both computers have the same price: " + this.price + ".");
            return 0;
        }
    }
    void changeOperationSystem(String newOperationSystem) {
        operationSystem = newOperationSystem;
    }
    void useMemory(double memory) {
        freeMemory -= memory;
        if (memory > freeMemory) {
            System.out.println("Not enough free memory!");
        } else {
            System.out.println("An app is running! Now only " + freeMemory + " free memory left.");
        }
    }
}
