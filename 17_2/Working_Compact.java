/**
 * Working Class for Compact. Contains 1 constructor and 2
 * methods. printArray returns the values in the array in console
 * while the compactArray returns the array without zeros.
 *
 * @author Max Nova
 * @version 12/3/2017
 */
public class Working_Compact
{
    //Length of array
    private int myLength;
    
   /**
   * Constructor for Compact. Sets the arrayLength to myLength
   *
   **/
    public Working_Compact(int arrayLength)
    {
        myLength = arrayLength;
    }
    
    /**
    * Outputs the array without any changes.
    *
    * @param int[] matrix
    * @return output
    **/
    public String printArray(int[] matrix)
    {
	   //Create empty string
        String output = "";
        int increment = 0;
        for(int col = 0; col < myLength; col++)
        {
            if(col < myLength-1)
            {
			//Concats each member of the array into a string
                output = output + matrix[increment] + ", ";
                increment++;
            }
            else
                {
                    output = output + matrix[increment];
                }
        }
        //Output the complete array
        return output;
    }
    
    /**
    * Deletes the zeros within the array. Outputs the array in    
    * console.
    *
    * @param int[] matrix
    * @return output
    **/
    public String compactArray(int[] matrix)
    {
	   //Creats empty string
        String output = "";
        int increment = 0, zeroOffset = 1, flag = 0, sum = 0, endFlag;
        
        for(int col = 0; col < myLength; col++)
        {
		 //The flags check how many times 0 must be found
            endFlag = 0;
            if(col < myLength-1)
            {
                int temp;
                temp = matrix[increment];
                if(temp == 0)
			//Shifts the array index 2 goes to 1
                {
                    for(int i = 0; i < myLength-1; i++)
                    {
                        matrix[i] = matrix[i + 1];
                    }
                }
                
                do
                {
                    if(matrix[increment] == 0)
                    {
                        for(int i = 0; i < myLength-1; i++)
                        {
                            matrix[i] = matrix[i + 1];
                        }
                        sum = 0;
			 	   //If all the cells after the value sum 					   //to 0 then stop
                        for(int j = increment; j < myLength; j++)
                        {
                            int counter;
                            counter = increment;
                            sum = sum + matrix[counter];
                            counter++;
                        }
                        //If zero is found and the sum of all = 0
                        if(matrix[increment] == 0 && sum == 0)
                        {
                            flag = 1;
                        }
                        else
                            {
                                flag = 0;
                            }
                    }
                }
                while(flag == 1) ;
            }
		 //Ouput string
            output = output + matrix[increment] + ", ";  
            increment++;
            zeroOffset++;
            for(int k = increment; k < myLength; k++)
            {
                endFlag = endFlag + matrix[k];
            }
            if(endFlag == 0)
             {
                 col = myLength;
             }
            }
        return output;
        }
    }
