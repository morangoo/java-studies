public class SwissKnife implements Runnable {
    private int count = 0;
    private int threadNumber;

    public SwissKnife(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            count++;
            System.out.println("Count: " + count + " from Thread: " + threadNumber);
            try {
                Thread.sleep(1000); // Simulate some work with a sleep
            } catch (InterruptedException e) {
                // Handle the exception
            }
        }
    }

}
