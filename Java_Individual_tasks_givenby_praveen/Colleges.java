package Java_Individual_tasks_givenby_praveen;

public class Colleges {
    String collegeName = "gjhyfjy";
    String collegeAdress = "BLR";
    int startedYear = 2010;
    int numberOfBranches = 4;
    double studentGettingPlacement = 75.5;

    public Colleges(String name, String adress, int year, int branches, double Placement) {
        collegeName = name;
        collegeAdress = adress;
        startedYear = year;
        numberOfBranches = branches;
        studentGettingPlacement = Placement;
    }

    Colleges() {
    }

    public static void main(String[] args) {
        System.out.println("------- engineering college details-------");
        Colleges c1 = new Colleges("xyz", "ghgh", 45, 15, 56.35);
        System.out.println("name of the college= " + c1.collegeName);
        System.out.println("established in= " + c1.startedYear);

        System.out.println("---------------------------------------------------");

        Colleges c2 = new Colleges("mvj", "MYS", 2000, 6, 89.9);
        System.out.println("name of the college= " + c2.collegeName);
        System.out.println("student getting jobs= " + c2.studentGettingPlacement);
    }

}
