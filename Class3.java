public class Class3 {
    private String student;
    private int admissionYear;
    private double percentage;

    public Class3(String student, int admissionYear, double percentage){
        this.student = student;
        this.admissionYear = admissionYear;
        this.percentage = percentage;
    }
    public String getStudent(){
        return student;
    }
    public void setStudent(String student){
        this.student = student;
    }
    public int getAdmissionYear() {
        return admissionYear;
    }

    public void setAdmissionYear(int admissionYear) {
        this.admissionYear = admissionYear;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public static void main(String[] args) {
        Class3 class3 = new Class3("Mahesh", 2001, 85.62);
        System.out.println("Student1 Name: " + class3.getStudent());
        System.out.println("Student1 Admission year: " + class3.getAdmissionYear());
        System.out.println("Student1 percentage: " + class3.getPercentage());

        class3.setStudent("Ramesh");
        class3.setAdmissionYear(2002);
        class3.setPercentage(75.42);

        System.out.println("Student2 Name: " + class3.getStudent());
        System.out.println("Student2 Admission year: " + class3.getAdmissionYear());
        System.out.println("Student2 percentage: " + class3.getPercentage());

        class3.setStudent("Sureshh");
        class3.setAdmissionYear(2003);
        class3.setPercentage(95.74);

        System.out.println("Student3 Name: " + class3.getStudent());
        System.out.println("Student3 Admission year: " + class3.getAdmissionYear());
        System.out.println("Student3 percentage: " + class3.getPercentage());

    }
}
