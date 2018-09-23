import java.util.Random;
import apcslib.*;
/**
 * Working class for Knight's Tour. Contains a print method for the chess table and squares visited.
 *
 * @author Max Nova
 * @version 1/9/2018
 */
public class Knights_Tour
{
    final int size = 8;
    private int location = 1;
    //Instansiate the storage arrays
    private int[][] chessboardCount = new int[size][size];
    private boolean[][] chessboardTest = new boolean[size][size];
    //Random class
    private Random rand = new Random();
    
    /**
     * Prints the board state for Knight's Tour. Each incrementing value is the order the horse took to travel.
     */
    public void printBoard()
    {
        int row = 0, col = 0, pos, flag = 0, tempPos;
        //Set the array values for horz and vert
        int[] horz = {1,2,2,1,-1,-2,-2,-1};
        int[] vert = {-2,-1,1,2,2,1,-1,-2};
        int[] randNum = {0,1,2,3,4,5,6,7,8};
        //Set the default inital value
        chessboardTest[0][0] = true;
        chessboardCount[0][0] = 1;
        
        //Loops for a maximum of 64 times, 64 is the max size of the board
        for(int i = 0; i < 64; i++)
        {
            pos = rand.nextInt(8) + 1;
            if(randNum[pos] == pos)
            {
                //Remove the digit from the random numbers
                randNum[pos] = 99;
                
                //If not false, same pos, and inside the board
                if((pos == 1 && (col + horz[0] >= 0 && col + horz[0] < 8) && (row + vert[0] >=0 && row + vert[0] < 8)) && chessboardTest[row + vert[0]][col + horz[0]] == false)
                {
                    row = row + vert[0];  // && col + horz[0] >= 0 && chessboardCount.length <= 8[
                    col = col + horz[0];  ////(chessboardTest[row + vert[0]][col + horz[0]] == false
                    chessboardTest[row][col] = true;
                    location++;
                    chessboardCount[row][col] = location;
                    flag = 0;
                    //Sets the array state back to default
                    for(int k = 1; k < 9; k++)
                    {
                        randNum[k] = k;
                    }
                }
                    //If not false, same pos, and inside the board
                    else if((pos == 2 && (col + horz[1] >= 0 && col + horz[1] < 8) && (row + vert[1] >=0 && row + vert[1] < 8)) && chessboardTest[row + vert[1]][col + horz[1]] == false)
                    {
                        row = row + vert[1];
                        col = col + horz[1];
                        chessboardTest[row][col] = true;
                        location++;
                        chessboardCount[row][col] = location;
                        flag = 0;
                        //Sets the array state back to default
                        for(int k = 1; k < 9; k++)
                        {
                            randNum[k] = k;
                        }
                    }
                        //If not false, same pos, and inside the board
                        else if((pos == 3 && (col + horz[2] >= 0 && col + horz[2] < 8) && (row + vert[2] >=0 && row + vert[2] < 8)) && chessboardTest[row + vert[2]][col + horz[2]] == false)
                        {
                            row = row + vert[2];
                            col = col + horz[2];
                            chessboardTest[row][col] = true;
                            location++;
                            chessboardCount[row][col] = location;
                            flag = 0;
                            //Sets the array state back to default
                            for(int k = 1; k < 9; k++)
                            {
                                randNum[k] = k;
                            }
                        }
                            //If not false, same pos, and inside the board
                            else if((pos == 4 && (col + horz[3] >= 0 && col + horz[3] < 8) && (row + vert[3] >=0 && row + vert[3] < 8)) && chessboardTest[row + vert[3]][col + horz[3]] == false)
                            {
                                row = row + vert[3];
                                col = col + horz[3];
                                chessboardTest[row][col] = true;
                                location++;
                                chessboardCount[row][col] = location;
                                flag = 0;
                                //Sets the array state back to default
                                for(int k = 1; k < 9; k++)
                                {
                                    randNum[k] = k;
                                }
                            }
                                //If not false, same pos, and inside the board
                                else if((pos == 5 && (col + horz[4] >= 0 && col + horz[4] < 8) && (row + vert[4] >=0 && row + vert[4] < 8)) && chessboardTest[row + vert[4]][col + horz[4]] == false)
                                {
                                    row = row + vert[4];
                                    col = col + horz[4];
                                    chessboardTest[row][col] = true;
                                    location++;
                                    chessboardCount[row][col] = location;
                                    flag = 0;
                                    //Sets the array state back to default
                                    for(int k = 1; k < 9; k++)
                                    {
                                        randNum[k] = k;
                                    }
                                }
                                    //If not false, same pos, and inside the board
                                    else if((pos == 6 && (col + horz[5] >= 0 && col + horz[5] < 8) && (row + vert[5] >=0 && row + vert[5] < 8)) && chessboardTest[row + vert[5]][col + horz[5]] == false)
                                    {
                                        row = row + vert[5];
                                        col = col + horz[5];
                                        chessboardTest[row][col] = true;
                                        location++;
                                        chessboardCount[row][col] = location;
                                        flag = 0;
                                        //Sets the array state back to default
                                        for(int k = 1; k < 9; k++)
                                        {
                                            randNum[k] = k;
                                        }
                                    }
                                        //If not false, same pos, and inside the board
                                        else if((pos == 7 && (col + horz[6] >= 0 && col + horz[6] < 8) && (row + vert[6] >=0 && row + vert[6] < 8)) && chessboardTest[row + vert[6]][col + horz[6]] == false)
                                        {
                                            row = row + vert[6];
                                            col = col + horz[6];
                                            chessboardTest[row][col] = true;
                                            location++;
                                            chessboardCount[row][col] = location;
                                            flag = 0;
                                            //Sets the array state back to default
                                            for(int k = 1; k < 9; k++)
                                            {
                                                randNum[k] = k;
                                            }
                                        }
                                            //If not false, same pos, and inside the board
                                            else if((pos == 8 && (col + horz[7] >= 0 && col + horz[7] < 8) && (row + vert[7] >=0 && row + vert[7] < 8)) && chessboardTest[row + vert[7]][col + horz[7]] == false)
                                            {
                                                row = row + vert[7];
                                                col = col + horz[7];
                                                chessboardTest[row][col] = true;
                                                location++;
                                                chessboardCount[row][col] = location;
                                                flag = 0;
                                                //Sets the array state back to default
                                                for(int k = 1; k < 9; k++)
                                                {
                                                    randNum[k] = k;
                                                }
                                            }  
                                                //Checks every step of the knight to make sure it is out of bounds in some way
                                                else if(((((col + horz[7] < 0 || col + horz[7] > 7) || (row + vert[7] < 0 || row + vert[7] > 7)) || (chessboardTest[row + vert[7]][col + horz[7]] == true)) || (((col + horz[6] < 0 || col + horz[6] > 7) || (row + vert[6] < 0 || row + vert[6] > 7)) || (chessboardTest[row + vert[6]][col + horz[6]] == true)) || (((col + horz[5] < 0 || col + horz[5] > 7) || (row + vert[5] < 0 || row + vert[5] > 7)) || (chessboardTest[row + vert[5]][col + horz[5]] == true)) || (((col + horz[4] < 0 || col + horz[4] > 7) || (row + vert[4] < 0 || row + vert[4] > 7)) || (chessboardTest[row + vert[4]][col + horz[4]] == true)) || (((col + horz[3] < 0 || col + horz[3] > 7) || (row + vert[3] < 0 || row + vert[3] > 7)) || (chessboardTest[row + vert[3]][col + horz[3]] == true)) || (((col + horz[2] < 0 || col + horz[2] > 7) || (row + vert[2] < 0 || row + vert[2] > 7)) || (chessboardTest[row + vert[2]][col + horz[2]] == true)) || (((col + horz[1] < 0 || col + horz[1] > 7) || (row + vert[1] < 0 || row + vert[1] > 7)) || (chessboardTest[row + vert[1]][col + horz[1]] == true)) || (((col + horz[0] < 0 || col + horz[0] > 7) || (row + vert[0] < 0 || row + vert[0] > 7)) || (chessboardTest[row + vert[0]][col + horz[0]] == true))) && flag != 800)
                                                {
                                                    i = i - 1;
                                                    flag+=100;
                                                    //Every increase is an invalid value
                                                }
                                                    else
                                                    {
                                                        //Discontinue the loop
                                                        i = 999;
                                                    }
            }
                else
                {
                    int count = 0;
                    i--;
                    //Check to see if the array is mutated
                    for(int j = 1; j < 9; j++)
                    {
                        count = count + randNum[j];
                    }
                    //Discontinues the loop
                    if(count == 792)
                    {
                       i = 999;
                    }
                }                               
        }
        
        //Prints the array out in console using a traversal loop
        System.out.print("     0   1   2   3   4   5   6   7   8");
        System.out.println();
        System.out.print("    _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        System.out.println();
        for(int travRow = 0; travRow < 8; travRow++)
            {
                System.out.print(travRow+1 + "  |  ");
                for(int travCol = 0; travCol < 8; travCol++)
                    {
                        System.out.printf("%4d", chessboardCount[travRow][travCol], " ");
                    }
                System.out.println();
            }
    }
    
    /**
     * Takes the instance variable defined the in the print method
     * 
     * @return location
     */
    public int visitBoard()
    {
        //Should have been properly encapsulated -- future note
        return location;
    }
}