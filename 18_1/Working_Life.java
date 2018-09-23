import chn.util.*;
import apcslib.*;
/**
 * Working class for Life. Takes input from a file, loops generations of a 2D array, and prints the output to console.
 *
 * @author Max Nova
 * @version 1/2/2018
 */
public class Working_Life
{
    // Instansiate the instance variables
    private int myGen;
    final int MAX = 21;
    private boolean[][] matrix = new boolean[MAX + 1][MAX + 1];
    private boolean[][] tempMatrix = new boolean[MAX + 1][MAX + 1];
    
    /**
     * Constructor for objects of class Working_Life
     */
    public Working_Life(int gen)
    {
        // Set the num of generations
        myGen = gen;
    }

    /**
     * Takes the file input and loads it into the 2D arrays.
     * 
     * @param FileInput inputFile
     */
    public void loadArray(FileInput inputFile)
    {
        //create the input file array
        int row, col;
        int fileNum;
        
        fileNum = inputFile.readInt();
        //Traversal loop
        for(int i = 0; i < fileNum; i++)
        {
            row = inputFile.readInt();
            col = inputFile.readInt();
            matrix[row][col] = true;
            tempMatrix[row][col] = true;
        }
    }
    
    /**
     * Uses the initial array to determine the values of the array after 5 generations. Outputs false as a space and true as a *.
     */
    public void printLife()
    {
        int lifeCount;
        //Traversal loop
        for(int k = 0; k < myGen; k++)
        {
            for(int row = 1; row < 21; row++)
                {
                    for(int col = 1; col < 21; col++)
                        {  
                            //If wall to determine the 8 surrounding space's values
                            lifeCount = 0;
                            if(tempMatrix[row - 1][col - 1] == true)
                            {
                                lifeCount++;
                            }
                            if(tempMatrix[row - 1][col] == true)
                            {
                                lifeCount++;
                            }
                            if(tempMatrix[row - 1][col + 1] == true)
                            {
                                lifeCount++;
                            }
                            if(tempMatrix[row][col + 1] == true)
                            {
                                lifeCount++;
                            }
                            if(tempMatrix[row + 1][col + 1] == true)
                            {
                                lifeCount++;
                            }
                            if(tempMatrix[row + 1][col] == true)
                            {
                                lifeCount++;
                            }
                            if(tempMatrix[row + 1][col - 1] == true)
                            {
                                lifeCount++;
                            }
                            if(tempMatrix[row][col - 1] == true)
                            {
                                lifeCount++;
                            }
                                 
                            //Determines what state to set the cell to
                            if((tempMatrix[row][col] == false) && (lifeCount == 3))
                            {
                                matrix[row][col] = true;
                            }
                                else if(lifeCount == 1 || lifeCount == 0 || lifeCount >= 4)
                                {
                                    matrix[row][col] = false;
                                }
                                    else if((lifeCount == 2 || lifeCount == 3) && tempMatrix[row][col] == true)
                                    {
                                        matrix[row][col] = true;
                                    } 
                        }
                    }
                    
                    //Copies the changed array to the inital array
                    for(int row = 1; row < 21; row++)
                    {
                        for(int col = 1; col < 21; col++)
                        { 
                            tempMatrix[row][col] = matrix[row][col];
                        } 
                    }
                }
        //print the array
        for(int row = 1; row < 21; row++)
        {
            for(int col = 1; col < 21; col++)
            {
                if(matrix[row][col] == true)
                {
                    System.out.print("*");
                }
                    else
                    {
                        System.out.print(" ");
                    }
            }
            System.out.println();
        }
    }
    
    /**
     * Outputs the number of living cells in the 10th row
     * 
     * @return rowCount
     */
    public int numLivingRow()
    {
        final int row = 10;
        int rowCount = 0;
        //Count the num of cells in row 10
        for(int col = 1; col < 21; col++)
        {
            if(matrix[row][col] == true)
            {
                rowCount++;
            }
        }
        
        return rowCount;
    }
    
    /**
     * Outputs the num of living cells in the 10th col
     * 
     * @return colCount
     */
    public int numLivingColumn()
    {   
        final int col = 10;
        int colCount = 0;
        //Count the num of cells in the col 10
        for(int row = 1; row < 21; row++)
        {
            if(matrix[row][col] == true)
            {
                colCount++;
            }
        }
        
        return colCount;
    }
    
    /**
     * Outputs the num of living cells in total
     * 
     * @return liveCount
     */
    public int numLiving()
    {
        int liveCount = 0;
        //Count to total number of living cells
        for(int row = 1; row < 21; row++)
        {
            for(int col = 1; col < 21; col++)
            {
                if(matrix[row][col] == true)
                {
                    liveCount++;
                }
            }
        }
        
        return liveCount;
    }  
}
