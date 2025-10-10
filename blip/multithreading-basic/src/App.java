public class App {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 5; i++) {
            SwissKnife swissKnife = new SwissKnife(i);
            Thread thread = new Thread(swissKnife);
            thread.start();
        }
        

    }
}
