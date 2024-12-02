package Advance_java_group_tasks_givenby_praveen;



class Grandfather {
    String land = "Land (Advance_java_group_tasks_givenby_praveen.Grandfather's property)";
    public void showLand(){
        System.out.println("Inherited property: " + land);
    }
}

class Father extends Grandfather {
    String house = "House (Advance_java_group_tasks_givenby_praveen.Father's property)";

    public void showHouse() {
        System.out.println("Advance_java_group_tasks_givenby_praveen.Father's own property: " + house);
    }
}

class Son extends Father {
    int bankBalance = 500000;

    public void showBalance() {
        System.out.println("Advance_java_group_tasks_givenby_praveen.Son's bank balance: " + bankBalance);

    }
}


class Grandson extends Son {
    String car = "Adavance_java_individual_tasks_givenby_praveen.Car (Advance_java_group_tasks_givenby_praveen.Grandson's property)";

    public void showCar() {
        System.out.println("Advance_java_group_tasks_givenby_praveen.Grandson's property: " + car);
    }
}

class Greatgrandson extends Grandson {
    String gold = "Gold (Advance_java_group_tasks_givenby_praveen.Greatgrandson's property)";

    public void showGold() {
        System.out.println("Advance_java_group_tasks_givenby_praveen.Greatgrandson's property: " + gold);
    }
}
public class Main{

    public static void main(String[] args) {
        //Daughter daughter = new Daughter();
        Greatgrandson greatgrandson = new Greatgrandson();
        greatgrandson.showLand();
        greatgrandson.showHouse();
        greatgrandson.showBalance();
        greatgrandson.showCar();
        greatgrandson.showGold();

        System.out.println("****Properties list*****");
        System.out.println("---> :" + greatgrandson.land);
        System.out.println("---> :" + greatgrandson.house);
        System.out.println("---> :" + greatgrandson.bankBalance);
        System.out.println("---> :" + greatgrandson.car);
        System.out.println("---> :" + greatgrandson.gold);
    }
}







