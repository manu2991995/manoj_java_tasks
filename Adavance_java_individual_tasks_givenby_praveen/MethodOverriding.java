package Adavance_java_individual_tasks_givenby_praveen;

// Overriding Polymerphism
class Shape {                               // 1st parent class
    public void drawn(){
        System.out.println("Shape is drawn");
    }
}

class Circle extends Shape {                       // 1st child class
    public void drawn(){
        System.out.println("Circle is drawn with the help of compass");
    }
}
//------

class Appliance {                                    // 2nd parent class
    public void powerOn(){
        System.out.println("Appliance run by power");
    }
}

class Refrigerator extends Appliance {              // 2nd child class
    public void powerOn(){
        System.out.println("Refrigerator power on by button");
    }
}
// ------

class Animal1 {                                    // 3rd parent class
    public void sound (){
        System.out.println("Aniaml makes some sound");
    }
}

class Dog extends Animal1{                          // 3rd child class
    public void sound(){
        System.out.println("Dog barks");
    }
}

// create main class

public class MethodOverriding {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.drawn();

        Circle circle = new Circle();
        circle.drawn();

        Appliance appliance = new Appliance();
        appliance.powerOn();

        Refrigerator refrigerator = new Refrigerator();
        refrigerator.powerOn();

        Animal1 animal1 = new Animal1();
        animal1.sound();

        Dog dog = new Dog();
        dog.sound();
    }
}
