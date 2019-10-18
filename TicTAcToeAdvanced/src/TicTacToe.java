import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.io.IOException;


public class TicTacToe {

    public JButton[] grid = new JButton[9];
    public ImageIcon xIcon, oIcon;

    public int[] board = new int[9];
    public boolean won = false;

    public int currentPlayer = 1;

    public void play(int id) {
        System.out.println("Playing Square " + id);

        if (attemptChange(id)) {
            currentPlayer = (currentPlayer == 1) ? 2 : 1;
            checkWin();
        }

    }

    public boolean attemptChange(int square) {
        if (board[square] != 0) {
            return false;





        } board[square] = currentPlayer;
        grid[square].setIcon(currentPlayer == 1 ? xIcon : oIcon);
        return true;
    }

        public void checkWin() {
            if ((board[0] == board[1]) && (board[1] == board[2]) && board[2] != 0) {
                win(0);
            }
            if((board[3] == board[4]) && (board[4] == board[5]) && board[5] != 0) {
                win(5);
            }
            if((board[6] == board[7]) && (board[7] == board[8]) && board[8] != 0){
                win(8);
        }

        //--------------------------------------------------------------------------

            if ((board[0] == board[3]) && (board[3] == board[6]) && board[6] != 0) {
                win(6);
            }
            if((board[1] == board[4]) && (board[4] == board[7] && board[7] != 0)) {
                win(7);
            }
            if((board[2] == board[5]) && (board[5] == board[8]) && board[8] != 0) {
                win(8);
            }

            //-----------------------------------------------------------------------

            if((board[0] == board[4]) && (board[4] == board[8]) && board[8] != 0) {
                win(7);
            }
            if((board[6] == board[4]) && (board[4] == board[2]) && board[2] != 0) {
                win(2);
            }

            for (int i = 0; i < board.length; i++){
                if(board[i] == 0) return;
            }
            if(!won)
                draw();
}


    public void win(int square){

        won = true;

        String winner = board[square] == 1 ? "X" : "O";

        if(JOptionPane.showConfirmDialog(new JFrame("Winner! Congratulations " + winner), "Player " + winner + " has won!  Would you like to play again?" ) == JOptionPane.YES_OPTION){
            restart();
        }else{
            System.exit(0);
        }

        }

        public void restart(){
        won = false;
        currentPlayer = 1;
        for(int i = 0; i < 9; i++){
            board[i] = 0;
            grid[i].setIcon(null);
        }
        }

        public void draw(){

            if(JOptionPane.showConfirmDialog(new JFrame("It's a draw!"), "It's a draw! Would you like to play again?" ) == JOptionPane.YES_OPTION){
                restart();
            }else{
                System.exit(0);
            }
        }


    public void init_compopnents(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setSize(550,550);
        JPanel panel= new JPanel();
        frame.setContentPane(panel);
        panel.setLayout(new GridLayout(3, 3, 0, 0));

        panel.addComponentListener(new ComponentListener() {

            public void componentResized(ComponentEvent arg0) {

                init_icons();

            }


            public void componentMoved(ComponentEvent arg0) {

            }


            public void componentShown(ComponentEvent arg0) {

            }


            public void componentHidden(ComponentEvent e) {

            }

        });
        for(int i = 0; i < 9; i++){
            final int pos = i;
            grid[i] = new JButton();
            grid[i].addActionListener(new ActionListener() {
                int id = pos;
                public void actionPerformed(ActionEvent arg0) {
                    play(id);
                }
            });

            panel.add(grid[i]);
        }

        frame.setSize(450, 450);

    }
    public void init_icons(){
        try {
            Image x  = ImageIO.read(TicTacToe.class.getResource("/x.png"));
            Image o = ImageIO.read(TicTacToe.class.getResource("/o.png"));


        xIcon = new ImageIcon(x.getScaledInstance(grid[0].getWidth(), grid[0].getHeight(), Image.SCALE_SMOOTH));
            oIcon = new ImageIcon(o.getScaledInstance(grid[0].getWidth(), grid[0].getHeight(), Image.SCALE_SMOOTH));

            for(int i = 0; i < 9; i++){
                if(grid[i].getIcon()!= null)grid[i].setIcon(board[i] == 1 ? xIcon : oIcon);
            }

        } catch (IOException ex){
            ex.printStackTrace();
        }

    }

    public static void main(String[] args) {
        TicTacToe m = new TicTacToe();
        m.init_compopnents();
        m.init_icons();

    }
}
