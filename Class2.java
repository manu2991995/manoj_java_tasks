public class Class2 {
    private String brand;
    private int year;

    public Class2(String brand, int year){
        this.brand = brand;
        this.year = year;
    }
    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static void main(String[] args) {
        Class2 class2 = new Class2("Thar", 2024);

        System.out.println("Car brand : " + class2.getBrand());
        System.out.println("Car mfg year: " + class2.getYear());

        class2.setBrand("KIA Seltos");
        class2.setYear(2022);

        System.out.println("New car brand : " + class2.getBrand());
        System.out.println("New mfg year : " + class2.getYear());
    }

}
