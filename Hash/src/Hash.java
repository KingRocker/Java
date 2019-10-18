import java.util.Scanner;

public class Hash {

        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.println("Enter a positive integer:");
            int u = in.nextInt();
            int[] up = new int[u];

            for (int i = 0; i < up.length; i++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
