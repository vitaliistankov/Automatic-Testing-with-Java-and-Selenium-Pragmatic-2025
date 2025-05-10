package bg.pragmatic.lecture3package;

public class Computer {

    int year;
    public double price;
    boolean isNotebook;
    double hardDiskMemory;
    double freeMemory;
    String operationSystem;


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
