import java.util.Scanner;
public class CodeBreaker {
public static void main(String...args) {
	Scanner in = new Scanner(System.in);
    System.out.println("Please enter a secret code:");
    String answer = in.nextLine();
    String input= " ";
    
    while(!(answer.equals(input))) {
    	System.out.println("Please enter a guess:");
    	input=in.nextLine();
    	if(!(answer.equals(input))) {
    		System.out.println("That is not the code");
    	}
    }
    System.out.println("You cracked the code");
}
}
