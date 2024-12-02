public class Class5 {
    private String taluk;
    private int numberOfVillages;

    public Class5(String taluk, int numberOfVillages){
        this.taluk = taluk;
        this.numberOfVillages = numberOfVillages;
    }

    public String getTaluk(){
        return taluk;
    }

    public void setTaluk(String taluk) {
        this.taluk = taluk;
    }

    public int getNumberOfVillages() {
        return numberOfVillages;
    }

    public void setNumberOfVillages(int numberOfVillages) {
        this.numberOfVillages = numberOfVillages;
    }

    public static void main(String[] args) {
        Class5 class5 = new Class5("Hoskote", 296);

        System.out.println("Taluk: " +class5.getTaluk());
        System.out.println(("Number of villages: " + class5.getNumberOfVillages()));
    }
}
