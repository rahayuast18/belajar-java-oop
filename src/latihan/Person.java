package latihan;

public class Person {
    String name;
    String address;
    final String country = "Indonesia";

    /**
     * dibawah ini merupakan code constructor:
     * sebuah method yang otomatis dipanggil saat object dibuat.
     *
     * @param paramName
     * @param paramAddress
     */
    Person(String paramName, String paramAddress) {
        name = paramName;
        address = paramAddress;
    }

    void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", My name is " + name);
    }
}
