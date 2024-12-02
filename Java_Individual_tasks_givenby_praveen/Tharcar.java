package Java_Individual_tasks_givenby_praveen;

public class Tharcar {
    String variantName = "top end";
    String carColour = "black";
    char dieselEngine = 'Y';
    int mfgYear = 2024;
    float onRoadPrice = 1800000f;

    public Tharcar(String variant, String colour, char engine, int year, float price){
        variantName = variant;
        carColour = colour;
        dieselEngine = engine;
        mfgYear = year;
        onRoadPrice = price;
    }
    Tharcar(){
    }
    public static void main(String[] args) {
        Tharcar c1 = new Tharcar();
        System.out.println(c1.variantName);
        System.out.println(c1.dieselEngine);
        Tharcar c2 = new Tharcar("basic", "red", 'Y',2023,1200000);
        System.out.println(c2.variantName);
        System.out.println((c2.mfgYear));
    }

}
