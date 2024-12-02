package Manoj_java_practices;

public class Studentobj {
    String studentName = "manoj";
    String studentBranch = "mechanical";
    int studentBatch = 2013;
    float studentPercentage = 79.84F;

    public Studentobj ( String name, String branch, int batch, float percentage) {
        studentName = name;
        studentBranch = branch;
        studentBatch = batch;
        studentPercentage = percentage;
    }
    Studentobj(){

    }

    public static void main(String[] args) {
        System.out.println("------- student details-------");
        Studentobj c1 = new Studentobj();
        System.out.println("name of the student= " + c1.studentName);
        System.out.println("branch name= " + c1.studentBranch);
        System.out.println("student batch= " + c1.studentBatch );
        System.out.println("percentage of the student= " + c1.studentPercentage);

        System.out.println("***************************************************");

        Studentobj c2 = new Studentobj("nagraj", "civil", 2015, 80.25F);
        System.out.println("name of the student= " + c2.studentName);
        System.out.println("branch name= " + c2.studentBranch);
        System.out.println("student batch= " + c2.studentBatch );
        System.out.println("percentage of the student= " + c2.studentPercentage);

        System.out.println("***************************************************");

        Studentobj c3 = new Studentobj("kartik", "electrical", 2014, 70.76F);
        System.out.println("name of the student= " + c3.studentName);
        System.out.println("branch name= " + c3.studentBranch);
        System.out.println("student batch= " + c3.studentBatch );
        System.out.println("percentage of the student= " + c3.studentPercentage);

        System.out.println("***************************************************");

        Studentobj c4 = new Studentobj("ramesh", "computer", 2019, 80.69F);
        System.out.println("name of the student= " + c4.studentName);
        System.out.println("branch name= " + c4.studentBranch);
        System.out.println("student batch= " + c4.studentBatch );
        System.out.println("percentage of the student= " + c4.studentPercentage);




    }
}


