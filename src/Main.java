public class Main {
    public static void main(String[] args) {
        Person p1 = Person.getInstance();
        System.out.println("p1 " + p1);
        Person p2 = Person.getInstance();
        System.out.println("p2 " + p2);
    }
}