
/*
  Do not edit this class.
*/
public class Bicycle extends TwoWheeled implements Pedal{
    public void pedal(){
        setDistanceTravelled(getDistanceTravelled() + 1);
        System.out.println("..squeak squeak...");
    }
}
