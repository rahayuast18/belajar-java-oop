package latihan;

public class PolymorphismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Ajeng");
        employee.sayHello("Hani");

        employee = new Manager("Ajeng");
        employee.sayHello("Hani");

        employee = new VicePresident("Ajeng");
        employee.sayHello("Hani");
    }
}
