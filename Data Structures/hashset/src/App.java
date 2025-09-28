import java.util.HashSet;

public class App {
    public static void main(String[] args) throws Exception {
        HashSet<String> cars = new HashSet<>();
        cars.add("BMW");
        cars.add("Volvo");
        cars.add("Honda");
        System.out.println(cars);

        if (cars.contains("BMW")) {
            System.out.println("You own a BMW!");
        }

        cars.clear();
        if (cars.size() < 1) {
            System.out.println("You don't own any car!");
        }
    }
}
