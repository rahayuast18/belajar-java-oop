package latihan;

public class PolymorphismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Ajeng");
        employee.sayHello("Hani");

        employee = new Manager("Ajeng");
        employee.sayHello("Hani");

        employee = new VicePresident("Ajeng");
        employee.sayHello("Hani");

        sayHello(new Employee("Rahayu"));
        sayHello(new Manager("Puji"));
        sayHello(new VicePresident("Astuty"));

    }

    static void sayHello(Employee employee) {
        /**
         * kesimpulan sotoy:
         * karena vicePresident child dari manager -> maka kondisi if dibuat duluan (soalnya kalo yang duluan Manager, fungsinya nda jalan dgn ok
         */
        if (employee instanceof VicePresident) {
            VicePresident vicePrecident = (VicePresident) employee; // konversi Employee employee ke VicePrecident vicePrecident
            System.out.println("Hi VP " + vicePrecident.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee; // konversi Employee employee ke Manager manager
            System.out.println("Hi Manager " + manager.name);
        } else {
            System.out.println("Hi " + employee.name);
        }
    }
}
