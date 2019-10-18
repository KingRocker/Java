/*
  Use this class to test that you have written the TwoWheeled.java,
  FourWheeled.java, Vehicle.java classes, and the Drive.java and Pedal.java
  interfaces correctly.
 */
public class Runner{
    public static void main(String[]args){

        System.out.println("Testing the Car class:");
        Vehicle car = new Car();
        System.out.println("The car has " + ((Car)car).getNumWheels() + " wheels.");
        PrintMessage(car);
        ((Car)car).drive();
        PrintMessage(car);
        System.out.println();

        System.out.println("Testing the Motorbike class:");
        Vehicle motorbike = new Motorbike();
        System.out.println("The motorbike has " + ((Motorbike)motorbike).getNumWheels() + " wheels.");
        PrintMessage(motorbike);
        ((Motorbike)motorbike).drive();
        PrintMessage(motorbike);
        System.out.println();

        System.out.println("Testing the Bicycle class:");
        Vehicle bicycle = new Bicycle();
        System.out.println("The bicycle has " + ((Bicycle)bicycle ).getNumWheels() + " wheels.");
        PrintMessage(bicycle);
        ((Bicycle)bicycle).pedal();
        PrintMessage(bicycle);
    }

    private static void PrintMessage(Vehicle vehicle){
        String vehicleType = vehicle.getClass().toString().split(" ")[1];
        int distance = vehicle.getDistanceTravelled();
        System.out.println("The " + vehicleType + " has travelled " + distance + " kilometers.");
    }
}

