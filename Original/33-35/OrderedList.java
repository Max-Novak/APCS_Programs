/**
 *  Lesson 33-35 Binary Tree
 *
 * @author     Max N
 * @created    June 2
 */

import chn.util.*;

public class OrderedList
{
   /**
   *  tester for BinaryTree finder
   *  Invokes the finder method and prints appropriate response
   *  
   *  @param BinaryTree list
   */
  public void testFind(BinaryTree list)
  {
    int idToFind;
    Item location;

    ConsoleIO console = new ConsoleIO();

    System.out.println("Testing search algorithm\n");
    System.out.print("Enter Id value to search for (-1 to quit) --> ");
    idToFind = console.readInt();

    while (idToFind >= 0)
    {
      TreeNode tempNode = list.find(idToFind);
      if (tempNode==null)
         {
            System.out.println("Id# " + idToFind + " No such part in stock");
         }
         else
         {
             System.out.println(" Id #" + idToFind + " has been found");
         }
      System.out.println();
      System.out.print("Enter Id value to search for (-1 to quit) --> ");
      idToFind = console.readInt();
    }
  }

   /**
   *  tester for BinaryTree delete
   *  Invokes the delete method and prints appropriate response
   *  
   *  @param BinaryTree list
   */
  public void testDelete(BinaryTree list)
  {
     int idToDelete;
     boolean success;
     System.out.println("Testing delete algorithm\n");
     System.out.print("Enter Id value to delete (-1 to quit) --> ");
     ConsoleIO console = new ConsoleIO();
     
     idToDelete = console.readInt();
     while (idToDelete >= 0)
     {
         Item dNode = new Item(idToDelete, 0);
         TreeNode tempNode = list.find(idToDelete);
         if (tempNode==null)
         {
            System.out.println("Id# " + idToDelete + " No such part in stock");
         }
         else
         {
             list.delete(dNode);
             System.out.println(" Id #" + idToDelete + " was deleted");
         }
         System.out.println();
         System.out.print("Enter Id value to delete (-1 to quit) --> ");
         idToDelete = console.readInt();
     }
  }
  

   /**
   *  Takes in input from a text file
   *  Values are converted into objects
   *  
   *  @param BinaryTree list
   */
  public void readData(BinaryTree tree)
  {
    FileInput inFile;

    String fileName = "file20.txt";
    int id, inv;

    inFile = new FileInput(fileName);

    int howMany = inFile.readInt();

    for (int k = 1; k <= howMany; k++)
    {
      id = inFile.readInt();
      inv = inFile.readInt();
      Item item = new Item(id, inv);
      tree.insert(item);
    }
  }

  /**
   *  Input menu
   *  Takes in user input and acts as client
   *  
   *  @param BinaryTree head
   */
  public void mainMenu (BinaryTree head)
  {
    String choice;
    ConsoleIO console = new ConsoleIO();

    do
    {
      System.out.println("Binary Tree algorithm menu\n");
      System.out.println("(1) Read a file from disk, build the binary tree");
      System.out.println("(2) Print the tree in order");
      System.out.println("(3) Search the tree");
      System.out.println("(4) Delete from the tree");
      System.out.println("(5) Count the nodes in the tree");
      System.out.println("(Q) Quit\n");
      System.out.print("Choice ---> ");
      choice = console.readLine() + " ";  // kludge to ensure choice.charAt(0) > 0

      System.out.println();

      if ('1' <= choice.charAt(0) && choice.charAt(0) <= '5')
      {
        switch (choice.charAt(0))
        {
          case '1' :
            readData(head);
            break;
          case '2' :
            System.out.println();
            System.out.println("The tree printed inorder\n");
            head.inorder();
            System.out.println();
            System.out.println();
            break;
          case '3' :
            testFind(head);
            break;
          case '4' :
            testDelete(head);
            break;
          case '5' :
            head.countHelper();
            break;
        }
      }
    }
    while (choice.charAt(0) != 'Q' && choice.charAt(0) != 'q');
  }

  /**
   *  Entry point into the program
   *  
   *  @param String[] args
   */
  public static void main(String[] args)
  {
    OrderedList test = new OrderedList();
    BinaryTree tree = new BinaryTree();

    test.mainMenu(tree);
  }
}