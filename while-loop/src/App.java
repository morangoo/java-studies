public class App {
    public static void main(String[] args) throws Exception {
        Human person = new Human("Gonçalo", 0);
        System.out.println(person.name + " has just born!");

        while (person.age < 18) {
         person.Anniversary();
         System.out.println(String.format("Happy Birthday, %s! They are now %d years old.", person.name, person.age));
         if (person.age == 18) {
            System.out.print("They are now an adult.");
         }
        }
    }
}

class Human {
    String name;
    int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void Anniversary() {
        this.age++;
    }
}