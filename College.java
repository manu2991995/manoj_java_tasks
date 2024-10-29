public class College
{

    String College_Name = "Gopalan is default value";
    String Branch_Name = "Mechanical is default value";
    int Student_ID = 13018;
    char Section_Name = 'M';

    public College()
    {
        System.out.println(College_Name + " is College name");
        System.out.println(Branch_Name + " is Branch name");
        System.out.println(Student_ID + " is Student ID");
        System.out.println(Section_Name + " is Section name");
    }

    //Custom Details
    College(String Name,String Course,int Id,char section)
    {
        College_Name = Name;
        Branch_Name = Course;
        Student_ID = Id;
        Section_Name =section;
    }

    //Main method
    public static void main(String[] args) {

        System.out.println("----------------default Student Details------------------");
        new College();

        System.out.println("----------------Dilip Singh R Student Details------------------");

        College c1 = new College("Gpalan College","Mechanical",1309,'M');
        System.out.println(c1.College_Name + " is College name");
        System.out.println(c1.Branch_Name + " is Branch name");
        System.out.println(c1.Student_ID + " is Student ID");
        System.out.println(c1.Section_Name + " is Section name");

        System.out.println("----------------Manoj Singh H Student Details------------------");

        College c2 = new College("Gopalan College","Mechanical",13018,'M');
        System.out.println(c2.College_Name + " is College name");
        System.out.println(c2.Branch_Name + " is Branch name");
        System.out.println(c2.Student_ID + " is Student ID");
        System.out.println(c2.Section_Name + " is Section name");

}

}