public class Sports {
    String nameOfTheSport = "cricket";
    String originFrom = "England";
    String boardName = "icci";
    int numOfPlayers = 11;
    boolean addedToOlympics = false;

 public Sports( String name, String origin, String board, int players, boolean olympics){
     nameOfTheSport = name;
     originFrom = origin;
     boardName = board;
     numOfPlayers = players;
     addedToOlympics = olympics;
 }
 Sports(){

 }

    public static void main(String[] args) {
        Sports a1 = new Sports();
        System.out.println("name of the cricket board :" + a1.boardName);

        Sports a2 = new Sports("hockey","India","ihf",20, true);
        System.out.println("name of the sports :" + a2.nameOfTheSport);
        System.out.println("hockey is a olympic game :" + a2.addedToOlympics);

    }

 }
