public class Employee extends Person {

    double daySalary;

    // Конструктор, който инициализира всичките му полета (собствени и наследени)
    public Employee(String name, int age, boolean isMan, double daySalary) {
        super(name, age, isMan);
        this.daySalary = daySalary;
    }
    // Метод, който показва информация за човека, както и информация за дневната му заплата
    @Override
    public void showPersonInfo() {
        super.showPersonInfo();
        System.out.println("Day Salary: " + daySalary);
    }
    // Метод, който пресмята и връща стойността на сумата която му се дължи при работа извън работно време
    @Override
    public double calculateOvertime(double hours) {
        if (age < 18) {
            return 0.0;
        } else {
            double hourlyWage = daySalary / 8; // 8-часов работния ден
            return hourlyWage * 1.5 * hours;
        }
    }
    }





