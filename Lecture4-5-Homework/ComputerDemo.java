public class ComputerDemo {

    public static void main(String[] args) {

        Computer lenovo = new Computer(2023, 2000, 2000,256);
        Computer asus = new Computer(2025, 4000, 3000, 2056);
        Computer hp = new Computer(2024, 4000, 1500, 1024);


//        asus.comparePrice(lenovo);
//        lenovo.comparePrice(asus);
        hp.comparePrice(asus);

    }
}