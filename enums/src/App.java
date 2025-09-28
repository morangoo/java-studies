enum Weekdays {
    MONDAY("Week"),
    TUESDAY("Week"),
    WEDNESDAY("Week"),
    THURSDAY("Week"),
    FRIDAY("Week"),
    SATURDAY("Weekend"),
    SUNDAY("Weekend");

    private final String description;

    Weekdays(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Weekdays day = Weekdays.SUNDAY;
        System.out.println(day.getDescription());

    }
}
