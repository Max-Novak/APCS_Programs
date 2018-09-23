import java.util.*;
/**
 * Working Class for Permutations lab. Contains a single nextPermutation method 
 *
 * @author Max Nova
 * @version 12/20/2017
 */
public class PermutationGenerator
{
    /**
     * Creates an array housing consecutive 1-10 ints and then randomizes their order on another ArrayList.[
     *
     * @param none
     * @return ArrayList
     */
    public ArrayList nextPermutation()
    {
        ArrayList numList = new ArrayList(10);
        ArrayList permList = new ArrayList(10);
        //Instansiate the two ArrayLists
        //Instansiate Random class
        Random random = new Random();
        int randIndex, tempInt = 10;
        
        //Fill the inital ArrayList
        for(int i = 0; i < 10; i++)
        {
            numList.add(new Integer(i) + 1);
        }
        
        //Ramdomize the order of the ints in the second ArrayList
        for(int j = 0; j < 10; j++)//tempInt < 1
        { 
            randIndex = random.nextInt(tempInt);
            permList.add((Integer)numList.remove(randIndex));
            tempInt--;
        }
        
        //Return the ArrayList
        return permList;
    }
}
