import apcslib.*;
import chn.util.*;
/**
 * Working class that calculates data for the driver.
 *
 * @author Max N
 * @version Sept 14
 */
public class Car
{
    //TYPECAST THE INSTANCE VARIABLES
    private int myStartMiles, myEndMiles;
    private double myGallonsUsed;

    //CONSTRUCTOR TO ASSIGN DEFAULT VALUES TO THE INSTANCE VARIABLES
    public Car(int odometerReading)//Public allows driver to access new objects
    {
        myStartMiles = odometerReading;
        myEndMiles = odometerReading;//Create first odometer reading
    }
    
    //METHOD TO FILLUP
    public void fillUp(int odometerReading, double gallons)
    {
        myStartMiles = myEndMiles;//Fill the tank
        myEndMiles = odometerReading;//Record current odometer
        myGallonsUsed = gallons;//Record numbers of gallons required to fill the tank
    }
    
    //METHOD TO CALC MPG
    public double calculateMPG()
    {
       return ((myEndMiles - myStartMiles) / myGallonsUsed);//Return the MPG of the car
    }
}


