package Adavance_java_individual_tasks_givenby_praveen;

public class PersonDemo{
    //Declaration
    private int id;
    private String name;
    private String address;

    //constructor which is having arguments
    public PersonDemo(int id, String name, String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void displayPersonDetails(){
        System.out.println("Person Details is::" + this.id + "   name::" + this.name + "   address::" + this.address);
    }

    public static void main(String[] args) {
        PersonDemo a1 = new PersonDemo(29,"Manoj", "Hoskote");
        a1.displayPersonDetails();
    }
}
