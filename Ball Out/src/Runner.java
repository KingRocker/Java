
/**
 ** DO NOT EDIT THIS CLASS **
 Use this class to check that your Player class works correctly.
 This class should print out 'true' for all of its tests.
 **/
public class Runner{
    public static void main(String[]args){

        // Create a new player called Ed with 10 Xp.
        Player player1 = new Player(10.0);
        player1.name = "Ed";

        // Check that player1 has the right attributes
        System.out.println("Loading player1...");
        System.out.println(player1.name.equals("Ed"));
        System.out.println(player1.level.equals("Beginner"));
        System.out.println(player1.getLives() == 3);
        System.out.println(player1.getAmmo() == 10000);

        // Create a new player called Johnny with 10 Xp and 100 ammo.
        Player player2 = new Player(25.0);
        player2.name = "Johnny";
        player2.setAmmo(100);

        // Check that the player2 has the correct attributes
        System.out.println("Loading player2...");
        System.out.println(player2.name.equals("Johnny"));
        System.out.println(player2.level.equals("Novice"));
        System.out.println(player2.getLives() == 3);
        System.out.println(player2.getAmmo() == 100);


        // Create a new player called jack with 150 Xp, 2 lives and 1 ammo
        Player player3 = new Player(150.5);
        player3.name = "Jack";
        player3.setAmmo(1);
        player3.setLives(2);

        // Check that the reliant has the correct attributes.
        System.out.println("Loading player3...");
        System.out.println(player3.name.equals("Jack"));
        System.out.println(player3.level.equals("Explorer"));
        System.out.println(player3.getLives() == 2);
        System.out.println(player3.getAmmo() == 1);
    }
}
