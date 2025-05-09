package bg.pragmatic.lecture5package;

public class StudentGroup {

    private String groupSubject;
    private Student[] students;
    private int freePlaces;

    StudentGroup() {
        this.students = new Student[5];
        this.freePlaces = 5;
    }

    StudentGroup(String groupSubject) {
        this();
        this.groupSubject = "Software Engineering";
    }

    public void addStudent(Student s) {
        if (freePlaces == 0) {
            System.out.println("No free places in the group.");
            return;
        }

        if (!s.getSubject().equals(this.groupSubject)) {
            System.out.println("Student's subject does not match the group's subject.");
            return;
        }

        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = s;
                freePlaces--;
                System.out.println("Student " + s.getName() + " was added to the group.");
                return;
            }
        }
    }

    void emptyGroup() {
        students = new Student[5];
        freePlaces = 5;
        System.out.println("The group has been emptied.");
    }

    public String theBestStudent() {
        double maxGrade = -1;
        Student bestStudent = null;

        for (Student s : students) {
            if (s != null && s.getGrade() > maxGrade) {
                maxGrade = s.getGrade();
                bestStudent = s;
            }
        }

        if (bestStudent != null) {
            return bestStudent.getName();
        } else {
            return "No students in the group.";
        }
    }

    public void printStudentsInGroup() {
        boolean hasStudents = false;

        for (Student s : students) {
            if (s != null) {
                System.out.println("Name: " + s.getName());
                System.out.println("groupSubject: " + s.getSubject());
                System.out.println("Grade: " + s.getGrade());
                System.out.println("------------------------");
                hasStudents = true;
            }
        }

        if (!hasStudents) {
            System.out.println("There are no students in the group.");
        }
    }

    public String getGroupSubject() {
        return groupSubject;
    }

    public Student[] getStudents() {
        return students;
    }

    public int getFreePlaces() {
        return freePlaces;
    }
}
