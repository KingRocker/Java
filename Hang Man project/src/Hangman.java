import java.util.ArrayList;
import java.util.Scanner;

public class Hangman {


    static public void guess(String word, int life) {


        char[] filler = new char[word.length()];
        int i = 0;
        while(i<word.length()){

            filler[i] = ('_');
            if (word.charAt(i) == ' '){
                filler[i] = ' ';
            }
            i++;
        }




        Scanner in = new Scanner(System.in);

        ArrayList<Character> up = new ArrayList<>();

        while (life>0){

            System.out.println("Player Two, you have " + life + " guesses left. Enter a guess:");

            System.out.println(filler);

            char x = in.next().charAt(0);


            if (up.contains(x)){
                System.out.println("You have already guessed " +"'"+x+"'.");
                continue;
            }
            up.add(x);

            if(word.contains(x+"")){
                for(int y=0;y<word.length(); y++) {
                    if(word.charAt(y) == x){
                        filler[y] = x;
                    }
                }
            }
            else {
                life--;
            }
            if (word.equals(String.valueOf(filler))){
                System.out.println(filler);
                System.out.println("Game over. Player Two wins!");
                break;
            }
            System.out.println(filler);


        }

        if (life == 0){
            System.out.println("Game over. The word was: " + word);
        }
    }

    public static void main(String[] args) {
        System.out.println("Player One, enter a word:");
        Scanner in = new Scanner(System.in);
        String word = in.next();
        int life = 8;
        guess(word,life);
    }
}
