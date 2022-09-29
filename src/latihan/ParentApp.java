package latihan;

public class ParentApp {
    public static void main(String[] args) {
        Child child = new Child();
        child.name = "Naya";
        child.doIt();
        System.out.println(child.name);

        Parent parent = child; // casts (conversion)
        parent.doIt(); // tampil yg child, karena overriding
        System.out.println(parent.name);
    }
}
