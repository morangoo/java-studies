abstract class Animal {
    public abstract void animalSound();
    public void sleep() {
        System.out.println("Zzz");
    }
}

class Pig extends Animal {
    @Override
    public void animalSound() {
        System.out.println("Oink, oink!");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Pig oinky = new Pig();
        oinky.sleep();
        oinky.animalSound();
    }
}
