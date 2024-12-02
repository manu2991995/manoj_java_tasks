package Java_tasks_givenby_adikartik;

public class Collegeobj {
    String collegeName = "gopalan";
    String collegeAdress = "hoodi";
    int startedYear = 2010;
    int numberOfBranches = 4;

    public Collegeobj ( String name, String adress, int year, int branches) {
        collegeName = name;
        collegeAdress = adress;
        startedYear = year;
        numberOfBranches = branches;
    }
    Collegeobj(){

    }

    public static void main(String[] args) {
        System.out.println("------- engineering college details-------");
        Collegeobj c1 = new Collegeobj();
        System.out.println("name of the college= " + c1.collegeName);
        System.out.println("adress of the college= " + c1.collegeAdress );
        System.out.println("established in= " + c1.startedYear );
        System.out.println("total number of branches= " + c1.numberOfBranches);

        System.out.println("---------------------------------------------------");

        Collegeobj c2 = new Collegeobj("newhorizon", "marathahalli", 2000, 6);
        System.out.println("name of the college= " + c2.collegeName);
        System.out.println("adress of the college= " + c2.collegeAdress );
        System.out.println("established in= " + c2.startedYear );
        System.out.println("total number of branches= " + c2.numberOfBranches);

        System.out.println("---------------------------------------------------");

        Collegeobj c3 = new Collegeobj("mvj", "channasandra", 1990, 8);
        System.out.println("name of the college= " + c3.collegeName);
        System.out.println("adress of the college= " + c3.collegeAdress );
        System.out.println("established in= " + c3.startedYear );
        System.out.println("total number of branches= " + c3.numberOfBranches);

        System.out.println("---------------------------------------------------");

        Collegeobj c4 = new Collegeobj("cmrit", "kundalahalli", 1980, 10);
        System.out.println("name of the college= " + c4.collegeName);
        System.out.println("adress of the college= " + c4.collegeAdress );
        System.out.println("established in= " + c4.startedYear );
        System.out.println("total number of branches= " + c4.numberOfBranches);




    }
}
