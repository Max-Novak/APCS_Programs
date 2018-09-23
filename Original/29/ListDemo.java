/**
 *  Demo for the LinkedList
 *
 * @author     Max Nova
 * @created    3/14/2018
 */
public class ListDemo
{
  SinglyLinkedList myList; // Create a new pointer

  /**
   * Constructor for ListDemo. Instansiates the linkedList
   */
  public ListDemo()
  {
    myList = new SinglyLinkedList();
  }

  /**
   *  Creates a SinglyLinkedList of 20 Integer nodes
   */
  public void createList()
  {
    for (int k = 1; k < 21; k++)
    {
      myList.addLast(new Integer(k));
      //print 20 nodes from 1-20
    }
  }

  /**
   *  Display the first element of the list
   */
  public void displayFirst()
  {
    System.out.println("First Element: " + myList.getFirst());
  }

  /**
   *  Display the last element of the list
   */
  public void displayLast()
  {
      System.out.println("Last Element: " + myList.getLast());
  }
  
  /**
   *  Display the number of nodes in the list
   */
  public void displaySize()
  {
      System.out.println("Nodes: " + myList.size());
      //node size is 20
  }
  
  /**
   *  Print the contents of myList
   */
  public void print()
  {
    myList.printList();
    System.out.println();
  }

  /**
   *  Demostrates the use of the SinglyLinkedList class.
   *  Creates and prints a list of 20 consecutive Integer ojects.
   *
   * @param  args  Command line args not used
   */
  public static void main(String[] args)
  {
    ListDemo sList = new ListDemo();

    sList.createList();
    sList.displayFirst();
    sList.displayLast();
    sList.print();
    sList.displaySize();
    //Method tests
  }
}
