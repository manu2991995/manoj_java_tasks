public class Class4 {
    private String state;
    private double littracyRate;

    public Class4(String state, double littracyRate){
        this.state = state;
        this.littracyRate = littracyRate;
    }

    public String getState(){
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public double getLittracyRate() {
        return littracyRate;
    }

    public void setLittracyRate(double littracyRate) {
        this.littracyRate = littracyRate;
    }

    public static void main(String[] args) {
        Class4 class4 =new Class4("Tamilnadu", 80.09);
        System.out.println("Name of the state: " + class4.getState());
        System.out.println("Name of the state: " + class4.getLittracyRate());

        class4.setState("Karnataka");
        class4.setLittracyRate(75.36);

        System.out.println("Name of the state: " + class4.getState());
        System.out.println("Name of the state: " + class4.getLittracyRate());

        class4.setState("Andra Pradesh");
        class4.setLittracyRate(67.02);

        System.out.println("Name of the state: " + class4.getState());
        System.out.println("Name of the state: " + class4.getLittracyRate());

    }
}
