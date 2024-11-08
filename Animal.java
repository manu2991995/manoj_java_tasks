public class Animal {
    String nameOfAnimal = "lion";
    char wildAnimal = 'Y';
    boolean livesInForest  = true;
    int numberOfLegs = 4;
    int lifeSpan = 15;

    public Animal( String name, char wild, boolean forest, int legs, int span){
        nameOfAnimal = name;
        wildAnimal = wild;
        livesInForest = forest;
        numberOfLegs = legs;
        lifeSpan = span;
    }
    Animal(){

    }

    public static void main(String[] args) {
        Animal a1 = new Animal();
        System.out.println("name of the Animal :" + a1.nameOfAnimal);
        System.out.println("lives in forest :" + a1.livesInForest);

        Animal a2 = new Animal("dog", 'N', false, 4, 12 );
        System.out.println("name of the animal :" + a2.nameOfAnimal);
        System.out.println("dog lives in forest :" + a2.livesInForest);

    }

}

