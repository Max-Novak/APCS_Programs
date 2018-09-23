import java.util.*;
import apcslib.*;
/**
 * Driver for Permutation lab. calls the nextPermutation method and outputs the randomized values in the ArrayList "1-10" 10 times.[
 *
 * @author Max Nova
 * @version 12/20/2017
 */
public class Driver
{
    public static void main(String[] args)
    {
        PermutationGenerator permutation = new PermutationGenerator();
        //Output title
        System.out.println("Random Permutation List Generator");
        System.out.println();
        int indexCount = 0;
        //Call nextPerm method to fill ArrayList
        permutation.nextPermutation();
        
        for(int k = 1; k < 11; k++)
        {
            ArrayList tempList = new ArrayList(10);
            //Call nextPerm method to fill ArrayList
            tempList = permutation.nextPermutation();
            //Format the output 
            System.out.print("List " + k + ":" + "  " );
            
            for(int i = 0; i < 10;i++)
            {
                //Takes the elements out of the ArrayList
                System.out.print(tempList.get(i) + " ");
            }
            //Next line
            System.out.println();
        }
    }
}