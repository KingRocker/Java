import java.util.Arrays;
import java.util.Scanner;

public class DiagonalAdd {

    public static void main(String[] args) {

        // THE USER ENTER'S AN INT LENGTH:

        Scanner bob = new Scanner(System.in);
        System.out.println("Enter the side length:");
        int response = bob.nextInt();

        int item = 0;
        int sum = 0;

        int[][] square = new int[response][response];

        for (int i = 0; i < response; i++){
            for (int j = 0; j < response; j++){
                square[i][j] = item;
                item += 1;
                if (i==j){
                    sum += square[i][j];
                }
            }
        }
        System.out.println("The array created is:\n" + Arrays.deepToString(square));
        System.out.println("The sum of the diagonal is:\n" + sum);
    }
}
