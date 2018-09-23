import apcslib.*;
/**
 * Extended child class for the super Polygon class. This class includes additional constructors and a new method.
 *
 * @author Max N
 * @version 11/1/2017
 */
class GraphicPolygon extends Working_Polygon_7_2
{
        private DrawingTool pen = new DrawingTool(new SketchPad(400, 400));
        private double xPosition, yPosition;
        // constructors
        // Initializes a polygon of numSides sides and sideLength // length in the superclass. The polygon is centered at // xPosition = yPosition = 0
        
        /**
         * Default constructor for the Graphic Polygon. Inherits values from the parent.
         * 
         * @param numSide, sideLength
         */
        public GraphicPolygon(int numSides, double sideLength)
        {
            super(numSides, sideLength);
            
            xPosition = 0;//Default values for position
            xPosition = 0;
        }
        // Initializes a polygon of numSides sides and sideLength
        // length in the superclass. The polygon is centered at
        // xPosition = x and yPosition = y
        
        /**
         * Input constructor for the Graphic Polygon. Takes 4 parametersm, 2 of which are created in this class and 2 from inheritance.
         * 
         * @param numSides, sideLength, x, y
         */
        public GraphicPolygon(int numSides, double sideLength, double x, double y) 
        {
            super(numSides, sideLength);
            
            xPosition = x;//Inputted values for each position
            yPosition = y;
        }
        
        // public methods,
        // Sets xPosition = x and yPosition = y to correspond to the new // center of the polygon
        /**
         * Move to method for the Graphic Polygon. Sets the origin of the figures.
         * 
         * @param x, y
         */
        public void moveTo(double x, double y)
        {
            xPosition = x;//Method to set the origin
            yPosition = y;
        }
        // Draws the polygon about the center point (xPosition, yPosition).
        // Uses properties inherited from RegularPolygon to determine the
        // number and length of the sides, the radius of the inscribed circle, // and the vertex angle with which to draw the polygon
        /**
         * The draw method for the figures. Uses a simple algorithm by drawing each side one by one.
         * 
         */
        public void draw()
        {
            pen.up();
            moveTo(xPosition, yPosition);//Go to origin
            pen.down();
            pen.up();
            pen.move(mySideLength / 2, myR);//Go to an edge of the shape
            pen.down();
            for(int i = 0; i < myNumSides; i++)//Create each side 1 by 1
            {
                pen.forward(mySideLength);//Move the side length worth 
                pen.turnRight(180 - vertexAngle());//Turn the amount needed for each side
            }
            //Draws the polygon 
            //onto the Sketchpad window using the movement and drawing methods available in the DrawingTool class.
        }
}