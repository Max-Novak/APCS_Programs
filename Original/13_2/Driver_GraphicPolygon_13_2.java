import chn.util.*;
/**
 * The Driver class for Graphic Polygon
 *
 * @author Max Nova
 * @version 11/1/2017
 */
public class Driver_GraphicPolygon_13_2
{
    public static void main(String[] args)
    {
        int readInteger;
        
        ConsoleIO input = new ConsoleIO();//enable user input
        
        GraphicPolygon gPoly = new GraphicPolygon(4, 150);       
        GraphicPolygon gPoly1 = new GraphicPolygon(8, 100);
        GraphicPolygon gPoly2 = new GraphicPolygon(19, 50);
        GraphicPolygon gPoly3 = new GraphicPolygon(91, 10);
        
        //Begin drawing each shape and prompting the user between each one
        gPoly.draw();
        System.out.println("Continue? Type an int to continue: ");
        readInteger = input.readInt();
        gPoly1.draw();
        System.out.println("Continue? Type an int to continue: ");
        readInteger = input.readInt();
        gPoly2.draw();
        System.out.println("Continue? Type an int to continue: ");
        readInteger = input.readInt();
        gPoly3.draw();
    }
}