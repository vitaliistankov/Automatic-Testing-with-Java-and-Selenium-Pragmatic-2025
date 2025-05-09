package bg.pragmatic.lecture6package;

public class Person {

//    private String name;
    protected String name;
    private int age;
    private boolean isMan;

    // Единствен конструктор, с параметри за всичките полета на класа
    public Person(String name, int age, boolean isMan) {
        this.name = name;
        this.age = age;
        this.isMan = isMan;
    }

    // Getter added to fix the "java: age has private access in Person" compilation error
    public int getAge() {
        return age;
    }

    // Метод showPersonInfo, който показва информация за човека (изписва на конзолата стойността на всичките му полета по подходящ начин)
    public void showPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Is Man: " + isMan);
    }

    public double calculateOvertime(double hours) {
        return 0.0; // Person няма overtime
    }
}
