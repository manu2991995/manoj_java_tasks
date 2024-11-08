public class Student {
    String studentName = "manoj";
    String studentBranch = "mechanical";
    int studentBatch = 2013;
    float studentPercentage = 79.84F;
    boolean pucStudent = true;

    public Student ( String name, String branch, int batch, float percentage, boolean puc) {
        studentName = name;
        studentBranch = branch;
        studentBatch = batch;
        studentPercentage = percentage;
        pucStudent = puc;
    }
    Student(){

    }
    public static void main(String[] args) {
        System.out.println("------- student details-------");
        Student c1 = new Student();
        System.out.println("name of the student= " + c1.studentName);
        System.out.println("puc background= " + c1.pucStudent);

        Student c2 = new Student("nagraj", "civil", 2015, 80.25F,false);
        System.out.println("name of the student= " + c2.studentName);
        System.out.println("branch name= " + c2.studentBranch);
        System.out.println("puc background= " + c2.pucStudent );

    }
}

