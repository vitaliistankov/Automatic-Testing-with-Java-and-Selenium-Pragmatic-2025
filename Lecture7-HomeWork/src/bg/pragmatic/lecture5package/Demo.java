package bg.pragmatic.lecture5package;


public class Demo {
    public static void main(String[] args) {

        Student s1 = new Student("Ivan Ivanov", "Business", 21);
        Student s2 = new Student("Zora Zoreva", "Informatics", 40);
        Student s3 = new Student("Gosho Goshev", "Literature", 29);
        Student s4 = new Student("Petya Petkova", "History", 31);

        s1.upYear();
        s3.receiveScholarship(6.0, 400);
        s2.receiveScholarship(3.5, 300);
        s1.receiveScholarship(3.5, 250);
        s3.upYear();
        s4.upYear();


    }
}

