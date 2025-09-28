class Counter implements Runnable {
    private int count = 0;

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            synchronized (this) {
                increment();
                System.out.println(this.count);
            }
        }
    }

    private synchronized void increment() {
        this.count++;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Counter counter = new Counter();
        Thread counter1 = new Thread(counter);
        Thread counter2 = new Thread(counter);

        counter1.start();
        counter2.start();
    }
}
