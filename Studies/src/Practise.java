
public class Practise {

        public String name;
        public int age;
        public int weight;

        public void hit()
        {
            System.out.println("Player hit successfully");
        }

        public void jump()
        {
            System.out.println("Player jumped successfully");
        }

        //Creating main method for program execution

        public static void main(String[] args)
        {

            Player player_object = new Player();
            player_object.hit();
            player_object.jump();
        }
}