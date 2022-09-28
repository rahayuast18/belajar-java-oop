package latihan;

class Person {
    String name;
    String address;
    final String country = "Indonesia";

    /**
     * dibawah ini merupakan code constructor:
     * sebuah method yang otomatis dipanggil saat object dibuat.
     *
     * @param name
     * @param address
     *
     * this:
     * jika di .java lain ingin memanggil attribute dari class Person,
     * harus membuat object dulu seperti "var person = new Person();".
     * baru bisa akses -> person.name
     * nah, this itu seperti person -> hanya saja digunakan dalam class yang sama.
     * menunjukkan suatu attribute dalam 1 class yang sama
     * (this untuk mengakses object saat ini)
     */
    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + ", My name is " + this.name);
    }
}
