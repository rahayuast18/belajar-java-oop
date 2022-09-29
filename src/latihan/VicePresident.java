package latihan;

class VicePresident extends Manager {
    VicePresident(String name) {
        super(name);
    }
    public static void main(String[] args) {
        /**
         * how to access parent & child
         */
        var manager = new Manager(null);
        manager.name = "Arum";
        manager.sayHello("Denanda");
        System.out.println(manager.setCompany());

        var vicePresident = new VicePresident(null);
        vicePresident.name = "Jerry";
        /**
         * jika tidak ada sayHello pada class VicePresident -> yang ditampilkan adalah method dari manager
         * jika ada method yang sama di child dengan di parent -> yang dipanggil adalah method dari child
         */
        vicePresident.sayHello("Denanda");

        // calling super method & this method
        vicePresident.sayName("Ayu");
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
