import chn.util.*;
import apcslib.*;
/**
 * Drive class for Compact. Creates the input array and fills it 
 * with values from the text file.
 *
 * @author Max Nova
 * @version 12/3/2017
 */
public class Compact
{
    public static void main(String[] args)
    {
   	   //Create fileInput mechansim
        FileInput inputFile = new FileInput ("compact.txt");
        int arrayLength = 0;
	   //Array size provided
        int[] matrix = new int[101];
        for (int col = 0; col < 101; col++)
        {
		 //Fill array with file input
            if(inputFile.hasMoreTokens())
            {
                matrix[arrayLength] = inputFile.readInt();
                arrayLength++;
            }
        }
        
        Working_Compact compact = new Working_Compact(arrayLength);
        //Print out the initial matrix
        System.out.println("Before: " + compact.printArray(matrix));
        //Print out the compact matrix
        System.out.println("After: " + compact.compactArray(matrix));
    }
}