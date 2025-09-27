class Vehicle {
    protected String brand = "Ford";
    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}

class Car extends Vehicle {
    private final String name = "Mustang";
    public void speed() {
        System.out.println(this.brand + " " + this.name + " is speeding!");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Car myCar = new Car();
        myCar.honk();
        myCar.speed();
    }
}
