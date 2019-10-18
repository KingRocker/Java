import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        int player1=0,player2=0;
        int score1=0,score2=0;
        boolean continue1=true;



        while(continue1==true) {
            System.out.println("Player one: Choose your weapon!");
            player1=in.nextInt();
            if (player1==4) {
                continue1=false;
                if(score1==score2 ){
                    System.out.println("Player One and Player Two are tied with "+score1+" points.");
                }else if (score1>score2){
                    System.out.println("The winner is Player One with "+score1+" points");
                }else if (score1<score2){
                    System.out.println("The winner is Player Two with "+score2+" points");
                }
                System.out.println("Quitting");
                //ending code
            }else {
                System.out.println("Good Choice!");
                System.out.println("Player two: Choose your weapon!");
                player2=in.nextInt();

                if (player2==4) {
                    continue1=false;
                    if(score1==score2 ){
                        System.out.println("Player One and Player Two are tied with "+score1+" points.");
                    }else if (score1>score2){
                        System.out.println("The winner is Player One with "+score1+" points");
                    }else if (score1<score2){
                        System.out.println("The winner is Player Two with "+score2+" points");
                    }
                    System.out.println("Quitting");
                    //ending code
                }else {
                    System.out.println("Good Choice!");
                    System.out.println("Player One chose: "+RPS(player1));
                    System.out.println("Player Two chose: "+RPS(player2));
                    if ((player1==1)){
                        if (player2==1){
                            System.out.println("It's a draw!");
                        }else if (player2==2) {
                            System.out.println("Player Two wins!");
                            score2++;
                        }else if (player2==3) {System.out.println("Player One wins!");
                            score1++;}
                    }else

                    if ((player1==2)){
                        if (player2==1){
                            System.out.println("Player One wins!");
                            score1++;
                        }else if (player2==2) {
                            System.out.println("Its a draw!");
                        }else if(player2==3) {System.out.println("Player Two wins!");
                            score2++;}
                    }else

                    if ((player1==3)){
                        if (player2==1){
                            System.out.println("Player Two wins!");
                            score2++;
                        }else if (player2==2) {
                            System.out.println("Player One wins!");
                            score1++;
                        }else if(player2==3) {System.out.println("Its a draw!");}


                    }
                    System.out.println("The score is now: "+score1+" - "+score2);
                }
            }
        }//
    }


    public static String RPS(int a) {
        String rps1="";
        switch (a) {
            case 1:
                rps1="rock";
                break;
            case 2:
                rps1="paper";
                break;
            case 3:
                rps1="scissors";
                break;

        }
        return rps1;


    }

}