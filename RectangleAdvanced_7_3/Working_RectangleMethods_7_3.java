import apcslib.*;
import chn.util.*;
/**
 * Rectangle Worker that calculates the x point, y point, height, width, perimeter, and area.
 * The class includes 1 default constructor, 1 input taker, and a copier of the input taker.
 * This class includes the instance variables, constructor, methods, and comments.
 *
 * @author Max N
 * @version 9/26/2017
 */
public class Working_RectangleMethods_7_3
{
    private double myX; //The x coordinate of the rectangle
    private double myY; //The y coordinate of the rectangle
    private double myWidth; //The width of the rectangle
    private double myHeight; //The height of the rectangle
    private double myDirection; //Orientation of the pen
    //Create the drawing tool
    private static DrawingTool pen = new DrawingTool (new SketchPad (500, 500));
    
    //Constructor with default value
    /**
     * Default constructor for the Rectangle lab. Initializes the x value, y value, width, and height to 0.
     * 
     */
    public Working_RectangleMethods_7_3()
    {
        myX = 0;
        myY = 0;
        myWidth = 0;
        myHeight = 0;
        myDirection = 0;
    }
    
    //Constructor with set values
    /**
     * Constructor for the Rectangle lab. Initializes the x value, y value, width, and height from the driver to the private variables.
     * This time takes the inputted values from the driver to create the variables.
     */
    public Working_RectangleMethods_7_3(double x,  double y, double width, double height)
    {
        myX = x;
        myY = y;
        myWidth = width;
        myHeight = height;
        myDirection = 0;
    }
    
    //Copy the other rectangle constructor
    /**
     * Constructor emulator for the Rectangle lab. Initializes the x value, y value, width, and height from the driver to the private variables.
     * This time takes the inputted values from the driver to create the variables.
     * Data is copied from the first constructor into the second.
     */
    public Working_RectangleMethods_7_3(Working_RectangleMethods_7_3 copy)
    {
        myX = copy.myX;
        myY = copy.myY;
        myWidth = copy.myWidth;
        myHeight = copy.myHeight;
        myDirection = 0;
    }
    
    //Calc Perimeter
    /**
     * <b>summary</b>: Calculates the perimeter of the rectangle.
     * Returns a double.
     * 
     */
    public double getPerimeter()
    {
        return ((2 * myWidth) + (2 * myHeight));//calc the peri
    }
    
    //Calc Area
    /**
     * <b>summary</b>: Calculates the area of the rectangle.
     * Returns a double.
     * 
     */
    public double getArea()
    {
        return (myWidth * myHeight);//Calc the area
    }
    
    //Draw the rectangle
    /**
     * <b>summary</b>: Draws the rectangles 4 sides.
     * Calculations based off the vertex point.
     * 
     */
    public void draw()
    {
        
        pen.up();//Make the rectangles
        pen.move(myX, myY);
        pen.down();
        pen.setDirection(myDirection);
        pen.forward(myWidth);
        pen.turnLeft(90);
        pen.forward(myHeight);
        pen.turn(90);
        pen.forward(myWidth);
        pen.turn(90);
        pen.forward(myHeight);
    }
    
    //Set x coordinate of the rectangle
    /**
     * <b>summary</b>: Set the x input from the object creation to the private variable inside the class.
     * No calculation.
     * 
     */
    public void setXPos(double x)
    {
        myX = x;
    }
    
    //Set the y coordinate of this Rectangle
    /**
     * <b>summary</b>: Set the y input from the object creation to the private variable inside the class.
     * No calculation.
     * 
     */
    public void setYPos(double y)
    {
        myY = y;
    }
    
    // Set the width of the rectangle
    /**
     * <b>summary</b>: Set the width input from the object creation to the private variable inside the class.
     * No calculation.
     * 
     */
    public void setWidth(double width)
    {
        myWidth = width;
    }
    
    //Set the height of the rectangle
    /**
     * <b>summary</b>: Set the height input from the object creation to the private variable inside the class.
     * No calculation.
     * 
     */
    public void setHeight(double height)
    {
        myHeight = height;
    }
    
    //Set the DrawingTool direction
    /**
     * <b>summary</b>: Set pen direction for the DrawingTool.
     * No calculation.
     * 
     */
    public void setDirection(double direction)
    {
        //0 = horizontal to the right
        myDirection = direction;
        pen.setDirection(myDirection);
    }
    
    //Return the x coordinate of the rectangle
    /**
     * <b>summary</b>: Return the x position.
     * No calculation.
     * 
     */
    public double getXPos()
    {
        return myX;
    }
    
    //Return the y coordinate of the rectangle
    /**
     * <b>summary</b>: Return the y position.
     * No calculation.
     * 
     */
    public double getYPos()
    {
        return myY;
    }
    
    //Return the width of the rectangle
    /**
     * <b>summary</b>: Return the width.
     * No calculation.
     * 
     */
    public double getWidth()
    {
        return myWidth;
    }
    
    //Return the height of the rectangle
    /**
     * <b>summary</b>: Return the height.
     * No calculation.
     * 
     */
    public double getHeight()
    {
        return myHeight;
    }
    
    //Return the the direction of the DrawingTool
    /**
     * <b>summary</b>: Return the DrawingTool orientation.
     * No calculation.
     * 
     */
    public double getDirection()
    {
        //0 = horizontal to the right
        return myDirection;
    }
    
    //Draw a string at the specified x and y coords
    /**
     * <b>summary</b>: Create the strings on the image. Includes perimeter, area, height, and width.
     * No calculation.
     * 
     */
    public void drawString(String str, double x, double y)
    {
        pen.up();
        pen.move(x, y);
        pen.drawString(str);
    }
    
    
}