package latihan;

public class ManagerApp {
    public static void main(String[] args) {
        /**
         * how to access parent & child
         */
        var manager = new Manager("Arum");
//        manager.name = "Arum";
        manager.sayHello("Denanda");
        System.out.println(manager.setCompany());

        var vicePresident = new VicePresident(null);
        vicePresident.name = "Jerry"; // digunakan jika param name tidak mandatory dipanggil/belum di set
        /**
         * jika tidak ada sayHello pada class VicePresident -> yang ditampilkan adalah method dari manager
         * jika ada method yang sama di child dengan di parent -> yang dipanggil adalah method dari child
         */
        vicePresident.sayHello("Denanda");

        // calling super method & this method
        vicePresident.sayName("Ayu");
    }
}
