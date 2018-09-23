import apcslib.*;
/**
 * Lab 1.1
 * This program will draw a house.
 * @author Max N
 * @version Aug 28th 2017
 */
public class DrawHouse_Lab1
{
    public static void main(String[] args)
    {
        //Set pen to DrawingTool & set SketchPad to paper
        DrawingTool pen;
        SketchPad paper;
        
        //Instantiate "paper and pen"
        paper = new SketchPad(500, 500);
        pen = new DrawingTool(paper);
        
       //Construct House
        pen.up();
        pen.move(-200, -100);
        pen.down();
        pen.move(200, -100);
        pen.move(200, 100);
        pen.move(-200,100);
        pen.move(-200, -100);
        pen.up();
        pen.move(-200, 100);
        pen.down();
        pen.move(0, 200);
        pen.move(200, 100);
        pen.up();
        pen.move(-50, -100);
        pen.down();
        pen.move(-50, 10);
        pen.move(50, 10);
        pen.move(50, -100);
        pen.up();
        pen.move(-150, 20);
        pen.down();
        pen.move(-150, 60);
        pen.move(-100, 60);
        pen.move(-100, 20);
        pen.move(-150, 20);
        pen.up();
        pen.move(150, 20);
        pen.down();
        pen.move(150, 60);
        pen.move(100, 60);
        pen.move(100, 20);
        pen.move(150, 20);
        
    }
}