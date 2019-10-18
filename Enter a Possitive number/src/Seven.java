
import java.util.Scanner;
public class Seven {
    public static void main(String[]args) {
        int remainder, multiples;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a positive number:");
        int answer = in.nextInt();

        if(answer>0) {
            remainder=answer%7;

            if (remainder>0) {
                answer=answer-remainder;
                multiples=answer/7;
                for(int i= 1;i<multiples+1;i++) {
                    System.out.println("Lucky "+(7*i)+"!");
                }
            }else {
                multiples=answer/7;
                for(int i= 1;i<multiples+1;i++) {
                    System.out.println("Lucky "+(7*i)+"!");
                }
            }
        }
    }
}