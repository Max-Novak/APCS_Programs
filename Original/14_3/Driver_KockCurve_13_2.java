import apcslib.*;
/**
 * The driving class for KockCurve. Tests the working class for functionality.
 *
 * @author Max Nova
 * @version 11/3/2017
 */
public class Driver_KockCurve_13_2
{
    /**
     * Main class for KochCurve.
     */
    public static void main(String[] args)
    {
        SketchPad paper = new SketchPad(500, 500);
        Working_KochCurve_13_2 curvyPen = new Working_KochCurve_13_2(paper);//Instantsiate the other classes
        
        curvyPen.up();
        curvyPen.move(-130, -50); //Sets the inital starting point
        curvyPen.down();
        curvyPen.setDirection(60);//Oritentats from 0 to 60 to set starting angle
        
        curvyPen.drawKochCurve(6,300); //Draws 1/3 of the KockCurve - LEFT SIDE
        curvyPen.turnRight(120);//Sets inital switch to change oritentation
        curvyPen.drawKochCurve(6,300); //Draws 1/3 of the KockCurve - RIGHT SIDE
        curvyPen.turnRight(120);//Sets inital switch to change oritentation
        curvyPen.drawKochCurve(6,300); //Draws 1/3 of the KockCurve - BOTTOM LEFT
        curvyPen.turnRight(120);//Sets inital switch to change oritentation
    }
}
