public class Prt2 {
    public static void main(String[] args) {
        int a = 2, b = 3, c = 2;

        //logical operators
        System.out.println( " and : " + ((a==b) && (a==c)));
        System.out.println( " or : " + ((a==b) || (a==c)));
        System.out.println( " or : " + ((a==b) || (b==c)));
        System.out.println( " not : " + (!(a==b)));

        // assignment operators

        System.out.println("+= :" + (a+=5));
        System.out.println("-= :" + (a-=5));
        System.out.println("*= :" + (a*=5));
        System.out.println("/= :" + (a/=5));
        System.out.println("%= :" + (a%=5));
        System.out.println(a);



    }
}
