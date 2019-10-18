public class Order {
    private Pizza[] order;

    public Order(Pizza[] order){
        this.order = order;
    }

    public void printOrder(){
        String o = "3-4-1 PIZZA MADNESS";
        System.out.println(o);
        for(int u = 0; u < o.length(); u++)
            System.out.print("#");
        System.out.println();
        for (int i = 0; i < order.length; i++){
            if (!(order[i].getTopping().equals(order[i].getBase()))){
                System.out.println("You ordered a " + order[i].getTopping() + " on a " + order[i].getBase() + " base.");
            }
            else {
                System.out.println("Are you sure you want " + order[i].getTopping() + " on your " + order[i].getBase() + " base?");
            }
        }
    }
}

