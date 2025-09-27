public class App {
    public static void main(String[] args) throws Exception {
        Student[] students = {
            new Student("Miguel", 55.5),
            new Student("Raquel", 48.0),
            new Student("Bruno", 99.0)
        };

        for (Student student : students) {
            if (student.grade >= 50) {
                System.out.println(student.name + " has passed.");
            } else {
                System.out.println(student.name + " has failed.");
            }
        }
    }
}

class Student {
    String name;
    double grade;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }
}