import java.util.Scanner;
import java.util.Arrays;

public class FizzBuzz {
    public static void main(String[]args){
    	Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit:");
		int limit = sc.nextInt();
		String[] stringArray = new String[limit];
		int[] intArray = new int[limit];

		for(int i=1; i<=limit; i++){
			stringArray[i-1] = Integer.toString(i);
			if(i%3==0){
				stringArray[i-1] = "Fizz";
			}
			if(i%5==0){
				stringArray[i-1] = "Buzz";
			}
			if(i%5==0&&i%3==0){
				stringArray[i-1] = "FizzBuzz";
			}
		}
        System.out.println(Arrays.toString(stringArray));

        sc.close();
    }
}
