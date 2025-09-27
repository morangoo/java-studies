public class App {
    public static void main(String[] args) throws Exception {
        int qtEven = 0;
        int qtOdd = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                qtEven++;
            } else {
                qtOdd++;
            }
        }
        System.out.printf("There's %d even numbers.%n", qtEven);
        System.out.printf("There's %d odd numbers.", qtOdd);
    }
}
