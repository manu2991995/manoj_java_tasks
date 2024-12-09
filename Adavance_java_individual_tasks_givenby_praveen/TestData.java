package Adavance_java_individual_tasks_givenby_praveen;

public class TestData {
    private int number;
    //constructor
    public TestData(){      // const. name is same as class name
        // Intialize the objects
        number = 50;

        // dont have any return type
    }

    public void display (){
        System.out.println("this is display " + number);
    }

    public static void main(String[] args) {
        //object creation
        TestData obj = new TestData();
        obj.display();
    }
}
