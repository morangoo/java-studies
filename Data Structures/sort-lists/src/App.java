import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(4);
        numbers.add(2);
        numbers.add(0, 0);

        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println(numbers);
        numbers.add(3, 3);
        Collections.sort(numbers);
        System.out.println(numbers);

    }
}
