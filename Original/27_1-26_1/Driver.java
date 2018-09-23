/**
 * Driver class for the Store 
 *
 * @author Max Nova
 * @version 2/26/2018
 */
public class Driver
{
    public static void main (String[] args)    
    {
        //Instantiate the store
        Store store = new Store("file50.txt");
        //Sort the items in increasing order
        store.doSort();
        //Outputs a the print loop for all items in the array
        store.displayStore();
        //Faciliate search function for both iterative and recursive searches
        store.testSearch();
    }
}