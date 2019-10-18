

public class Wizard extends Player {

    public Wizard(String wizardName){
        super(wizardName+" the Mighty",50,100,50);
        setPlayerClass("Wizard");
    }

    public void attack(Monster monster) {
        System.out.println(getName()+" throws a fireball at the "+monster.getSpecies());
        System.out.println(monster.getSpecies()+" loses "+getAttackStrength()+" HP");
        setHP(monster.getHP()-monster.getAttackStrength());
    }
}

