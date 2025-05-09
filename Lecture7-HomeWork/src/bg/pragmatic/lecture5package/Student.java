package bg.pragmatic.lecture5package;

public class Student {
    private String name;
    private String subject;
    private double grade;
    private int yearInCollege;
    private int age;
    private boolean isDegree;
    private double money;
    private double min;

    Student() {
        this.grade = 4.0;
//        this.yearInCollege = 1;
        this.yearInCollege = 3;
        this.isDegree = false;
        this.money = 0;
    }

    Student(String name, String subject, int age) {
        this();
        this.name = name;
        this.subject = subject;
//        this.grade = grade;
        this.age = age;
    }

    void upYear() {
        if (!isDegree) {
            yearInCollege++;
            if (yearInCollege > 4) {
                isDegree = true;
                System.out.println("Graduated!");
            } else {
                System.out.println("Up to year " + yearInCollege + ".");
            }
        }
    }

    double receiveScholarship(double min, double amount) {

        if (grade >= min && age < 30) {
            money += amount; // Add the scholarship amount to the student's money
            System.out.println("It is now " + money + " on this student account! ");
            return money; // Return the updated scholarship total
        } else {
            System.out.println("Still " + money + " on this student account as he not meet the criteria!");
        }

        return money; // Return the original money if criteria are not met

    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public double getGrade() {
        return grade;
    }

    public int getYearInCollege() {
        return yearInCollege;
    }

    public int getAge() {
        return age;
    }

    public boolean isDegree() {
        return isDegree;
    }

    public double getMoney() {
        return money;
    }

    public double getMin() {
        return min;
    }
}
