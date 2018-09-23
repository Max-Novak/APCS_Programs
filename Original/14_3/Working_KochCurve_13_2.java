import apcslib.*;
/**
 * Working KochCurve class. Consists of inheritance of SketchPad and the drawKochCurve method.
 *
 * @author Max Nova
 * @version 11/4/2017
 */
public class Working_KochCurve_13_2 extends DrawingTool
{
    /**
     * Constructor for Working KochCurve
     * 
     * @param paper
     */
   public Working_KochCurve_13_2(SketchPad paper)
   {
       super (paper);//Takes the inputed value of paper dimesnsions in the driver class and
                    //sets the default value using inheritance
   }
   
   /**
    * Method for creating Koch snowflake. Uses recursion to create each third of the snowflake.
    * 
    * @param leve, length
    */
   public void drawKochCurve(int level, int length)
   {
       int myLevel = level;//Sets the variables
       int myLength = length;
       
       if(myLevel == 1)//When recursion reaches the lowest value it moves forward myLength
       {
               forward(myLength);
       }
       else
          {
               drawKochCurve(myLevel - 1, (myLength)/3);//Calls itself and  changes var values
               turnLeft(60);//From low to high
               drawKochCurve(myLevel - 1, (myLength)/3);//Calls itself and  changes var values
               turnRight(120);//From peak to low
               drawKochCurve(myLevel - 1, (myLength)/3);//Calls itself and  changes var values
               turnLeft(60);//finish Koch Curve 
               drawKochCurve(myLevel - 1, (myLength)/3);//Calls itself and  changes var values
           }
   }
}
