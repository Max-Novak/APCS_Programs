import java.util.Random;

/**
 * Program that roles 3, 6 sided dice and once each dice value is different the program stops.
 *
 * @author Max Nova
 * @version 11/7/2017
 */
public class test_class
{
    /**
     * 3, 6 sided die are rolled until the value of each die is different from one another.
     * Once complete the program stops and outputs the number of roles required for the outcome.
     */
    public static void main(String[] args)
    {
        Random myDie = new Random();
        int loopCount = 0, noneSameFlag = 0, rollOne, rollTwo, rollThree;
        
        do
        {
            rollOne = myDie.nextInt(6) + 1;//roll die 1
            rollTwo = myDie.nextInt(6) + 1;//roll die 2
            rollThree = myDie.nextInt(6) + 1;//roll die 3
            System.out.println(rollOne + "  " + rollTwo + "  " + rollThree);//output the outcome
            loopCount++;//increment counter
        }
        while((rollOne == rollTwo) || (rollTwo == rollThree) || (rollThree == rollOne));
        //3 six sided dice thrown until vales are all different
        //Below is the conditional that I want the program to reach. I negated it to get the conditional above.
        //while((rollOne != rollTwo) && (rollTwo != rollThree) && (rollThree != rollOne));
        {
            System.out.println("count = " + loopCount);//output final count
         }
     }
}
