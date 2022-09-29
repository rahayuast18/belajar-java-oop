package latihan;

class Manager extends Employee{
//    String name; //udah gadipake karna ambil dari Employee
    String company;

    Manager(String name) {
        super(name);
    }

    String setCompany() {
        return this.company = "Indocyber";
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + ", I'm Manager " + this.name);
    }
}
