import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        HashMap<Integer, String> numbers = new HashMap<>();
        numbers.put(1, "One");
        numbers.put(2, "Two");
        numbers.put(3, "Three");
        numbers.put(4, "Four");

        System.out.println(numbers);
        System.out.println(numbers.get(3));

        System.out.println("Keys:");
        System.out.println(numbers.keySet());
        System.out.println("\nValues:");
        System.out.println(numbers.values());

    }
}
