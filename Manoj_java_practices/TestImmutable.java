package Manoj_java_practices;

final class ImmutableExample {
    private final String name;
    private final int age;
    // Constructor to initialize all fields
    public ImmutableExample(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Getter methods to access the fields
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
public class TestImmutable {
    public static void main(String[] args) {
        ImmutableExample obj = new ImmutableExample("Virat", 37);

        // Access the fields using getter methods
        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
        

        // Cannot modify the object's state (immutable)
        // obj.name = "Mahesh"; // This would cause a compilation error
    }
}
