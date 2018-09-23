/**
 *  Implementation of a node of a Binary Tree.
 *
 *  Adapted from the College Board's AP Computer Science AB:
 *  Implementation Classes and Interfaces.
 */
public class TreeNode
{
  private Object myValue;
  private TreeNode left;
  private TreeNode right;

  /**
   *  Constructs a new element with object initValue,
   *  followed by next element
   *
   * @param  initValue  New element object
   * @param  initLeft   Reference to left node
   * @param  initRight   Reference to right node
   */
  public TreeNode()
  {
      myValue = 0;
      left = null;
      right = null; 
  }

  /**
   *  Constructs a new element with object initValue,
   *
   * @param  initValue  New element object
   */
  public TreeNode(Object value)
  {
      myValue = value; 
      left = null;
      right = null; 
  }
  
  /**
   *  Returns the value stored in the Item
   *
   * @return  Object,value - Data stored within the item
   */
  public Object getValue()
  { 
      return myValue;
  }
  
  /**
   *  Returns a pointer to the node left of the current
   *
   * @return  TreeNode,left - Pointer to the leftwards data
   */
  public TreeNode getLeft()
  {
      return left;
  }
  
  /**
   *  Returns a pointer to the node right of the current
   *
   * @return  TreeNode,right - Pointer to the rightwards data
   */
  public TreeNode getRight()
  {
      return right;
  }
  
  /**
   *  Set the value of a node
   *
   * @param  Object theNewValue
   */
  public void setValue(Object theNewValue)
  {
      myValue = theNewValue;
  }
  
  /**
   *  Set the value of the left node
   *
   * @param  TreeNode theNewLeft
   */
  public void setLeft(TreeNode theNewLeft)
  {
      left = theNewLeft;
  }
  
  /**
   *  Set the value of the right node
   *
   * @param  TreeNode theNewRight
   */
  public void setRight(TreeNode theNewRight)
  {
      right = theNewRight;
  }
}
