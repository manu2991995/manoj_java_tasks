package Adavance_java_individual_tasks_givenby_praveen;

public class Class1 {
    // Private variables
    private String name;
    private int age;

    // Constructor
    public Class1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;

    }

    // Advance_java_group_tasks_givenby_praveen.Main method to test the class
    public static void main(String[] args) {
        // Create an object of the Adavance_java_individual_tasks_givenby_praveen.Class1 class
        Class1 class1 = new Class1("Dilip", 29);

        // Access and modify variables using getters and setters
        System.out.println("Name: " + class1.getName());
        System.out.println("Age: " + class1.getAge());

        // Update the values using setters
        class1.setName("Nikhil");
        class1.setAge(25);

        // Display updated values
        System.out.println("Updated Name: " + class1.getName());
        System.out.println("Updated Age: " + class1.getAge());
    }
}
