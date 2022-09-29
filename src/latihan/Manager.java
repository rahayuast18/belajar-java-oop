package latihan;

class Manager {
    String name;
    String company;
    Manager(String company) {
        this.company = company;
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + ", I'm Manager " + this.name);
    }
}
