import apcslib.*;
/**
 * Polygon Driver that outputs the # of sides, side length, degrees, inscribed radius,
 * circumscribed radius, perimeter, and area.
 * This class includes the object instantiation and outputs of the methods they were
 * created as.
 *
 * @author Max N
 * @version 9/24/2017
 */ 

public class Driver_Polygon_7_2
{
    public static void main(String[] args)
    {
        Working_Polygon_7_2 polyDefault = new Working_Polygon_7_2();
        Working_Polygon_7_2 polySquare = new Working_Polygon_7_2(4, 10.0);
        Working_Polygon_7_2 polyOctagon = new Working_Polygon_7_2(8, 5.75);
        Working_Polygon_7_2 polyEnneadecagon = new Working_Polygon_7_2(19, 2.0);
        Working_Polygon_7_2 polyEnneacontakaihenagon = new Working_Polygon_7_2(91, 0.5);
        
        System.out.println("The values below correspond to the default constructor!");
        System.out.println("Number of sides: " + polyDefault.getNumside());
        System.out.println("Length of sides: " + Format.left(polyDefault.getSideLength(), 2, 2));
        System.out.println("Angle in degrees: " + Format.left(polyDefault.vertexAngle(), 2, 2));
        System.out.println("Inscribed radius: " + Format.left(polyDefault.getr(), 2, 2));
        System.out.println("Circumscribed radius: " + Format.left(polyDefault.getR(), 2, 2));
        System.out.println("Perimeter is: " + Format.left(polyDefault.Perimeter(), 2, 2));
        System.out.println("Area is: " + Format.left(polyDefault.Area(), 2, 2));
        System.out.println();
        
        System.out.println("The values below correspond to the square!");
        System.out.println("Number of sides: " + polySquare.getNumside());
        System.out.println("Length of sides: " + Format.left(polySquare.getSideLength(), 2, 2));
        System.out.println("Angle in degrees: " + Format.left(polySquare.vertexAngle(), 2, 2));
        System.out.println("Inscribed radius: " + Format.left(polySquare.getr(), 2, 2));
        System.out.println("Circumscribed radius: " + Format.left(polySquare.getR(), 2, 2));
        System.out.println("Perimeter is: " + Format.left(polySquare.Perimeter(), 2, 2));
        System.out.println("Area is: " + Format.left(polySquare.Area(), 2, 2));
        System.out.println();
        
        System.out.println("The values below correspond to the octagon!");
        System.out.println("Number of sides: " + polyOctagon.getNumside());
        System.out.println("Length of sides: " + Format.left(polyOctagon.getSideLength(), 2, 2));
        System.out.println("Angle in degrees: " + Format.left(polyOctagon.vertexAngle(), 2, 2));
        System.out.println("Inscribed radius: " + Format.left(polyOctagon.getr(), 2, 2));
        System.out.println("Circumscribed radius: " + Format.left(polyOctagon.getR(), 2, 2));
        System.out.println("Perimeter is: " + Format.left(polyOctagon.Perimeter(), 2, 2));
        System.out.println("Area is: " + Format.left(polyOctagon.Area(), 2, 2));
        System.out.println();
        
        System.out.println("The values below correspond to the enneadecagon!");
        System.out.println("Number of sides: " + polyEnneadecagon.getNumside());
        System.out.println("Length of sides: " + Format.left(polyEnneadecagon.getSideLength(), 2, 2));
        System.out.println("Angle in degrees: " + Format.left(polyEnneadecagon.vertexAngle(), 2, 2));
        System.out.println("Inscribed radius: " + Format.left(polyEnneadecagon.getr(), 2, 2));
        System.out.println("Circumscribed radius: " + Format.left(polyEnneadecagon.getR(), 2, 2));
        System.out.println("Perimeter is: " + Format.left(polyEnneadecagon.Perimeter(), 2, 2));
        System.out.println("Area is: " + Format.left(polyEnneadecagon.Area(), 2, 2));
        System.out.println();
        
        System.out.println("The values below correspond to the enneacontakaihenagon!");
        System.out.println("Number of sides: " + polyEnneacontakaihenagon.getNumside());
        System.out.println("Length of sides: " + Format.left(polyEnneacontakaihenagon.getSideLength(), 2, 2));
        System.out.println("Angle in degrees: " + Format.left(polyEnneacontakaihenagon.vertexAngle(), 2, 2));
        System.out.println("Inscribed radius: " + Format.left(polyEnneacontakaihenagon.getr(), 2, 2));
        System.out.println("Circumscribed radius: " + Format.left(polyEnneacontakaihenagon.getR(), 2, 2));
        System.out.println("Perimeter is: " + Format.left(polyEnneacontakaihenagon.Perimeter(), 2, 2));
        System.out.println("Area is: " + Format.left(polyEnneacontakaihenagon.Area(), 2, 2));
    }
}