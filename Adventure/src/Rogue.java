
public class Rogue extends Player {

    public Rogue(String rogueName){
        super("Sly "+rogueName,80,120,80);
        setPlayerClass("Rogue");
    }

    public void attack(Monster monster) {
        System.out.println(getName()+" fires an arrow at the "+monster.getSpecies());
        System.out.println(monster.getSpecies()+" loses "+getAttackStrength()+" HP");
        setHP(monster.getHP()-monster.getAttackStrength());
    }
}
