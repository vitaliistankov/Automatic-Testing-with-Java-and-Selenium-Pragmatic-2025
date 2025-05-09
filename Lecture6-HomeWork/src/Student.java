public class Student extends Person {

    double score;

    // Единствен конструктор, задаващ стойности и на наследените полета
    public Student(String name, int age, boolean isMan, double score) {
        super(name, age, isMan);
        this.score = score;
    }

    // Метод който показва информация за човека и информация за оценката му (чрез надписи на екрана)
    @Override
    public void showPersonInfo() {
        super.showPersonInfo();
        System.out.println("Score: " + score);
    }
}
