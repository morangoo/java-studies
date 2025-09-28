import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(1);
        numbers.add(0);
        numbers.add(4);
        numbers.add(3);

        System.out.println(numbers.size());
        System.out.println(numbers);
    }
}
