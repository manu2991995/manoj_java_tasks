abstract class Course {

    public abstract void qualityAssurance();

    public void basicDetails() {
        System.out.println("Information about the modes of learning the course");
    }

    public static void main(String[] args) {
        Course onlineCourse = new onlineCourse();
        onlineCourse.basicDetails();
        onlineCourse.qualityAssurance();


        Course onsiteCourse = new onsiteCourse();
        onsiteCourse.qualityAssurance();


        Course hybridCourse = new hybridCourse();
        hybridCourse.qualityAssurance();

    }
}
class onlineCourse extends Course{
    @Override //The below method is overriding with the method which is listed in the super class.
    public void qualityAssurance() {
        System.out.println("Online ----> Course will be fully virtual and accessible from anywhere");
    }
}
class onsiteCourse extends Course{
    @Override
    public void qualityAssurance() {
        System.out.println("Onsite ----> Course wll be conducting in actual classrooms");
    }
}
class hybridCourse extends Course{
    @Override
    public void qualityAssurance() {
        System.out.println("Hybrid -----> Course will be conducting in both online and offline");
    }
}
