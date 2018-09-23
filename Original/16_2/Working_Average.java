import chn.util.*;
import apcslib.*;
/**
 * Working_Average class that contains a calcAverage method to return the average of a file input.
 *
 * @author Max Nova
 * @version Nov 30
 */
public class Working_Average
{
    //Declare the instance var
    private FileInput myInput;
    
    /**
     * Constructor for the Working_Average class. Takes the FileInput stream and sets the reference variable to a private one within the class.
     */
    public Working_Average(FileInput inputFile)
    {
        myInput = inputFile;
    }

    /**
     * Calculates the average of all ints and returns the value.
     * 
     * @param FileInput inputFile
     * @return average
     */
    public static double calcAverage(FileInput inputFile)
    {
            //declaration of values
            long totalNum = 0;
            int count = 0;
	        double average;
            //Sums all ints within the file and finds the total number of ints within
            while(inputFile.hasMoreTokens())
            {
                count += inputFile.readInt();
                totalNum++;
            }
            //Calculates the average by taking the sum and dividing by the number of ints
            average = (double)count/totalNum;
            return average;
    }
}