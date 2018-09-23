import java.util.*;
import chn.util.*;
import apcslib.Format;

/**
 *  Implements a recursive mergesort on a LinkedList data type
 *
 * @author     Max N
 * @created    June  2
 */
public class MergeList
{
  FileInput inFile;

  /**
   *  Open a file containing id/inventory pairs of data
   *
   * @param  fileName  File to be opened
   */
  public MergeList(String fileName)
  {
    inFile = new FileInput(fileName);
  }

  /**
   *  Reads a file containing id/inv data pairs. The first line of the
   *  file contains the number of id/inventory integer pairs listed on
   *  subsequent lines.
   *
   * @param  list  Reference to LinkedList to which data will be added
   */
  public void readData(LinkedList list)
  {
    int id;
    int inv;

    int howMany = inFile.readInt();
    for (int k = 1; k <= howMany; k++)
    {
      id = inFile.readInt();
      inv = inFile.readInt();
      list.addFirst(new Item(id, inv));
    }
  }

  /**
   *  Prints contents of list
   *
   * @param  list  linked list to be printed
   */
  public void printList(LinkedList list)
  {
    Iterator iter = list.iterator();

    System.out.println(Format.center("Id", 7) +
        Format.right("Inventory", 14));
    while (iter.hasNext())
    {
      Item temp = (Item) iter.next();
      System.out.println(Format.right(temp.getId(), 7) +
          Format.right(temp.getInv(), 10));
    }
    System.out.println();
  }

  /**
   *  Splits listA into two parts. listA retains the first
   *  half of the list, listB contains the last half of
   *  the original list.
   *
   * @param  listA    Original list. reduced by half after split.
   * @param  listB    Contains last half of the original list
   */
  public void split(LinkedList listA, LinkedList listB)
  {
     int length = listA.size() / 2;
     for ( int i = 0; i < length; i++)
     {
         listB.addFirst(listA.getLast());
         listA.removeLast();
     }
  }

  /**
   *  Two linked lists listA and listB are merged into a single
   *  linked list mergedList. They are placed in mergedList starting
   *  with the smallest item on either list and continue working up to
   *  to largest item.
   *
   * @param  listA   LinkedList in nondecreasing order
   * @param  listB   LinkedList in nondecreasing order
   * @return         List  containing all the values from lists listA
   *                 and listB, in nondecreasing order
   */
  public LinkedList merge(LinkedList listA, LinkedList listB)
  {
      LinkedList mergeList = new LinkedList(); // List that both A and B will be sorted and merged into

      Iterator iterA = listA.iterator();
      Iterator iterB = listB.iterator();
        
      Object temp1 = iterA.next();
      Object temp2 = iterB.next();

      // Loop while values remain in either list
      while (temp1 != null || temp2 != null) 
        {
            // Choose list to pull value from
            if (temp2 == null || (temp1 != null && ((Comparable)(temp1)).compareTo((Comparable)(temp2)) <= 0)) 
            //if temp2 linked to list B is larger than enter
            {
                mergeList.add(temp1);//add to final list
                
                if(iterA.hasNext())
                {
                    temp1 = iterA.next();//set to next value in the temp A list
                }
                
                else
                {
                    temp1 = null;//cease the list
                }
            } 
            
            else 
            //if temp1 linked to list A is larger than enter
            {
                mergeList.add(temp2);//add to final list
                
                if(iterB.hasNext())
                {
                    temp2 = iterB.next();//set the next value in the temp B list
                }
                
                else
                {
                    temp2 = null;//cease the list
                }
            }
        }

      return mergeList;
  }
  

  /**
   *  The linked list is returned in sorted order.
   *  Sorted order has the smallest item first and the largest item
   *  last. The ordering is determined by the order defined in the
   *  Comparable class. The method uses the merge sort technique and
   *  must be recursive.
   *
   * @param  listA  LinkedList to be sorted
   * @return        LinkedList in sorted (nondecreasing) order
   */
  public LinkedList mergeSort(LinkedList listA)
  {
    LinkedList listB = new LinkedList();
    
    if (listA == null)
    {
      return null;
    }
    
    // Don't sort an empty list or a list with one node
    if (listA.size() <= 1)
    {
      return listA;
    }

    // Split the list in half.  If uneven then make left one larger.
    split(listA, listB);

    return merge(mergeSort(listA), mergeSort(listB));
  }

  /**
   *  Reverses the order of a list
   *
   * @param  list  LinkedList to be reversed
   * @return       List in reverse order
   */
  public LinkedList reverseList(LinkedList list)
  {
        Iterator iter = list.iterator();

        LinkedList reversedList = new LinkedList();

        while (iter.hasNext())
        {
            Item temp = (Item) iter.next();
            reversedList.addFirst(temp);//Turns 12345 into 
                                        // 54321 
        }

        return reversedList;
  }

  /**
   *  The main program for the MergeList class
   *
   * @param  args  The command line arguments (not used)
   */
  public static void main(String[] args)
  {
    MergeList mList = new MergeList("file20.txt");
    LinkedList list = new LinkedList();

    System.out.println("Original list\n");
    mList.readData(list);
    mList.printList(list);

    System.out.println("List after MergeSort\n");
    list = mList.mergeSort(list);
    mList.printList(list);

    System.out.println("Reversed list\n");
    list = mList.reverseList(list);
    mList.printList(list);
  }
}
