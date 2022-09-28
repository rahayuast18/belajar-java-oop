package latihan;

public class PersonApp {
    public static void main(String[] args) {
        // object 1
        var person1 = new Person();
        person1.name = "Ayu";
        person1.address = "Setu";

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Rahayu");

        // object 2
        Person person2 = new Person();

        // object 3
        Person person3;
        person3 = new Person();

        /**
         * harusnya code dibawah null kalo belum ada person3.name = "Ayu" -> contoh
         * tapi kenapa tetep tampil Puji guys? saya tak paham lhaa :(
         */
        person3.sayHello("Puji");
    }
}
