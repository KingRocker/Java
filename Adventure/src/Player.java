import java.util.ArrayList;

public class Player extends Unit implements PlayerBehaviour {

    private String name;
    private String PlayerClass="dirty peasant";
    private int location=0;
    ArrayList<Item> inventory = new ArrayList<>(2);



    public Player(String name) {
        super(1,1,1);
        this.name=name;
        System.out.println("You are "+name+", a "+PlayerClass);
    }

    public Player(String name,int hp,int attackStrength,int defence) {
        super(hp, attackStrength, defence);
        this.name=name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public String getPlayerClass() {
        return PlayerClass;
    }

    public void setPlayerClass(String playerClass) {
        this.PlayerClass=playerClass;
    }

    public int getLocation() {
        return location ;
    }

    public void setLocation(int location) {
        this.location=location;
    }


    public void attack(Monster monster) {
        System.out.println(name+" attacks the "+monster.toString());
    }

    public void pickUp(Item item) {
        inventory.add(item);
        setAttackStrength(getAttackStrength()+item.getModifierAmount());
        System.out.println("Player attack strength increased by:"+item.getModifierAmount());
    }

    @Override
    public void move() {
        this.location=this.location+1;

    }

    public Item checkInventory(int i) {
        // TODO Auto-generated method stub
        return inventory.get(i);
    }

    @Override
    public String toString() {
        return this.name  + ", the dirty peasant,";
    }



}
