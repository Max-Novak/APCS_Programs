import java.util.*;
import chn.util.*; 

/**
 *  Implementation of lists, using singly linked elements.
 *
 * @author     G. Peck
 * @created    April 27, 2002
 */
public class SinglyLinkedList
{
  private ListNode first;  // first element
  private ListNode last;   // last elementt

  /**
   *  Constructor for the SinglyLinkedList object
   *  Generates an empty list.
   */
  public SinglyLinkedList()
  {
    first = last = null;
  }
 
  /**
   *  Constructor for the SinglyLinkedList object
   *  Generates an list filled 20 items, scanned from 20.txt
   *  
   *  @param String fileName
   */
  public SinglyLinkedList(String fileName)
  {
        //input is read as two different nouns of the object and then added to the 
        //array when instantiated
        int idNum, invNum, count;
        
        FileInput inFile = new FileInput(fileName);
        count = inFile.readInt();
        
        for (int i = 0; i < count; i++)
        {
            idNum = inFile.readInt();
            invNum = inFile.readInt();
            Item item = new Item(idNum, invNum);
            ListNode node = new ListNode(item, first);
            first = node.getNext();
        }
        
        //Close the file
        inFile.close();
  }
  
  /**
   *  Returns true if this list contains no elements.
   *
   * @return    true iff the list is empty
   */
  public boolean isEmpty()
  {
      if(size() == 0)
      {
            return true;
      }
      return false;
  }

  /**
   *  Returns the first element in this list.
   *
   * @return  the first element in the linked list.
   */
  public Object getFirst()
  {
    if (first == null)
    {
      throw new NoSuchElementException();
    }
    else
      return first.getValue();
  }

  /**
   *  Inserts the given element at the beginning of this list.
   *
   * @param  element  the element to be inserted at the beginning of this list.
   */
  public void addFirst(Object element)
  {
    // note the order that things happen:
    // head is parameter, then assigned
    first = new ListNode(element, first);
    if (last == null)
    {
      last = first;
    }
  }

  /**
   *  Returns the last element in this list.
   *
   * @return  the last element in the linked list.
   */
  public Object getLast()
  {
    if (last == null)
    {
      throw new NoSuchElementException();
    }
    else
      return last.getValue();
  }

  /**
   *  Adds and object to the end of the list
   *
   * @param  element  adds element to end of list
   */
  public void addLast(Object element)
  {
    if (first == null)
    {
      first = last = new ListNode(element, first);
    }
    else
    {
      last.setNext(new ListNode(element, null));
      last = last.getNext();
    }
  }
  
  /**
   *  Inserts the specified element at the position in this list 
   *  All elements in the list must implement the Comparable interface. Shifts
   *  the element currently at that position (if any) and any
   *  subsequent elements to the right.
   *
   * @param  element  element to be inserted
   */
  public void insert(Comparable element)
  {
    ListNode temp = new ListNode(element);
    ListNode current = first;
    ListNode previous = first;
    ListNode lastPoint = last;
    
    if (first == null) {
        first = temp;
        last = first;
    }
    
    else if(element.compareTo(getFirst()) < 0)
        {
            addFirst(element);
        }
        else if(element.compareTo(getLast()) > 0)
            {
                addLast(element);
            }
            else 
            {
                while (current.getNext() != null) 
                {
                    previous = current;
                    current = current.getNext();
                    if(element.compareTo(current.getValue()) < 0)
                    {
                        previous.setNext(new ListNode(element, current));
                        previous.getNext();
                        break;
                    }
                }
            }           
  }

  /**
   *  Returns the first occurrence of the specified element, or null
   *  if the List does not contain this element.
   *
   * @param  element  element to search for.
   * @return        first occurrence of the specified element, or null
   *                if the list doesn not contain the element.
   */
  public Object find(Comparable element)
  {
    ListNode temp = first;
    // for each node in the linked list
    while (temp != null)
    {
        if (element.compareTo(temp.getValue()) == 0)
        {
            return temp.getValue();//traverse the nodes
        }
        temp = temp.getNext();
    }   
    return null;
  }

  /**
   *  Removes the first occurrence of the specified element in
   *  this list. If the list does not contain the element, it
   *  is unchanged.
   *
   * @param  element  element to be removed from this list, if present.
   * @return          removes first element with matching element, if any.
   */
  public Object remove(Object element)
  {
    ListNode temp = first;//holds current node
    ListNode previous = first;//holds previous node
    boolean foundVal = true; //loop control
    
    while (temp != null && foundVal)
    {
        if(element.equals(temp.getValue()))
        {
            foundVal = false; //Once the loop finds the value in the list it breaks the loop
        }
        else
        {
            previous = temp;
            temp = temp.getNext();//Sets a pointer to the current and previous nodes
        }
    }
    
    if(foundVal)
    {
        return null;
    }
    
    //deals with list size of 1
    if (element.equals(first.getValue()))
    {
        first = first.getNext();
        temp.setNext(null);
        return temp;
    }  
    
    //deals with list where the last node must be removed
    if (element.equals(last.getValue()))
    {
        previous.setNext(temp.getNext());
        last = previous; 
        temp.setNext(null);
        return temp;
    }
    
    //If a special condition is not tripped then the general rule is applied
    previous.setNext(temp.getNext());
    temp.setNext(null); 
    
    return temp;
  }

  /**
   *  Returns the number of elements in this list.
   *
   * @return    number of elements in this list.
   */
  public int size()
  {
    int count = 0;
    ListNode temp = first;
    while(temp != null)
    {
        count++;
        temp = temp.getNext();
    }
    return count;
  }

  /**
   *  Prints all the elements of the list
   */
  public void printList()
  {
    ListNode temp = first;  // start from the first node
    while (temp != null)
    {
      System.out.println("ID: " + ((Item)temp.getValue()).getId() + " " + "Inventory: " +
                         ((Item)temp.getValue()).getInv());
      temp = temp.getNext();  // go to next node
    }
  }

  /**
   *  Prints all the elements of the list in reverse order
   */
  public void printBackwards()
  {
    printBackwards(first);
  }

  /**
   *  Recursive helper method to print all the elements of
   *  the list in reverse order
   */
  private void printBackwards(ListNode temp)
  {
    if(temp.getNext() != null)//Continue iterating
    { 
        printBackwards(temp.getNext());  //Call the method again to enter the recursive tunnel
    }
    System.out.println("ID: " + ((Item)temp.getValue()).getId() + " Inventory: " + ((Item)temp.getValue()).getInv());
  }

  /**
   *  Removes all of the elements from this list.
   */
  public void clear()
  {
    System.out.println("clear");
    first = null;
  }

  /**
   *  Returns a string representation of this list. The string
   *  representation consists of the list's elements in order,
   *  enclosed in square brackets ("[]"). Adjacent elements are
   *  separated by the characters ", " (comma and space).
   *
   * @return    Description of the Returned Value
   */
  public String toString()
  {// post: returns a string representing list

    String s = "[";

    ListNode temp = first;  // start from the first node
    while (temp != null)
    {
      s += temp.getValue() + ", "; // append the data
      temp = temp.getNext();      // go to next node
    }
    s += "]";
    return s;
  }
}
