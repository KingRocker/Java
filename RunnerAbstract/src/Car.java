/*
  Do not edit this class.
 */
public class Car extends FourWheeled implements Drive{
    public void drive(){
        setDistanceTravelled(getDistanceTravelled() + 10);
        System.out.println("..vroom...");
    }
}
