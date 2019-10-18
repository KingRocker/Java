/*
  Do not edit this class.
*/
public class Motorbike extends TwoWheeled implements Drive{
    public void drive(){
        setDistanceTravelled(getDistanceTravelled() + 5);
        System.out.println("..vroom...");
    }
}
