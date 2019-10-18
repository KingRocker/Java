public class Main {
    public static void main(String[] args) {

        Player canFight = new Player();
        Player capacity = new Player();
        Player callingCard = new Player();
        Player abilities = new Player();

        capacity.setCapacity(false);
        callingCard.setCallingCard("Fighter");
        abilities.setAbilities("Kicking, Hitting, Running and Jumping");
        System.out.println("The calling card of Player is " + callingCard.getCallingCard());
        System.out.println("The fighting ability of Player is " + abilities.getAbilities());
        //System.out.println(capacity.getCanFight());

    }
}
