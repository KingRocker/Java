
public abstract class Unit {

    private int hp;
    private int  attackStrength;
    private int defence;

    public Unit(int hp,int attackStrength,int defence) {
        this.hp=hp;
        this.attackStrength=attackStrength;
        this.defence=defence;
    }

    public int getHP() {
        return hp;
    }

    public void setHP(int hp) {
        this.hp=hp;
    }

    public int getAttackStrength() {
        return attackStrength;
    }

    public void setAttackStrength(int AttackStrength) {
        this.attackStrength=AttackStrength;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence=defence;
    }


}
