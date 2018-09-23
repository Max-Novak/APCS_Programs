import java.awt.geom.*;
import java.util.*;
import apcslib.*;
import chn.util.*; 

class IregularPolygon
{
    //Create the array list
    ArrayList myPolygon = new ArrayList();
    int totalPoints;
    /**
     * Constructor for the Ireg polygon working class
     * 
     * @param points
     */
    
    public IregularPolygon(int points) 
    {
        //Total number of coordinates
        totalPoints = points;
    }
    
    /**
     * Adds elements to the array list in squential order. The user must input values in a circular fashion.
     * 
     * @param Point2D.Double myPoint
     */
    public void add(Point2D.Double myPoint) 
    {
        //Add elements to the array
        myPolygon.add(myPoint);
    }
    
    /**
     * Draws the ireg polygon on a 2D plane. The SketchPad used is 500*500 pixels.
     */
    public void draw() 
    { 
        SketchPad paper = new SketchPad(500, 500);
        DrawingTool pen = new DrawingTool(paper);
        //Instan the Sketch and Drawing Tool objects
        pen.up();
        double x, y;
        
        for(int i = 0; i < totalPoints; i++)
        {
            //Loop through each point
            x = ((Point2D.Double)myPolygon.get(i)).getX();
            y = ((Point2D.Double)myPolygon.get(i)).getY();
            pen.move(x, y);
            pen.down();
        }
        //Plot the final line
        x = ((Point2D.Double)myPolygon.get(0)).getX();
        y = ((Point2D.Double)myPolygon.get(0)).getY();
        pen.move(x, y);
        pen.up();
    }
    
    /**
     * Calculates the perimeter of the ireg polygon. Format is to the tenths place.
     * 
     * @return Format.left(perimeter, 0, 1)
     */
    public String perimeter() 
    { 
        //compute the distance to each point. Add them together.
        double perimeter = 0;
        Point2D.Double ptA, ptB;
        int countX, countY;
        
        for(int i = 0; i < totalPoints-1; i++)
        {
            //Loop through each point
            ptA = ((Point2D.Double)myPolygon.get(i));
            ptB = ((Point2D.Double)myPolygon.get(i+1));
            perimeter += ptA.distance(ptB);
        }
        //Loop through the final point connecting the last and the first
        ptA = ((Point2D.Double)myPolygon.get(totalPoints - 1));
        ptB = ((Point2D.Double)myPolygon.get(0));
        perimeter += ptA.distance(ptB);
        //Format to the 1st decimal place
        return Format.left(perimeter, 0, 1);
    }
    
    /**
     * Calculates the area of the ireg polygon. Uses the Math.abs class to always return positive.
     * 
     * @return (int)Math.abs(.5 * area)
     */
    public double area() 
    { 
        //Define the points
        double area = 0;
        double x1;
        double y1;
        double x2;
        double y2;
        double xList, yList;
        //Take the inital value
        xList = ((Point2D.Double)myPolygon.get(totalPoints-1)).getX() * ((Point2D.Double)myPolygon.get(0)).getY();
        yList = ((Point2D.Double)myPolygon.get(0)).getX() * ((Point2D.Double)myPolygon.get(totalPoints-1)).getY();
        
        area = xList - yList;
        
        for(int i = 0; i < totalPoints-1; i++)
        {
            Point2D.Double ptOne = (Point2D.Double)myPolygon.get(i);
            Point2D.Double ptTwo = (Point2D.Double)myPolygon.get(i+1);
            //Take the point from each index
            x1 = ptOne.getX();
            y1 = ptOne.getY();
            x2 = ptTwo.getX();
            y2 = ptTwo.getY();
            //Continue adding to the area
            area += ((x1 * y2) - (y1 * x2));
        }
        return (int)Math.abs(.5 * area);
    } 
}
