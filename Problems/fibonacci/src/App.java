import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many digits of Fibonacci?: ");
        int number = scanner.nextInt();
        int[] result = new int[number];
        scanner.close();
        if (number < 2) {
            System.out.print(0);
            return;
        }

        result[0] = 0;
        result[1] = 1;
        for (int i = 2; i < number; i++) {
                result[i] = result[i - 1] + result[i - 2];
        }
        
        System.out.println("Fibonacci sequence:");
        for (int i = 0; i < number; i++) {
            System.out.print(result[i] + " ");
        }
        
    }
}
