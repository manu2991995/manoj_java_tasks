public class Favouriteplayers {
        String favouritePlayer = "virat";
        String iplTeam = "rcb";
        String playerFrom = "delhi";
        int numberOfCenturies = 80;
        double strikeRate = 75.5;

        public Favouriteplayers (String player, String team, String from, int Centuries, double strike) {
            favouritePlayer = player;
            iplTeam = team;
            playerFrom = from;
            numberOfCenturies = Centuries;
            strikeRate = strike;
        }

      Favouriteplayers() {
        }

        public static void main(String[] args) {
            System.out.println("------- Favourite players details-------");
            Favouriteplayers c1 = new Favouriteplayers();
            System.out.println("name of the player= " + c1.favouritePlayer);
            System.out.println("belongs to= " + c1.iplTeam);

            System.out.println("---------------------------------------------------");

            Favouriteplayers c2 = new Favouriteplayers("mvj", "rcb", "karnataka", 12, 69.9);
            System.out.println("name of the player= " + c2.favouritePlayer);
            System.out.println("he is from= " + c2.playerFrom);
        }

    }


