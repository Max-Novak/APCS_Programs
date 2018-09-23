import java.util.*;
import chn.util.*; 

/**
 *  Implementation of a Binary Tree
 *  Includes the ability to create, delete, and find nodes within it
 *
 * @author     Max N
 * @created    June 2
 */
public class BinaryTree
{
  private TreeNode root;  // root element
  
  /**
   *  Constructor for the BinaryTree object
   *  Generates an empty list.
   */
  public BinaryTree()
  {
    root = null;
  }
 
  /**
   *  Constructor for the BinaryTree object
   *  Generates an list filled 20 items, scanned from 20.txt
   *  
   *  @param String fileName
   */
  public BinaryTree(String fileName)
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
            TreeNode node = new TreeNode(item);
            root = node.getLeft();
        }
        
        //Close the file
        inFile.close();
  }
  
  /**
   *  Prints the tree inorder using a stack. The operation is iterative and the stack is represented as an ArrayList.
   *  Simulates recursion in an iterative sense.
   */
  public void inorderIterative()
  {
       inorderIterativeHelper(root);
  }
  
  private void inorderIterativeHelper (TreeNode root)
  {
    if(root == null)
    {
        return;
    }
      
    ArrayStack stack = new ArrayStack();
    TreeNode temp;
    
    temp = root;
    
    while (temp != null) {
            stack.push(temp);
            temp = temp.getLeft();
        }
         
    // traverse the tree
    while (!(stack.isEmpty()))
    {
        // visit the top node
        temp = (TreeNode)stack.pop();
        System.out.print(temp.getValue() + "\n");
        if (temp.getRight() != null)
        {
            temp = temp.getRight();
            // the next node to be visited is the leftmost
            while (temp != null)
            {
                stack.push(temp);
                temp = temp.getLeft();
            }
        }
    }
  }

  /**
   *  Returns the root element in this list.
   *
   * @return  the root element in the linked list.
   */
  public Object getroot()
  {
    if (root == null)
    {
      throw new NoSuchElementException();
    }
    else
      return root.getValue();
  }
  
  /**
   *  Prints the tree inorder
   */
  public void inorder()
  {
       inorderRecursiveHelper(root);
  }
  
  /**
   *  Helper method for the inorder print method
   *
   * @param  TreeNode root
   */
  private void inorderRecursiveHelper(TreeNode root) 
  {
      if (root != null)
      {
            inorderRecursiveHelper(root.getLeft());
            System.out.println("ID:" + ((Item)root.getValue()).getId() + "   Inv:" + ((Item)root.getValue()).getInv());
            inorderRecursiveHelper(root.getRight());//inorder operation
      }
  }
 
  /**
   * Insert method for adding a new node
   * Deals with the exception where the tree is empty
   * 
   * @param Item data
   */
  public void insert(Item data)
  {
      if(root == null)
      {
          root = new TreeNode(data);
      }
      else
      {
          insertHelper(root, data); 
      }
  }
  
  /**
   *  Inserts the specified element at the position in this tree. 
   *  Recursively inserts a new tree node to the existing tree
   *
   * @param  element  element to be inserted
   */
  private void insertHelper(TreeNode root, Item data)
  {  
    if (((Item)root.getValue()).getId() > ((Item)data).getId())//set to left
    {
        if (root.getLeft() == null)
            root.setLeft(new TreeNode(data));
        else
            insertHelper(root.getLeft(), data);
    }
    else 
    {
        if (root.getRight() == null)//set to right
            root.setRight(new TreeNode(data));
        else
            insertHelper(root.getRight(), data);
    }
  }
  
   /**
    * find method for the binary tree
    * 
    * @param data
    */
   public TreeNode find(int data) 
   {
        return findHelper(root, data);
    }

    /**
     * Recursive lookup for a value in the tree
     * 
     * @param TreeNode node
     * @param int data
     */
    private TreeNode findHelper(TreeNode node, int data) {
        // Root node is null so tree is empty
        if(node == null)
            return null;
    
        if(data == ((Item)node.getValue()).getId())
            return node;
    
        else if(data < ((Item)node.getValue()).getId())
            return findHelper(node.getLeft(), data);
    
        else
            return findHelper(node.getRight(), data);
    }

  /**
   * Allows the deletion of a node on the binary tree
   * 
   * @ Comparable target
   */
  public void delete(Comparable target)
  // post: deletes a node with data equal to target, if present,
  // preserving binary search tree property
  {
      root = deleteHelper(root, target);
  } 
  
  /**
   *  Removes the root occurrence of the specified element in
   *  this list. If the list does not contain the element, it
   *  is unchanged.
   *
   * @param  element  element to be removed from this list, if present.
   * @return          removes root element with matching element, if any.
   */
   
  private TreeNode deleteHelper(TreeNode node, Comparable target)
  // pre : node points to a non-empty binary search tree
  // post: deletes a node with data equal to target, if present,
  // preserving binary search tree property
  {
     if (node == null)
     {
        throw new NoSuchElementException();
    }
     else if (target.compareTo(node.getValue()) == 0)
     {
         return deleteTargetNode(node);
     }
     else if (target.compareTo(node.getValue()) < 0)
     {
         node.setLeft(deleteHelper(node.getLeft(), target));
         return node;
     }
     else //target.compareTo(root.getValue()) > 0
     {
         node.setRight(deleteHelper(node.getRight(), target));
         return node;
     }
  }
  
  /**
     * Recursivly searchs and then deletes the target node
     * 
     * @param TreeNode target
     * @return null
     */
    private TreeNode deleteTargetNode(TreeNode target)
    // pre : target points to node to be deleted
    // post: target node is deleted preserving binary search tree property
    {
         if (target.getRight() == null)
         {
             return target.getLeft();
         }
         else if (target.getLeft() == null)
         {
             return target.getRight();
         }
         else if (target.getLeft().getRight() == null)
         {
             target.setValue(target.getLeft().getValue());
             target.setLeft(target.getLeft().getLeft());
             return target;
         }
         else // left child has right child //Algo has been mirrored
         {
             TreeNode marker = target.getRight();
             while (marker.getLeft().getLeft() != null)
             {
                 marker = marker.getLeft();
             }
             target.setValue(marker.getLeft().getValue());
             marker.setRight(marker.getLeft().getRight());
             return target;
         }
    }

  /**
   *  Returns the number of elements in this list.
   *
   * @param TreeNode temp
   * @return    number of elements in this list.
   */
  public int count(TreeNode temp)
  {
    boolean deleted = false;
    int counter = 0;
    if (temp == null) 
        return counter;
    counter = count(temp.getLeft());
    counter++;//root node  
    counter = counter + count(temp.getRight());
    return counter;
  }
  
  /**
   * Totals the amount of nodes constructed
   */
  public void countHelper()
  {
    int total = count(root);
    System.out.println("There are " + total + " nodes");
  }
  
  /**
   *  Prints all the elements of the list
   */
  public void printList()
  {
    TreeNode temp = root;  // start from the root node
    while (temp != null)
    {
      System.out.println("ID: " + ((Item)temp.getValue()).getId() + " " + "Inventory: " +
                         ((Item)temp.getValue()).getInv());
      temp = temp.getLeft();  // go to next node
    }
  }

  /**
   *  Prints all the elements of the list in reverse order
   */
  public void printBackwards()
  {
    printBackwards(root);
  }

  /**
   *  Recursive helper method to print all the elements of
   *  the list in reverse order
   */
  private void printBackwards(TreeNode temp)
  {
    if(temp.getLeft() != null)//Continue iterating
    { 
        printBackwards(temp.getLeft());  //Call the method again to enter the recursive tunnel
        System.out.println("ID: " + ((Item)temp.getValue()).getId() + " Inventory: " + ((Item)temp.getValue()).getInv());
    }
    System.out.println();
  }

  /**
   *  Removes all of the elements from this list.
   */
  public void clear()
  {
    System.out.println("clear");
    root = null;
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

    TreeNode temp = root;  // start from the root node
    while (temp != null)
    {
      s += temp.getValue() + ", "; // append the data
      temp = temp.getLeft();      // go to next node
    }
    s += "]";
    return s;
  }
}
