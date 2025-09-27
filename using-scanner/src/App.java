import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter another number: ");
            int num2 = scanner.nextInt();
    
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        }
    }
}
