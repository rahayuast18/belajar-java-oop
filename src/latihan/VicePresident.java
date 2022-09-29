package latihan;

class VicePresident extends Manager {
    /**
     * karena di parent ada constructor, maka di child harus dipanggil walaupun diisi null
     *
     * @param company
     */
    VicePresident(String company) {
        super(company);
    }

    public static void main(String[] args) {
        /**
         * how to access parent & child
         */
        var manager = new Manager("Indocyber");
        manager.name = "Arum";
        manager.sayHello("Denanda");

        var vicePresident = new VicePresident("Anteraja");
        vicePresident.name = "Jerry";
        /**
         * jika tidak ada sayHello pada class VicePresident -> yang ditampilkan adalah method dari manager
         * jika ada method yang sama di child dengan di parent -> yang dipanggil adalah method dari child
         */
        vicePresident.sayHello("Denanda");

        /**
         * how to call & use super constructor
         */
        vicePresident.sayName("Ayu");
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + ", I'm VP " + this.name);
    }

    void sayName(String name) {
        System.out.println("Hello " + name + ", I'm from " + super.company + " and he's from " + this.company);
    }
}
