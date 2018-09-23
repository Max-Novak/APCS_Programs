import chn.util.*;
import java.util.*;

/**
 * Hash table creation class.
 * Creates a hash table with implementation on returning stats and search functionlity
 *
 * @author Max N
 * @version Jun 7
 */
public class Hasher
{
    private final int MAX = 601;//400*1.5 + 1
    private LinkedList[] table = new LinkedList[MAX];//Table for the data
    
    /**
     * Constructor for loading data from a given txt file
     */
    public Hasher()
    {
        loadFile("file400.txt");//data loaded from txt file
    }
    
    private void loadFile(String fileName)
    {
        int id;
        int inv;
        
        FileInput inFile = new FileInput(fileName);//setup inputFile object
        
        int numItems = inFile.readInt();//read input
        
        for(int i = 0; i < numItems; i++)//for each item that there is
        {
            id = inFile.readInt();
            inv = inFile.readInt();
            
            if(table[hash(id) % MAX] == null)
            {
                table[hash(id)% MAX] = new LinkedList();
                table[hash(id)% MAX].add(new Item(id, inv));
                
            }
            else
            {
                table[hash(id)% MAX].add(new Item(id, inv));//collisions
            }
        }
    }
    
    /**
     * Allows the user to search for IDs within the table
     */
    public int search(int idToFind)
    {
        int index = hash(idToFind) % table.length;
        Item value;
        
        LinkedList list = table[index];

        if(list == null) 
        {
            return -1;//the list is empty
        }
        
        Iterator iter = list.iterator();//allows iteration
        while(iter.hasNext())
        {
            value = (Item)iter.next();
            if(value.getId() == idToFind)
            {
                System.out.println(" Inventory = " + value.getInv());//return the id found 
                return 1;
            }
        }
        
        return -1;
    }
    
    private int hash(int id)
    {
        int num1, num2, num3, num4, num5, numFinal;
        
        num5 = id % 100;//allows for hashing
        num4 = (id % 100) / 10;
        num3 = (id / 100) % 100 % 10;
        num2 = (id / 1000) % 10;
        num1 = id / 10000;
        
        numFinal = num1+num2+num3+num4+num5;
        
        id = (id*numFinal*numFinal)+id;

        return id;
    }
    
    /**
     * Returns the percent of null pointers in the hash table
     * 
     * @return double (numNulls/table.length)*100
     */
    public double getNullPercent()
    {        
        double numNulls = 0;//number of null pointers in the table
        
        for(int i = 0; i < table.length; i++)
        {
            LinkedList list = table[i];
            
            if(list == null)
            {
                numNulls++;//iterate to find the total number of pntrs
            }
            
        }
        return (numNulls/table.length)*100;//convert to percent
    }
    
    /**
     * Find the average length of the lists that exist
     * 
     * @return double sum/numLists
     */
    public double getAvgLength()
    {
        double sum = 0;//#sum of all the sizes of the lists
        double numLists = 0;//# of lists
        
        for(int i = 0; i < table.length; i++)
        {
            LinkedList list = table[i];
            if(list != null)//Is list null?
            {
                sum += list.size();//adds list size
                numLists++;//# of total lists
            }
        }
        return sum/numLists;//average
    }
    
    /**
     * The longest list size in the table
     * 
     * @return int longest
     */
    public int getLongestLength()
    {
        int longest = 0;
        
        for(int i = 0; i < table.length; i++)
        {
            LinkedList list = table[i];
            if(list != null && (list.size() > longest))//longest list
            {
                longest = list.size();            
            }
        }
        return longest;
    }
}
