package Adavance_java_individual_tasks_givenby_praveen;

public class TestData1 {
    private String name;
    private int age;

    //constructor
    public TestData1(){             // no arguments
        name = "Manoj_Singh_H";
        age = 29;
    }
    public void display(){
        System.out.println("This is name::" + name);
        System.out.println(("This is age:::" + age));
    }
    public static void main(String[] args) {
        //obj creation
        TestData1 a1 = new TestData1();
        a1.display();
    }
}
