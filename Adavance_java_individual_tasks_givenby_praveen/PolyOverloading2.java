package Adavance_java_individual_tasks_givenby_praveen;

public class PolyOverloading2 {
    public void sub (int a, int b){
        int x = a-b;
        System.out.println("Substraction::" + x);
    }

    public void sub (int a, int b, int c){
        int y = a-b-c;
        System.out.println("Substarction::"+ y);
    }

    public void sub (double a, double b, double c){
        double z = a-b-c;
        System.out.println("Substraction::" + z);
    }

    public static void main(String[] args) {
        PolyOverloading2 polyOverloading2 = new PolyOverloading2();
        polyOverloading2.sub(58,15);
        polyOverloading2.sub(100,50,25);
        polyOverloading2.sub(25.5,5.5,4.5);
    }
}
