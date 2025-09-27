public class App {

    static String invert(String text) {
        if (text.length() > 0) {
            return text.charAt(text.length() - 1) + "" + invert(text.substring(0, text.length() -1));
        } else {
            return "";
        }
    };

    public static void main(String[] args) throws Exception {
        System.out.println(invert("java"));
    };
}
