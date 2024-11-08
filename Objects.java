import java.sql.SQLOutput;

public class Objects {
    String nativePlace = "kgf";
    int bornYear = 1998;
    String nameOfThePerson = "sajan";

    Objects(String place, int year, String person) {
        nativePlace = place;
        bornYear = year;
        nameOfThePerson = person;


    }

    Objects() {

    }

    public static void main(String[] args) {
        Objects c1 = new Objects();
        System.out.println(c1.nameOfThePerson);
        System.out.println(c1.nativePlace);
        System.out.println(c1.bornYear);
        Objects c2 = new Objects("bangarpet", 1995, "dilip");
        System.out.println(c2.nameOfThePerson);
        System.out.println(c2.nativePlace);
        System.out.println(c2.bornYear);
    }
}
