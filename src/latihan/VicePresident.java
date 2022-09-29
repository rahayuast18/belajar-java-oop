package latihan;

class VicePresident extends Manager {
    public static void main(String[] args) {
        /**
         * how to access parent & child
         */
        var manager = new Manager();
        manager.name = "Arum";
        manager.sayHello("Denanda");

        var vicePresident = new VicePresident();
        vicePresident.name = "Jerry";
        /**
         * jika tidak ada sayHello pada class VicePresident -> yang ditampilkan adalah method dari manager
         * jika ada method yang sama di child dengan di parent -> yang dipanggil adalah method dari child
         */
        vicePresident.sayHello("Denanda");
    }

    void sayHello(String name) {
        /**
         * this.name from class Manager
         */
        System.out.println("Hello " + name + ", I'm VP " + this.name);
    }
}
