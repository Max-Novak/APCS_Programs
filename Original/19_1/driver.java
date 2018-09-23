import chn.util.*;
import java.awt.geom.*;
/**
 * The Ireg Polygon driver that takes input on the number of points the user will input and the actualy coordinates.
 *
 * @author Max Nova
 * @version 12/12/2017
 */
public class driver
{
    public static void main(String[] args)
    {
        int totalPoints;
        //Declare the input class
        ConsoleIO input = new ConsoleIO();
        //Get the total number of points to be inputted
        System.out.println("Please input the total number of coordinates you will enter: ");
        totalPoints = input.readInt();
        IregularPolygon poly = new IregularPolygon(totalPoints);
        //Loop to find the coordinates and store them in a specially formatted coord class[
        for(int i = 0; i < totalPoints; i++)
        {     
            double x, y;
            System.out.println("Input the x value of the point: ");
            x = input.readDouble();
            System.out.println("Input the y value of the point: ");
            y = input.readDouble();
            Point2D.Double myPoint = new Point2D.Double(x,y);
            poly.add(myPoint);
        }
        //Call the methods to output data
        poly.draw();
        System.out.println("The perimeter is: " + poly.perimeter());
        System.out.println("The area is: " + poly.area());
        
    }
}
