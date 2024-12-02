package Java_Individual_tasks_givenby_praveen;

public class Rcb {
    String playerName = "virat kohli";
    String bornPlace = "Delhi";
    int numberOfCenturies = 7;
    float strikeRate = 139.5f;
    boolean retainedInAllIplsToRcb = true;
    Rcb(){

    }

    public static void main(String[] args) {
        Rcb dd = new Rcb();
        System.out.println("name of the Player :" + dd.playerName);
        System.out.println("he is the only player who retained to same franchise in ipl :" + dd.retainedInAllIplsToRcb);

    }

}
