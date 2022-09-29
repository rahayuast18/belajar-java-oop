package latihan;

class Manager {
    String name;
    String company;

    String setCompany() {
        return this.company = "Indocyber";
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + ", I'm Manager " + this.name);
    }
}
