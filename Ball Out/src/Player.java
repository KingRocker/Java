
public class Player {

    private double Xp=20.0;
    private int lives=3;
    private int ammunition=10000;

    public String name;
    public String level;

    public Player(double argument) {
        if(argument<20.5) {
            level="Beginner";
        }else if (argument>=20.5&&argument<100) {
            level="Novice";
        }else {
            level= "Explorer" ;
        }
    }

    public double getXp() {
        return Xp;
    }
    public void setXp(double xp) {
        Xp = xp;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getAmmo() {
        return ammunition;
    }

    public void setAmmo(int ammunition) {
        this.ammunition = ammunition;
    }


}
