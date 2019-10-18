
public class PizzaOrder{
    public static void main(String[] args) {

        // create an Array of type Pizza and size three.
        Pizza[] threeForOne = new Pizza[3];
        // create three Pizza objects and store in array.
        threeForOne[0] = new Pizza("Flour", "Hawaiian");
        threeForOne[1] = new Pizza("Cauliflower", "Pepperoni");
        threeForOne[2] = new Pizza("Broccoli", "Broccoli");
        //create Order object and pass Pizza array in as argument
        Order myOrder = new Order(threeForOne);
        myOrder.printOrder();
    }
}
