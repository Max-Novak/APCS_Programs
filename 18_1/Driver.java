import chn.util.*;
import apcslib.*;
/**
 * Driving class for Life. Sets up the file input and instantiates the FileInput class.
 *
 * @author Max Nova
 * @version 1/2/2018
 */
public class Driver
{
    public static void main(String[] args)
    {
        FileInput inputFile;
        int gen = 5;
        //Set up the file input
        String inputFileName = new String ("life.txt");
        inputFile = new FileInput(inputFileName);
        //Instansiate the working class
        Working_Life life = new Working_Life(gen);
        //Load the array
        life.loadArray(inputFile);
        life.printLife();
        System.out.println();
        //print the strings of data
        System.out.println("Number in Row 10 ---> " + life.numLivingRow());
        
        System.out.println("Number in Column 10 --> " + life.numLivingColumn());
        
        System.out.println("Number of living organisms ---> " + life.numLiving());
    }
}
