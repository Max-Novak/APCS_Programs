import java.util.*;

/**
 * This class implements the PriorityQueue interface using
 * a binary heap.
 *
 * the basic idea is that the node whose index is k
 * has children stored with indexes 2*k and 2*k+1 for left/right
 * children, respectively. The root of the binary heap has index 1.
 *
 * @author Max N
 */

public class HeapPriorityQueue implements PriorityQueue
{
  private List items;
  private int mySize;

  /**
   * Constructs an empty priority queue.
   */
  public HeapPriorityQueue()
  {
    items = new ArrayList();
    items.add(null);            // first add should go at index 1
    mySize = 0;
  }

  /**
   * Adds "obj" to the priority queue
   * 
   * @param Object obj (Comparable)
   */
  public void add(Object obj)
  {
      System.out.println("--> " + obj);

      items.add(obj);//add the Comparable object
      mySize++;

      int k = mySize;

      while (k > 1 && ((Comparable) items.get(k/2)).compareTo(obj) > 0) 
      {
            items.set(k,items.get(k/2));//compare down the tree
            k = k/2;
      }

      items.set(k,obj);//set the node
  }

  /**
  * Removes and returns the smallest value in the priority queue.
  * If the queue is empty, throw an exception in the program.
  * 
  * @return Object min
  */
  public Object removeMin()
  {
     if (!isEmpty()) 
     {
            Object min = peekMin(); // get minimum
            items.set(1,items.get(mySize)); // remove minimum
            mySize--; // decrement the size

            if (mySize > 1) 
            {
                heapify(1); // Heapify from the root
            }

            return min; // ret the lowest value / highest queue
     }
        
     else
     {
            throw new NoSuchElementException(); // queue is empty
     }
  }

  /**
   * Returns the smallest value in the priority queue.
   * If the queue is empty, throw an exception.
   * 
   * @return Object items.get(1)
   */
  public Object peekMin()
  {   
      if (!isEmpty())
      {
          return items.get(1); // find the min value
      }

      else
      {   
          throw new NoSuchElementException(); //queue is empty
      }
  }
  
  /**
   * Checks to see if the tree is empty
   * 
   * @return boolean mySize 
   */
  public boolean isEmpty()
  {
      return mySize == 0;
  }

  /**
   * Resets the tree into a heap after a node has been removed
   * 
   * preconditon: subheaps of hroot satisfy heap property (and shape)
   * postcondition: heap rooted at hroot satisfies heap property
   * 
   * @param int hroot
   */
  private void heapify(int hroot)
  {
    Comparable last = (Comparable) items.get(hroot);//get the root
    int child;
    int k = hroot;

    while (2*k <= mySize) 
    {
        //info given in lab spec
        // find minimal child, start with left, then check right
        child = 2*k;
        
        // child exists AND check if right < left
        if (child < mySize && ((Comparable)items.get(child+1)).compareTo(items.get(child)) < 0) 
        {
            child++;//continue down the tree
        }

        // item to be added <= child
        //stop and add the item
        if (last.compareTo(items.get(child)) <= 0) 
        {   
            break;
        }
        else 
        {
            items.set(k,items.get(child));//continue setting to nodes down the tree
            k = child;
        }
    }

    items.set(k,last);
  }
}
