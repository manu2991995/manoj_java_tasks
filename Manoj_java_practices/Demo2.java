package Manoj_java_practices;

public class Demo2 {
    public int age;
    private String name;
// we are gettung the age
    public int getAge(){
        return age;
    }
    // setting the value
    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        Demo2 demo2 = new Demo2();
        demo2.setName("Manoj");
        demo2.setAge(28);
        System.out.println("Name::" + demo2.name);
        System.out.println("Age::" + demo2.age);
    }
}
