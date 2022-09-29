package latihan;

class PolymorphismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Ajeng");
        /**
         * gatau kenapa code dibawah ini gabisa di run (yg di comment
         */
//        employee manager = new Manager("Ajeng");
//        employee vicePrecident = new VicePresident("Ajeng");
        Employee manager = new Manager("Ajeng");
        Employee vicePrecident = new VicePresident("Ajeng");

        employee.sayHello("Hani");
        manager.sayHello("Hani");
        vicePrecident.sayHello("Hani");
    }
}
