class Animal {
    public void makeSound() {
        System.out.println("Animal sound");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Animal kitty = new Animal() {
            @Override
            public void makeSound() {
                System.out.println("Meow meow");
            }
        };
        kitty.makeSound();
    }
}
