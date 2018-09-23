import apcslib.*;
import chn.util.*;

/**
 *  Driving class for heapSort. Provides utilit to load, read, and print the data
 *
 * @author     Max N
 * @created    Jun 7
 */

import apcslib.*;
import chn.util.*;

public class HeapSort
{
  HeapPriorityQueue myHeapPQ;

  /**
   * Default constructor sets the file400.txt as the loaded data file
   */
  public HeapSort()
  {
    this("file20.txt");//default txt file
  }

  /**
   * Takes in the filename and loads the data into the list
   * 
   * @param String fName
   */
  public HeapSort(String fName)
  {
    myHeapPQ = new HeapPriorityQueue();
    loadFile(fName);//loads the data from txt file into list
  }

  /**
   * Loads the data from the file into the list iterativly
   * 
   * @param String fName
   */
  private void loadFile(String fileName)
  {
    int id, inv;

    FileInput inFile = new FileInput(fileName);

    int howMany = inFile.readInt();
    for (int k = 1; k <= howMany; k++)//load the data by id and inv then create
    //an item to hold it
    {
      id = inFile.readInt();
      inv = inFile.readInt();
      myHeapPQ.add(new Item(id, inv));
    }
  }
  
  
  /**
   * Remove the min value until the list is empty
   */
  public void sort()
  {
     System.out.println();
     System.out.println("sorted order:");
     System.out.println();
    
     while(!myHeapPQ.isEmpty())//if not empty
     {
        System.out.println(myHeapPQ.removeMin());//removeMIn
     }
  }
  
  /**
   * Tester main method for interacting with a priority queue
   */
  public static void main(String[] args)
  {
    HeapSort heapTest = new HeapSort("file20.txt");

    heapTest.sort();//sorts the list
  }
}