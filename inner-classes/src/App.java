class Outer {
    int x = 10;

    class Inner {
        int y = 5;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Outer out = new Outer();
        Outer.Inner in = out.new Inner();
        System.out.print(out.x + in.y);
    }
}
