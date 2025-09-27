public class App {
    public static void main(String[] args) throws Exception {
        Person myPerson = new Person();
        myPerson.setName("Bruno");
        System.out.println(myPerson.getName());
        myPerson.setName("Miguel");
        System.out.println(myPerson.getName());
    }
}
