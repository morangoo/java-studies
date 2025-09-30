import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;

class Student {
    private String name;
    private int id;

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    String getName() {
        return this.name;
    }

    int getId() {
        return this.id;
    }   

    String printStudent() {
        return "Student{name='" + this.name + "', id=" + this.id + "}";
    }

}

class Course {
    String courseName;
    HashMap<Integer, Student> students = new HashMap<>();

    Course(String name) {
        this.courseName = name;
    }

    public void assign(Student s) {
        if (!this.students.containsKey(s.getId())) {
            this.students.put(s.getId(), s);
        }
    }

    public void removeStudent(int studentId) {
        this.students.remove(studentId);
    }

    public void printStudents() {
        System.out.println("\n" + this.courseName + " students:");
        ArrayList<Student> studentList = new ArrayList<>(this.students.values());
        Collections.sort(studentList, (s1, s2) -> s1.getName().compareTo(s2.getName()));
        for(Student student : studentList) {
            System.out.print(student.getName() + " ");
        }
    }
    
}

public class School {
    public static void main(String[] args) throws Exception {
        Student carlos = new Student("Carlos", 1);
        Student rebeca = new Student("Rebeca", 2);
        Student sofia = new Student("Sofia", 3);
        Student miguel = new Student("Miguel", 4);
        Student rafael = new Student("Rafael", 5);

        Course science = new Course("Science");
        Course technology = new Course("Technology");

        science.assign(carlos);
        science.assign(rebeca);
        science.assign(sofia);

        technology.assign(sofia);
        technology.assign(miguel);
        technology.assign(rafael);

        science.printStudents();
        technology.printStudents();

    }
}
