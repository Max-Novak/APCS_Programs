import chn.util.*;
import apcslib.*;
/**
 * Class that takes input from a file titled "input.txt" and outputs the number of preceding spaces for each line. It then trims the preceding spaces and outputs a formatted file titled "output.txt."
 *
 * @author Max Nova
 * @version 11/27/2017
 */
public class Squeeze
{
    /**
     * Constructor filter for main. Takes input and outputs the augmented text.
     */
    public Squeeze (FileInput inputFile, FileOutput outputFile)
    {
            //Declarations
            String line, augmentedLine;
            int stringLength, intSpace, totalSpaces = 0;
            char space;
            //Loop for each line of the file
            while (inputFile.hasMoreLines())
            {
                line = inputFile.readLine();
                stringLength = line.length();
                //Loop to find spaces within each line
                for(int charIndex = 0; charIndex < stringLength; charIndex++)
                    {    
                        space = line.charAt(charIndex);
                        intSpace = space;
                        //If the loop finds a character which is not a space it discontinues
                        if(intSpace != 32)
                            {
                                totalSpaces = charIndex;
                                //Ends loop
                                charIndex = stringLength + 1;
                            }
                    }
                //Trims the spaces off the front and back of the text
                augmentedLine = line.trim();
                //Filter for empty lines
                if(stringLength >= 1)
                    {
                        outputFile.println(Format.right(totalSpaces, 2) + "  " + augmentedLine);
                    }
                else
                    {
                        outputFile.println(Format.right(0, 2));
                    }
            }
            //Close connection with the output file
            outputFile.close();
    }
        
    /**
     * Instantiates the inputFile object and outputFile object. Then instantiates the connection between the two finals "data streams."
     */
    public static void main(String[] args)
    {
        //Declare reference variables
        FileInput inputFile;
        FileOutput outputFile;
        //Instantiate text objects
        String inputFileName = new String("input.txt");
        String outputFileName = new String("output.txt");
        //Instantiate data stream 
        inputFile = new FileInput(inputFileName);
        outputFile = new FileOutput(outputFileName);
        //Instantiate Squeeze object which links the two files
        Squeeze trimSpaces = new Squeeze(inputFile, outputFile);
    }
}
