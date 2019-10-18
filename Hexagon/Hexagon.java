import java.util.Scanner;


public class Hexagon {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String hexSideLeng = "Enter the hexagon's side length";
        System.out.println(hexSideLeng);
        int sideInput = in.nextInt();
        double area;
        area = (3*Math.sqrt(3));
        area = (area / 2  * Math.pow(sideInput, 2));
        System.out.println(area);



    }
}
