import javax.swing.*;
import java.util.Scanner;

public class PopUpRPS {

    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        int player1=0,player2=0;
        int score1 = 0,score2= 0;
        boolean continue1=true;


        JOptionPane.showMessageDialog(null, "Welcome to Rock, Paper, Scissors");
        JOptionPane.showMessageDialog(null, "\tRules:\t" + "\n\n1. Rock " + "\n\n2.Paper  " + "\n\n3.Paper  " + "\n\n4.To Quit");



        while(continue1==true) {
            player1 = Integer.parseInt(JOptionPane.showInputDialog("Player One: Choose your weapon!"));




            if (player1==4) {

                continue1=false;

                if(score1==score2)
                {
                    JOptionPane.showMessageDialog(null,"Player One and Player Two are tied with" + " " + score1 +" "+ "point(s):");

                }else if (score1>score2){
                    JOptionPane.showMessageDialog(null,"The winner is Player One with " + score1 + " point(s).");

                }else if (score1<score2){
                    JOptionPane.showMessageDialog(null,"The winner is Player Two with " + score2 + " point(s).");
                }
                JOptionPane.showMessageDialog(null,"Player1 Quit The Game");

                //ending code

            }else {
                JOptionPane.showMessageDialog(null,"Good choice!");

                player2 = Integer.parseInt(JOptionPane.showInputDialog("Player Two: Choose your weapon!"));


                if (player2==4) {
                    continue1=false;
                    if(score1==score2 ){
                        JOptionPane.showMessageDialog(null,"Player One and Player Two are tied with "+score1+" point(s).");
                    }else if (score1>score2){
                        JOptionPane.showMessageDialog(null,"The winner is Player One with "+score1+" point(s).");
                    }else if (score1<score2){
                        JOptionPane.showMessageDialog(null,"The winner is Player Two with "+score2+" point(s).");
                    }
                    JOptionPane.showMessageDialog(null,"Player2 Quit The Game");
                    //ending code
                }else {
                    JOptionPane.showMessageDialog(null,"Good choice!");
                    JOptionPane.showMessageDialog(null,"Player One chose: " + RPS(player1));
                    JOptionPane.showMessageDialog(null,"Player Two chose: "+ RPS(player2));
                    if ((player1==1)){
                        if (player2==1){
                            JOptionPane.showMessageDialog(null,"It's a draw!");
                        }else if (player2==2) {
                            JOptionPane.showMessageDialog(null,"Player Two Wins!");
                            score2++;
                        }else if (player2==3) {JOptionPane.showMessageDialog(null,"Player One Wins!");
                            score1++;}
                    }else

                    if ((player1==2)){
                        if (player2==1){
                            JOptionPane.showMessageDialog(null,"Player One Wins!");
                            score1++;
                        }else if (player2==2) {
                            JOptionPane.showMessageDialog(null,"It's a draw!");
                        }else if(player2==3) {JOptionPane.showMessageDialog(null,"Player Two Wins!");
                            score2++;}
                    }else

                    if ((player1==3)){
                        if (player2==1){
                            JOptionPane.showMessageDialog(null,"Player Two Wins!");
                            score2++;
                        }else if (player2==2) {
                            JOptionPane.showMessageDialog(null,"Player One Wins!");
                            score1++;
                        }else if(player2==3) {JOptionPane.showMessageDialog(null,"It's a draw!");}


                    }
                    JOptionPane.showMessageDialog(null,"The score is now: "+score1+" - "+score2);



                }
            }

        }//
    }


    public static String RPS(int a) {
        String rps1="";
        switch (a) {
            case 1:
                rps1 = "rock";
                break;
            case 2:
                rps1 = "paper";
                break;
            case 3:
                rps1 = "scissors";
                break;

        }
        return rps1;


    }

}