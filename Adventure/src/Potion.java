
public class Potion extends Item {
    private boolean consumed=false;

    public Potion(){
        super("defence", 10000);
        setConsumable(true);
        setName("potion of fire resistance");
    }

    public int consume() {

        if(consumed==true) {return 0;}else {
            this.consumed=true;
            System.out.println("gulp gulp gulp");
            return getModifierAmount();
        }
    }

    @Override
    public String toString() {
        return getName();
    }


}
