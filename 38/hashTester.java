import chn.util.*;

/**
 * Tests the run of the hash lab and checks many stats on its work.
 * Allows the user to search for ids in the table.
 *
 * @author Max N
 * @version Jun 7
 */
public class hashTester
{
    public static void main(String[] args)
    {
        Hasher hash = new Hasher();
        ConsoleIO console = new ConsoleIO();
        
        System.out.println(hash.getNullPercent());
        System.out.println(hash.getAvgLength());
        System.out.println(hash.getLongestLength());
        System.out.println("\n\n");
        
        int input = 0;
        int idToFind = 0;
        int index;
        
        System.out.println("Testing search algo\n");
        System.out.print("Enter Id value to search for (-1 to quit) ---> ");
        idToFind = console.readInt();
        
        while (idToFind >= 0)
        {
            System.out.print("Id # " + idToFind);
            index = hash.search(idToFind);
            if (index == -1)
                System.out.println(" No such part in stock");
                
            System.out.print("\nEnter Id value to search for (-1 to quit) ---> ");
            idToFind = console.readInt();
        }
    }
}
