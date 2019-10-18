public class Player {

    private String abilities;
    private String canFight;
    private String callingCard;
    private boolean capacity;

    public Player(boolean capacity){
        if (capacity == true){
            this.capacity = true;
        }else {
            this.capacity = false;
            canFight = "Unsure";
        }
    }

    public Player() {
        this.canFight = canFight;
        this.callingCard = callingCard;
        this.capacity = capacity;
    }

    public void setCapacity(boolean capacity){
        this.capacity = capacity;
    }
    public void setCanFight(String canFight) {
        this.canFight = canFight;
    }
    public String getCanFight() {
        return canFight;
    }
    public boolean isCapacity(boolean capacity){
        return capacity;
    }
    public void setAbilities(String abilities){
        this.abilities = abilities;
    }
    public String getAbilities(){
        return abilities;
    }
    public void setCallingCard(String callingCard){
        this.callingCard = callingCard;
    }
    public String getCallingCard(){
        return callingCard;
    }




}
