
public class Knight extends Player {

    public Knight(String knight){
        super("Sir "+knight,150,100,150);
        setPlayerClass("Knight");
    }

    public void attack(Monster monster) {
        System.out.println(getName()+" swings his sword at the "+monster.getSpecies());
        System.out.println(monster.getSpecies()+" loses "+getAttackStrength()+" HP");
        setHP(monster.getHP()-monster.getAttackStrength());
    }
}
