package bg.pragmatic.lecture5package;

public class College {
    public static void main(String[] args) {

        Student s1 = new Student("Anna Petrova", "Software Engineering",18);
        Student s2 = new Student("Ivan Ivanov", "Computer Science", 21);
        Student s3 = new Student("Maria Georgieva", "Mathematics", 45);
        Student s4 = new Student("Georgi Stoyanov", "Computer Science", 30);


        // Даваме стипендии на някои
        s1.receiveScholarship(5.5, 250);
        s2.receiveScholarship(5.5, 250);
        s3.receiveScholarship(5.5, 250);

        // Прехвърляме някои студенти в по-горна година
        s2.upYear();
        s3.upYear();

        // Създаваме групи
        StudentGroup softwareEngineeringGroup = new StudentGroup("Software Engineering");
        StudentGroup mathematicsGroup = new StudentGroup("Mathematics");

        // Добавяме студенти в групите
        softwareEngineeringGroup.addStudent(s1);
        softwareEngineeringGroup.addStudent(s2);
        softwareEngineeringGroup.addStudent(s4);
        mathematicsGroup.addStudent(s3);

        // Извеждаме студенти по групи
        System.out.println("=== Software Engineering Group ===");
        softwareEngineeringGroup.printStudentsInGroup();

        System.out.println("=== Mathematics Group ===");
        mathematicsGroup.printStudentsInGroup();

        // Най-добър студент в компютърната група
        String topStudent = softwareEngineeringGroup.theBestStudent();
        System.out.println("Best student in Software Engineering group: " + topStudent);









    }
}
