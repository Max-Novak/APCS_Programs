import chn.util.*;
import apcslib.*;
/**
 * Client for the Working_Average class. Instantiates the inputFile object and creates the data stream. Creates an instance of the working class and uses the calcAverge method to print the averaget to the console window.
 *
 * @author Max Nova
 * @version Nov 30
 */
public class Average
{
    public static void main(String[] args)
    {
        //Declare variables
        FileInput inputFile;
        double average;
        //Instantiate text objects
        String inputFileName = new String ("numbers.txt");
        //Instantiate data stream
        inputFile = new FileInput(inputFileName);
        //Instantiate Average object
        Working_Average calcAverage = new Working_Average (inputFile);
        //Output the average to the console window
        System.out.println(Format.right(Working_Average.calcAverage(inputFile), 2, 2));
    }
}
