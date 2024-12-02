package Java_Individual_tasks_givenby_praveen;/*
public class Java_Individual_tasks_givenby_praveen.Animal {
    String nameOfAnimal = "lion";
    char wildAnimal = 'Y';
    boolean livesInForest  = true;
    int numberOfLegs = 4;
    int lifeSpan = 15;

    public Java_Individual_tasks_givenby_praveen.Animal( String name, char wild, boolean forest, int legs, int span){
        nameOfAnimal = name;
        wildAnimal = wild;
        livesInForest = forest;
        numberOfLegs = legs;
        lifeSpan = span;
    }
    Java_Individual_tasks_givenby_praveen.Animal(){

    }

    public static void main(String[] args) {
        Java_Individual_tasks_givenby_praveen.Animal a1 = new Java_Individual_tasks_givenby_praveen.Animal();
        System.out.println("name of the Java_Individual_tasks_givenby_praveen.Animal :" + a1.nameOfAnimal);
        System.out.println("lives in forest :" + a1.livesInForest);

        Java_Individual_tasks_givenby_praveen.Animal a2 = new Java_Individual_tasks_givenby_praveen.Animal("dog", 'N', false, 4, 12 );
        System.out.println("name of the animal :" + a2.nameOfAnimal);
        System.out.println("dog lives in forest :" + a2.livesInForest);

    }

}
*/




class Animal {
    String legs ="Java_Individual_tasks_givenby_praveen.Animal have generally 4 legs";
    void eat(){
        System.out.println("This is an generic animal " + legs);
    }
}

class Tiger extends Animal{
    //eat is part of tiger class
    void TigerFood(){
        System.out.println("This is an Java_Individual_tasks_givenby_praveen.Tiger and It will eat meat ");
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        //Can I access the eat method of Java_Individual_tasks_givenby_praveen.Animal by using the tiger object
        tiger.eat();
        tiger.TigerFood();

    }
}


