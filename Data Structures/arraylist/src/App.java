import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        cars.add(0, "Toyota");
        cars.remove("BMW");
        cars.set(2, "Opel");

        Iterator<String> it = cars.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("First car: " + cars.get(0));

        System.out.println("There are currently " + cars.size() + " cars.");
        Collections.sort(cars);
        System.out.println(cars);

        cars.clear();
        System.out.println("Puff! Now there's " + cars.size() + ".");
        
    }
}
