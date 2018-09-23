import chn.util.*;
import apcslib.*;

/**
 * Store class which holds the Item[] object array and allows for sorting and
 * displaying of data.
 *
 * @author Max Nova
 * @version 2/26/2018
 */
public class Store
{
    //Declare the object array and the sort variables to be used in both search functions
    private Item[] myStore;
    private int first, last, mid;
    
    /**
     * Constructor for the Store class.
     * Takes in the file input for the file and enters them into the object array.
     * 
     * @param fileName
     */
    public Store(String fileName)
    {
        //input is read as two different nouns of the object and then added to the 
        //array when instantiated
        int idNum, invNum;
        
        FileInput inFile = new FileInput(fileName);
        myStore = new Item[inFile.readInt()];
        
        for (int i = 0; i < myStore.length; i++)
        {
            idNum = inFile.readInt();
            invNum = inFile.readInt();
            myStore[i] = new Item(idNum, invNum);
        }
        
        //Close the file
        inFile.close();
    }
 
    /**
     * Prints out formatting and new lines every 10 spaces. 
     * Prints out the entire store
     */
    public void displayStore()      
    {
        //Formatting the title
        System.out.println(Format.left("",4) + Format.left("ID Num",10) + "Number in Stock" + '\n');
        
        //Squentially prints the store
        for (int i = 0; i < myStore.length; i++)
        {
            System.out.println(Format.left((i + 1),4) + Format.left(myStore[i].getId(),10) + myStore[i].getInv());
            if ((i + 1) % 10 == 0)
            {
                //modulus tests for when to add new line
                System.out.println();
            }
        }
    }
 
    /**
     * Calls the quicksort method using a predefined parameter
     */
    public void doSort()                    
    {
        //Call quickSort
        quickSort(myStore, 0, myStore.length - 1);  
    }
 
    /**
     * quickSort algo we made earlier in the labs. Recursivly sorts.
     * 
     * 
     * @param Item[] list
     * @param first
     * @param last
     */
    private void quickSort(Item[] list, int first, int last)
    {
        int g = first, h = last;
        int midIndex = (first + last) / 2;
        Item dividingValue = list[midIndex];
        //Finds the midIndex from Item
        
        do
        {
            while (list[g].compareTo(dividingValue) < 0)
            {
                g++;
            }
            
            while (list[h].compareTo(dividingValue) > 0)
            {
                h--;
            }
            
            if (g <= h)
            {
                //swap lists
                Item temp = list[g];
                list[g] = list[h];
                list[h] = temp;
                g++;
                h--;
            }
        }
        while (g < h);
        
        //Recursion
        if (h > first)
        {
            quickSort (list,first,h);
        }
        
        if (g < last)
        {
            quickSort (list,g,last);
        }
    }
 
    /**
     * Both the iterative and recursive versions of binary search are called
     */
    public void testSearch()
    {
        int idToFind;
        int invReturn;
        int index;
        ConsoleIO input = new ConsoleIO();

        System.out.print("Enter Id value to search for (-1 to quit) ---> ");
        idToFind = input.readInt();
        
        //Both searches are called
        while (idToFind >= 0)
        {
            // calling iterative version of binary search  
            index = bsearch(new Item(idToFind, 0));
            System.out.print("Iterative binary search: Id # " + idToFind);
            if (index == -1)
            {
                System.out.println("     No such part in stock");
            }
                else
                {
                    System.out.println("     Inventory = " + myStore[index].getInv());
                }
 
            // calling recursive version of binary search
            index = bsearch (new Item(idToFind, 0), 0, myStore.length-1);
            System.out.print("Recursive binary search: Id # " + idToFind);
            if (index == -1)
            {
                System.out.println("     No such part in stock");
            }
                else
                {
                    System.out.println("     Inventory = " + myStore[index].getInv());
                }
 
            //Determine when to quit the program
            System.out.print("\nEnter Id value to search for (-1 to quit) ---> ");
            idToFind = input.readInt();
        }
    }
 
    /**
     *  Searches the myStore array of Item Objects for the specified
     *  item object using a iterative binary search algorithm
     *
     * @param  Item idToSearch
     * @return index of Item or -1 if not found
     */
    int bsearch(Item idToSearch)
    {
        first = 0;
        last = myStore.length - 1;
        
        while (first <= last)
        {
            mid = (first + last) / 2;
            
            //Uses the provided algo
            if (myStore[mid].equals(idToSearch))
            {
                return mid;
            }
                else if (myStore[mid].compareTo(idToSearch) > 0)
                {
                    last = mid - 1;    
                }
                    else          
                    {
                        first = mid + 1 ;  
                    }
        }
        //return 1 if false
        return -1;
    }
 
    /**
     *  Searches the specified array of Item Objects for the specified
     *  item object using a recursive binary search algorithm
     *
     * @param  idToSearch  Item object containing Id value being search for
     * @param  first       Starting index of search range
     * @param  last        Ending index of search range
     * @return             index of Item if found, -1 if not found
     */
    int bsearch (Item idToSearch, int a, int b)
    {
        first = a; last = b;
        mid = (first + last) / 2;
        
        //Uses provided algo
        if (first > last)
        {
            return -1;
        }
            else if (myStore[mid].equals(idToSearch))
            {
                return mid;
            }
                else if (myStore[mid].compareTo(idToSearch) > 0)
                {
                    last = mid - 1;  
                    return bsearch(idToSearch,first,last);
                }
                    else        
                    {
                        first = mid + 1 ;
                        return bsearch(idToSearch,first,last);
                    }
    }
}