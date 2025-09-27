public class App {
    public static void main(String[] args) throws Exception {
        Student student1 = new Student("Miguel",  55.5);

        if (student1.grade >= 50) {
            System.out.println(student1.name + " has passed.");
        } else {
            System.out.println(student1.name + " has failed.");
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