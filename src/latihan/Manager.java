package latihan;

class Manager extends Employee{
//    String name;
    Manager(String name) {
        super(name);
    }
    String company;

    String setCompany() {
        return this.company = "Indocyber";
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + ", I'm Manager " + this.name);
    }
}
