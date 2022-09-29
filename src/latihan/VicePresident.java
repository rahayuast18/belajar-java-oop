package latihan;

class VicePresident extends Manager {
    VicePresident(String name) {
        super(name);
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + ", I'm VP " + this.name);
    }

    /**
     * super method
     * @param name
     */
    void sayName(String name) {
        System.out.println("Hello " + name + ", I'm from " + super.setCompany() + " and he's from " + this.setCompany());
    }

    String setCompany(){
        return this.company = "Anteraja";
    }
}
