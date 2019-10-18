

import java.util.Scanner;
public class BattleShip {



    public static void main(String[] args) {
        int count=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Pick your grid (1-4):");
        int gridNum = in.nextInt();
        Grid grid1 = new Grid(gridNum);
        System.out.println("The battle begins!");
        int index =12;
        while(grid1.checkGrid()==true && index>0) {
            count++;
            System.out.println("You have "+index+" shots remaining.");
            System.out.println("choose your square:");
            String position =in.next();
            int row,col;
            row= Integer.parseInt(position.substring(0,1));
            col =Integer.parseInt(position.substring(position.length() - 1));
            System.out.println(grid1.fire(row, col));
            grid1.printGrid();
            index--;
        }

        if(grid1.checkGrid()==true) {
            System.out.println("You're out of ammunition! Game Over!");
        }else {
            System.out.println("You won! and in only "+count +" shots!");
        }


        in.close();
    }



}