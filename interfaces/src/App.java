interface Animal {
    public void animalSound();
    public void sleep();
}

interface Feline {
    public void purr();
}

class Cat implements Animal, Feline {
    @Override
    public void animalSound() {
        System.out.println("Meow meow!");
    }
    @Override
    public void sleep() {
        System.out.println("Zzzz....");
    }
    @Override
    public void purr() {
        System.out.println("purrrr");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Cat kitty = new Cat();
        kitty.animalSound();
        kitty.sleep();
        kitty.purr();
    }
}
