import java.util.Arrays;
import java.util.Scanner;
public class DiagonalAdd {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the side length:");
        String sideLength = in.next();
        int one = 0;
        int onecount = 0;
        int SL = Integer.parseInt(sideLength);
        int[][] threeDee = new int [SL][SL];
        int count = 0;




        for (int i = 0; i < threeDee.length; i++){
            for (int j = 0; j < threeDee[i].length; j++){
                    threeDee[i][j] = count;
                    count++;

                }

            }
        System.out.println("The array created is:");
        System.out.println("The sum of the diagonal is:");
        System.out.println(Arrays.deepToString(threeDee));


        for(int i = 0; i < threeDee.length; i++){
            one = one + threeDee[i][onecount];
            onecount++;
        }
        System.out.println(one);

        }

}
