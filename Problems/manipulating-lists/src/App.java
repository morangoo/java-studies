import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(17);
        numbers.add(32);
        numbers.add(21);
        numbers.add(6);
        numbers.add(17);
        numbers.add(32);
        numbers.add(34);
        numbers.add(36);

        Collections.sort(numbers);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == numbers.get(i+1)) {
                numbers.remove(i);
                i++;
            }
        }

        System.out.println(numbers);
    }
}
