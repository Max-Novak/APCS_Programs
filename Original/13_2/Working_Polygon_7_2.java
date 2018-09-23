import apcslib.*;
/**
 * Polygon Worker that calculates the # of sides, side length, degrees, inscribed radius,
 * circumscribed radius, perimeter, and area.
 * This class includes the instance variables, constructor, methods, and comments.
 *
 * @author Max N
 * @version 9/24/2017
 */

public class Working_Polygon_7_2
{
    protected int myNumSides; //# of sides
    protected double mySideLength; //length of side
    protected double myR; //radius of circumscribed
    protected double myr; //radius of inscribed

    /**
     * Default constructor for the Polygon lab. Initializes the number of sides, side length, circumscribed radius, and inscribed radius.
     * 
     */
    public Working_Polygon_7_2()
    {
        // initialise instance variables to create triangle
        myNumSides = 3;
        mySideLength = 100;
        calcR();
        calcr();
    }
    
    /**
     * Constructor for the Polygon lab. Initializes the number of sides, side length, circumscribed radius, and inscribed radius.
     * This time takes the inputted values from the driver to create the variables.
     * 
     * @param numSides, sideLength
     */
    public Working_Polygon_7_2(int numSides, double sideLength)
    {
        // initialise instance variables with input
        myNumSides = numSides;
        mySideLength = sideLength;
        calcR();
        calcr();
    }
    
    //Private methods
    /**
     * <b>summary</b>: Calculates the inscribed radius of the polygon.
     * Private void because it is stored into the instance variable.
     * 
     */
    private void calcr()
    {
        // Calculate the radius of inscribed
        double r, cot;
        cot = 1.0 / Math.tan(Math.PI / myNumSides);//How do dis
        myr  = .5 * mySideLength * cot;
    }
    
    /**
     * <b>summary</b>: Calculates the circumscribed radius of the polygon.
     * Private void because it is stored into the instance variable.
     */
    private void calcR()
    {
        // Calculate the radius of circumscribed
        double R, csc;
        csc = 1.0 / Math.sin(Math.PI / myNumSides);
        myR = .5 * mySideLength * csc;
    }
    
    //Public methods
    /**
     * <b>summary</b>: Calculates the vertex angle of the polygon.
     * @return vertexAngle: the angle in degrees
     */
    public double vertexAngle()
    {
        // Calculate vertex angle
        double vertexAngle;
        vertexAngle = ((double)(myNumSides - 2) / myNumSides) * 180;
        return vertexAngle;
    }
    
    /**
     * <b>summary</b>: Calculates the perimeter of the polygon.
     * @return perimeter: the perimeter of the polygon.
     */
    public double Perimeter()
    {
        // Calculate perimeter
        double perimeter;
        perimeter = myNumSides * mySideLength;
        return perimeter;
    }
    
    /**
     * <b>summary</b>: Calculates the area of the polygon.
     * @return area: the area of the polygon.
     */
    public double Area()
    {
        // Calculate the area
        double area, R, csc;
        csc = 1.0 / Math.sin(Math.PI / myNumSides);
        R = .5 * mySideLength * csc;
        area = .5 * myNumSides * (Math.pow(R, 2)) * Math.sin((2 * Math.PI) / myNumSides);
        return area;
    }
    
    /**
     * <b>summary</b>: provides a method for obtaining the number of sides of the polygon by returning the instance variable myNumSides.
     * @return myNumSides: total number of sides.
     */
    public int getNumside()
    {
        // Get the number of sides 
        return myNumSides;
    }
    
    /**
     * <b>summary</b>: provides a method for obtaining the side lengths of the polygon by returning the instance variable mySideLength.
     * @return mySideLength: side length.
     */
    public double getSideLength()
    {
        // Get the side length
        return mySideLength;
    }
    
    /**
     * <b>summary</b>: provides a method for obtaining the circumscribed radius of the polygon by returning the instance variable myR.
     * @return myR: circumscribed radius.
     */
    public double getR()
    {
        // Get the circum
        return myR;
    }
    
    /**
     * <b>summary</b>: provides a method for obtaining the inscribed radius of the polygon by returning the instance variable myr.
     * @return myr: inscribed radius.
     */
    public double getr()
    {
        // Get the inscribed
        return myr;
    }
}