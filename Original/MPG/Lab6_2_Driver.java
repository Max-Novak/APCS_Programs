import apcslib.*;
import chn.util.*;
/**
 * Used for inputting values into the working class.
 *
 * @author Max Nova
 * @version Sept 15
 */
public class Lab6_2_Driver
{
    
    
    public static void main(String []args)
    {
        //Declare variables
        int odometerReading;
        double gallons;
        
        //Create new input class object
        ConsoleIO input = new ConsoleIO();
        
        //Set "auto" as identifier for Car
        Car auto;
        
        //Ask for the first odometer reading
        System.out.print("New car odometer reading: ");
        odometerReading = input.readInt();
        
        System.out.println();
        
        auto = new Car(odometerReading);
        
        //Get the distance and gallons uses/traveled
        System.out.println("Filling Station Visit");
        System.out.print("    odometer reading: ");
        odometerReading = input.readInt();
        
        System.out.print("    gallons to fill tank: ");
        gallons = input.readDouble();
        
        System.out.println();
        
        //Run the functions and output the values
        auto.fillUp(odometerReading, gallons);
        System.out.println("Miles per gallon: " + Format.left(auto.calculateMPG(), 0 , 2));
        
        System.out.println();
        
        //SECOUND RUN!!!!!!!!!!!!!!!!!!!!!!
        
        //Ask for first odometer raeding
        System.out.println("Filling Station Visit");
        System.out.print("    odometer reading: ");
        odometerReading = input.readInt();
        
        System.out.print("    gallons to fill tank: ");
        gallons = input.readDouble();
        
        System.out.println();
        
        //Run the functions to produce outputs
        auto.fillUp(odometerReading, gallons);
        System.out.println("Miles per gallon: " + Format.left(auto.calculateMPG(), 0 , 2));
        
    }
}
