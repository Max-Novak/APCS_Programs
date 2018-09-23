import java.util.*;
import chn.util.*; 

/**
 *  Implementation of a doubly linked list.
 *  Contains methods that allow a user to insert values and traverse in both directions
 *
 * @author     Max N
 * @created    Jun 1
 */
public class DoublyLinkedList
{
  private DNode first;  // first element
  private DNode last;   // last element
  
  /**
   *  Constructor for the DoublyLinkedList object
   *  Generates an empty list.
   */
  public DoublyLinkedList()
  {
    first = last = null;
  }
 
  /**
   *  Constructor for the DoublyLinkedList object
   *  Generates a list filled with 10 items, scanned from 10.txt
   *  
   *  @param String fileName
   */
  public DoublyLinkedList(String fileName)
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
            DNode node = new DNode(item, first, last);
            first = node.getNext();
            last = node.getPrevious();
        }
        
        //Close the file
        inFile.close();
  }
  
  /**
   *  Returns true if this list contains no elements.
   *
   * @return    true if the list is empty
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
      throw new NoSuchElementException();//catchs an exception if the first element is null
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
    DNode temp = new DNode(element, null, null);
    if(first == null)
    {
        first = temp;
        last = first;
    }
    else
        {
            first.setPrevious(temp);
            temp.setNext(first);
            first = temp;
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
      throw new NoSuchElementException();//returns exception if last is null
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
      DNode temp = new DNode(element, null, null);
    if(first == null)
    {
        first = temp;
        last = first;
    }
    else
    {
        temp.setPrevious(last);
        last.setNext(temp);
        last = temp;
    }
  }
  
  /**
   *  Inserts the specified element at the position in this list
   *  Shifts the element currently at that position (if any) and any
   *  subsequent elements to the right.
   *
   * @param  element  element to be inserted
   */
  public void insert(Comparable element)
  {
    DNode temp = new DNode(element);
    DNode current = first;
    DNode previous = first;
    DNode lastPoint = last;
    
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
                        //DNode newNode = new DNode(element, null, null);
                        previous.setNext(temp);
                        temp.setNext(current);
                        current.setPrevious(temp);
                        temp.setPrevious(previous);
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
    DNode temp = first;
    // for each node in the linked list
    while (temp != null)
    {
    if (element.compareTo(temp.getValue()) == 0)
    {
        return temp.getValue();
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
    DNode temp = first;
    DNode previous = first;
    boolean foundVal = true; 

    while (temp != null && foundVal)
    {
        if(element.equals(temp.getValue()))
        {
            foundVal = false; //once the loop finds a value that matchs it exits
        }
        else
        {
            previous = temp;//set to previous node
            temp = temp.getNext();//set to current node
        }
    }
    
    if(foundVal)
    {
        return null;
    }
    else
    {
        if (element.equals(first.getValue()))
        {
            first = first.getNext();//deals with the case if the first value of the list must be removed
            first.setPrevious(null);
            temp.setNext(null);
            return temp.getValue();
        } 
        else
            if (element.equals(last.getValue()))
            {
                last = last.getPrevious();//deals with the case if the last value of the list must be removed
                last.setNext(null);
                temp.setPrevious(null);
                return temp.getValue();
            }
            else
            {
                previous.setNext(temp.getNext());//If neither special condtions occur then general case applies
                temp.getNext().setPrevious(previous);
                temp.setNext(null); //remove links infront
                temp.setPrevious(null); //remove links behind
                return temp.getValue();
            }
    }
  }

  /**
   *  Returns the number of elements in this list.
   *
   * @return    number of elements in this list.
   */
  public int size()
  {
    int count = 0;
    DNode temp = first;
    while(temp != null)
    {
        count++;
        temp = temp.getNext();
    }
    return count;
  }

  /**
   *  Prints all the elements of the list forwards (iteratively)
   */
  public void printList()
  {
    DNode temp = first;  // start from the first node
    while (temp != null)
    {
      System.out.println("ID: " + ((Item)temp.getValue()).getId() + " " + "Inventory: " +
                         ((Item)temp.getValue()).getInv());
      temp = temp.getNext();  // go to next node
    }
  }
  
  /**
   *  Prints all the elements of the list backwards (iteratively)
   */
  public void printReverse()
  {
    DNode temp = last;  // start from the last node
    while (temp != null)
    {
      System.out.println("ID: " + ((Item)temp.getValue()).getId() + " " + "Inventory: " +
                         ((Item)temp.getValue()).getInv());
      temp = temp.getPrevious();  // traverse nodes backwards
    }
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

    DNode temp = first;  // start from the first node
    while (temp != null)
    {
      s += temp.getValue() + ", "; // append the data
      temp = temp.getNext();      // go to next node
    }
    s += "]";
    return s;
  }
}
