public class App {
    public static void main(String[] args) throws Exception {
        Citizen citizen = new Citizen("Miguel", "Brazilian");
        switch (citizen.nationality) {
            case "Portuguese" -> System.out.println(citizen.name + " is from Portugal");
            case "English" -> System.out.println(citizen.name + " is from England");
            default -> System.out.println(citizen.name + " is not from Portugal neither England");
            
        }
    }
}

class Citizen {
    String name;
    String nationality;

    public Citizen(String name, String nationality) {
        this.name = name;
        this.nationality = nationality;
    }
}