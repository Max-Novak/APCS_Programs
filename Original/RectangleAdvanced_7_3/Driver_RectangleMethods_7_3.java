import chn.util.*;
import apcslib.*;
/**
 * Rectangle Driver that outputs the x point, y point, height, width, perimeter, and area.
 * This class includes the object instantiation and outputs of the methods they were
 * created as.
 *
 * @author Max N
 * @version 9/24/2017
 */
public class Driver_RectangleMethods_7_3
{
   public static void main (String[] args)
   {       
       //Construct rectA
       Working_RectangleMethods_7_3 rectA = new Working_RectangleMethods_7_3(0, 0, 200, 50);
       //Construct rectB
       Working_RectangleMethods_7_3 rectB = new Working_RectangleMethods_7_3(rectA);
       
       //Declare the constants that will increment every revolution
       final double turnInc = 30;
       final double widthDec = 10;

       //Create Copies
       rectA.draw();
       rectA.setDirection(rectA.getDirection() - turnInc);
       rectA.setWidth(rectA.getWidth() - widthDec);
       rectA.draw();
       rectA.setDirection(rectA.getDirection() - turnInc);
       rectA.setWidth(rectA.getWidth() - widthDec);
       rectA.draw();
       rectA.setDirection(rectA.getDirection() - turnInc);
       rectA.setWidth(rectA.getWidth() - widthDec);
       rectA.draw();
       rectA.setDirection(rectA.getDirection() - turnInc);
       rectA.setWidth(rectA.getWidth() - widthDec);
       rectA.draw();
       rectA.setDirection(rectA.getDirection() - turnInc);
       rectA.setWidth(rectA.getWidth() - widthDec);
       rectA.draw();
       rectA.setDirection(rectA.getDirection() - turnInc);
       rectA.setWidth(rectA.getWidth() - widthDec);
       rectA.draw();
       rectA.setDirection(rectA.getDirection() - turnInc);
       rectA.setWidth(rectA.getWidth() - widthDec);
       rectA.draw();
       rectA.setDirection(rectA.getDirection() - turnInc);
       rectA.setWidth(rectA.getWidth() - widthDec);
       rectA.draw();
       rectA.setDirection(rectA.getDirection() - turnInc);
       rectA.setWidth(rectA.getWidth() - widthDec);
       rectA.draw();
       rectA.setDirection(rectA.getDirection() - turnInc);
       rectA.setWidth(rectA.getWidth() - widthDec);
       rectA.draw();
       
       //Create rectB
       rectB.setXPos(-230);
       rectB.setYPos(120);
       rectB.draw();
       
       //Create strings for Width, area, height, and perimeter
       rectB.drawString("Width = " + rectB.getWidth(), -220, 180);
       rectB.drawString("Area = " + rectB.getArea(), -220, 140);
       rectB.drawString("Perimeter = " + rectB.getPerimeter(), -220, 100);
       rectB.drawString("Height = " + rectB.getHeight(), -10, 140);
       
      
       
       
       
   }
}