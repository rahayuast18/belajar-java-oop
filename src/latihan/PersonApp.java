package latihan;

public class PersonApp {
    public static void main(String[] args) {
        var person = new Person();
        person.name = "Ayu";
        person.address = "Setu";

        System.out.println(person.name);
        System.out.println(person.address);
        System.out.println(person.country);

        Person person1 = new Person();
        Person person2;
        person2 = new Person();
    }
}
