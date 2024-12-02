public class Ecommerce {
    String companyName = "amazon";
    String companyOrigin = "USA";
    int startedYear = 1999;
    char mncCompany = 'Y';
    double companyGrowth = 85.69;

    public Ecommerce(String name, String origin, int year, char mnc, double gowth) {
        companyName = name;
        companyOrigin = origin;
        startedYear = year;
        mncCompany = mnc;
        companyGrowth = gowth;
    }

    Ecommerce() {
    }

    public static void main(String[] args) {
        Ecommerce c1 = new Ecommerce();
        System.out.println("name of the ecommerce= " + c1.companyName);
        System.out.println("established in= " + c1.startedYear);

        System.out.println("---------------------------------------------------");

        Ecommerce c2 = new Ecommerce("meesho", "India", 2020, 'N', 65.57);
        System.out.println("name of ecommerce= " + c2.companyName);
        System.out.println("student getting jobs= " + c2.companyOrigin);
    }

}
