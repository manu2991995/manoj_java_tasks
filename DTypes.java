public class DTypes {
    // prmitive data types
    int a=5;
    short b=6;
    long c=9;
    short bb=32767;
    short bbb=3276;
    int aa=32768;
    int aaa=214748364;
    long cc=2147483648L;
    float d = 5.2f;
    float dd = -5.2f;
    double e = 555555.55555;
    double ee = -5555.5568;
    boolean f = true;
    boolean ff = false;
    char g = 'a';
    char gg = '@';
    char ggg = '2';

    //advanced data types or wrapper data types
    String s = "manu";
    String ss = new String("manu29");
    Integer i = 123;
    Integer ii = new Integer(12);
    Double d1 = 125.66;
    Float f1 = 12.5f;
    Short s1 = 1;
    Long l1 = 5345L;
    Character c1 = 'A';



    public static void main(String[] args) {
        DTypes h = new DTypes();

        System.out.println("-------primitive data types--------");
        System.out.println("integer =" + h.a);
        System.out.println("short=" + h.bb);
        System.out.println("long=" + h.cc);
        System.out.println("float=" + h.dd);
        System.out.println("double=" + h.ee);
        System.out.println("boolean=" + h.f);
        System.out.println("boolean=" + h.ff);
        System.out.println("char=" + h.g);
        System.out.println("char=" + h.gg);
        System.out.println("char=" + h.ggg);
        System.out.println("----------------------------------------");
        System.out.println("---------wrapper data types-----------");
        System.out.println("String =" + h.s);
        System.out.println("String =" + h.ss);
        System.out.println("Integer =" + h.i);
        System.out.println("Integer =" + h.ii);
        System.out.println("Double =" + h.d1);
        System.out.println("Float =" + h.f1);
        System.out.println("Long =" + h.l1);
        System.out.println("Charcter =" + h.c1);

    }


}
