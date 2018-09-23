import apcslib.*;
/**
 * This program will draw the organic compound benzene.
 *
 * @author Max N.
 * @version Aug 29,2017
 */
public class Benzene_Lab2
{
    public static void main(String[] args)
    {
        //Set pen to DrawingTool & set SketchPad to paper
        DrawingTool pen;
        SketchPad paper;
        
        //Instantiate "paper and pen"
        paper = new SketchPad(600, 600);
        pen = new DrawingTool(paper);
        
        //Construct the compound Benzene
        //Create hexagonal shape of the compound
        pen.up();
        pen.move(0, 0);//Lower left point
        pen.down();
        pen.turnRight(180);
        pen.forward(100);//Left point
        pen.turnRight(60);
        pen.forward(100);//Upper left point
        pen.turnRight(60);
        pen.forward(100);//Upper right point
        pen.turnRight(60);
        pen.forward(100);//Right point
        pen.turnRight(60);
        pen.forward(100);//Lower right point
        pen.turnRight(60);
        pen.forward(100);//Connect all points
        
        //Create circular shape within the compound
        pen.up();
        pen.move(0,0);//Center DrawingTool on the origin
        pen.down();
        pen.drawCircle(75);//Create circle with radius=75
    }
}
