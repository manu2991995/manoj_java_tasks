public class Dboss {
    String actorName = "darshan";
    String bornPlace = "ponnampete";
    int yearOfBorn = 1977;
    float personHeight = 6.3f;
    int numberOfMovies = 57;

    Dboss(){

    }

    public static void main(String[] args) {
        Dboss a = new Dboss();
        System.out.println("name of the kannada actor :" + a.actorName);
        System.out.println("number of movies acted :" + a.numberOfMovies);

    }

}
