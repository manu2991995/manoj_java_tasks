package Adavance_java_individual_tasks_givenby_praveen;

public class PolyOverloading3 {
    public void mul(int a, int b){
        int x = a*b;
        System.out.println("Multiplication::" + x);
    }

    public void mul(int a, int b, int c){
        int y = a*b*c;
        System.out.println("Multiplication::" + y);
    }

    public void mul (double a, double b, double c){
        double z = a*b*c;
        System.out.println("Multiplication::" + z);
    }

    public static void main(String[] args) {
        PolyOverloading3 polyOverloading3 = new PolyOverloading3();
        polyOverloading3.mul(50,50);
        polyOverloading3.mul(5,5,5);
        polyOverloading3.mul(3.2,3.2,3.2);
    }
}
