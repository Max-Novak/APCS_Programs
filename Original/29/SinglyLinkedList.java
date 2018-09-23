import java.util.*;

/**
 *  Implementation of lists, using singly linked elements. Implementation for adding last and first nodes.
 *  Also get value of last and first node are possible.
 *
 * @author     G. Peck
 * @created    April 27, 2002
 */
public class SinglyLinkedList
{
  private ListNode first;  // first element
  private ListNode last;   // last element

  /**
   *  Constructor for the SinglyLinkedList object
   *  Generates an empty list.
   */
  public SinglyLinkedList()
  {
    first = null;
    last = null;
    //Default is empty list
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
      //if the list is empty throw
    }
        else
        {
            return first.getValue();
        }
  }

  /**
   *  Inserts the given element at the beginning of this list.
   *
   * @param  value  the element to be inserted at the beginning of this list.
   */
  public void addFirst(Object value)
  {
    // note the order that things happen:
    // head is parameter, then assigned
    first = new ListNode(value, first);
  }
  
  /**
   *  Inserts the given element at the end of this list.
   *
   * @param  value  the element to be inserted at the beginning of this list.
   */
  public void addLast(Object value)

  { 
       ListNode temp = last;
       
       if(temp == null)
       {
           first = new ListNode(value, first);
           last = first;
           //Construct the first element
       }
            else
            {
                last = new ListNode(value, null);
                temp.setNext(last);
                //Begin adding from the end
            }
  }
  
  /**
   *  returns the given element at the end of this list.
   *
   * @return  temp - Returns value at the end of the list
   */
  public Object getLast()
  {   
      Object temp = first;
      ListNode node = first;
      
      if (last == null  && first == null)
      {
          throw new NoSuchElementException();
          //If the list is empty throw
      }
        else
        {
            while(temp != null)
            {
                temp = (int)node.getValue();
                node = node.getNext();
                if(node == null)
                {
                    return temp;
                }
            }
            //traverse the List nodes until the end is reached. Then returns the last vaulue
            return temp;
        }
  }

  /**
   *  Returns the number of nodes in the list
   *
   * @return  size - number of nodes in the list
   */
  public int size()
  {
      int size = 0;
      
      ListNode temp = first;
      while (temp != null)
      {
          size++;//increment
          temp = temp.getNext();// go to next node
      }
      
      return size;
    }
    
  /**
   *  Print the contents of the entire linked list
   */
  public void printList()
  {
    ListNode temp = first;// start from the first node
    System.out.print("SinglyLinkedList: ");
    while (temp != null)
    {
      System.out.print(temp.getValue() + " ");
      temp = temp.getNext();// go to next node
    }
  }

  /**
   *  Returns a string representation of this list. The string
   *  representation consists of the list's elements in order,
   *  enclosed in square brackets ("[]"). Adjacent elements are
   *  separated by the characters ", " (comma and space).
   *
   * @return    string representation of this list
   */
  public String toString()
  {
    String s = "[";

    ListNode temp = first;  // start from the first node
    while (temp != null)
    {
      s += temp.getValue(); // append the data
      temp = temp.getNext();      // go to next node
      if (temp != null)
        s += ", ";
    }
    s += "]";
    return s;
  }
}
