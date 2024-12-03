package Adavance_java_individual_tasks_givenby_praveen;

   // overloading polymerphism
   public class PolyOverloading{
       public void add (int b, int a){                    //#1. order of parameter
           int x = a + b;
           System.out.println("Addition :" + x);
       }

       public void add (int a, int b, int c){             //#2. number of parameter
           int y = a+b+c;
           System.out.println("Addition :" + y);
       }

       public void add (double a, double b, double c) {   //3. type of parameter
           double z = a + b + c;
           System.out.println("Addition :" + z);
       }


           public static void main (String[]args){
               PolyOverloading polyOverloading = new PolyOverloading();
               polyOverloading.add(5, 5);
               polyOverloading.add(7, 7, 7);
               polyOverloading.add(2.5, 2.5, 2.5);

           }
       }
