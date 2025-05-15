package bg.pragmatic.lecture6HomeWorkpkg;

import bg.pragmatic.lecture6package.Employee;

public class Main {
    public static void main(String[] args) {


        // масив от 10 елемента от тип Person
        Person[] personsArr = new Person[10];

        // Създаването по два обекта от тип Person, Student и Employee и вкарането в масива от хора.

        personsArr[0] = new Person("Ivan Ivanov", 21, true);
        personsArr[1] = new Person("Petya Petrova", 30, false);

        personsArr[2] = new Student("Georgi Georgiev", 19, true, 5.5);
        personsArr[3] = new Student("Maria Marinova", 22, false, 6.0);

        personsArr[4] = new Employee("Dimitar Dimitrov", 35, true, 120.00);
        personsArr[5] = new Employee("Elena Elenova", 17, false, 80.00);


        // Показване на информацията
        for (Person p : personsArr) {
            if (p != null) {
                p.showPersonInfo();
                System.out.println("-----------");
            }
        }

        System.out.println("\n--- Overtime Payments ---");

        // Изчисляване на overtime
        for (Person p : personsArr) {
            if (p != null) {
                double overtimePay = p.calculateOvertime(2);
                if (overtimePay > 0) {
                    System.out.println("Overtime payment for 2 hours: " + overtimePay + " BGN");
                }
            }
        }
    }
}



