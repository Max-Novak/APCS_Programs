/**
 *  Implementation of a node of a singly linked list.
 *
 *  Adapted from the College Board's AP Computer Science AB:
 *  Implementation Classes and Interfaces.
 */
public class DNode
{
  private Object value;
  private DNode next;
  private DNode previous;
  
  /**
   *  Constructs a new element with object initValue,
   *  followed by next element
   *
   * @param  initValue  New element object
   * @param  initNext   Reference to next element
   */
  public DNode(Object initValue, DNode initNext, DNode initPrevious)
  {
    value = initValue;
    next = initNext;
    previous = initPrevious;
  }

  /**
   *  Constructs a new tail of a list with object initValue
   *
   * @param  initValue  New element object
   */
  public DNode(Object initValue)
  {
    this(initValue, null, null);
  }

  /**
   *  Sets the value attribute of the ListNode object
   *
   * @param  theNewValue  value attribute of the ListNode object
   */
  public void setValue(Object theNewValue)
  {
    value = theNewValue;
  }

  /**
   *  Sets reference to new next value
   *
   * @param  theNewNext  The new next value
   */
  public void setNext(DNode theNewNext)
  {
    next = theNewNext;
  }
  
  /**
   *  Sets reference to new next value
   *
   * @param  theNewNext  The new next value
   */
  public void setPrevious(DNode theNewPrevious)
  {
    previous = theNewPrevious;
  }

  /**
   *  Returns value associated with this element
   *
   * @return    The value associated with this element
   */
  public Object getValue()
  {
    return value;
  }

  /**
   *  Returns reference to next value in list
   *
   * @return    The next value in the list
   */
  public DNode getNext()
  {
    return next;
  }
  
  /**
   *  Returns reference to next value in list
   *
   * @return    The next value in the list
   */
  public DNode getPrevious()
  {
    return previous;
  }
}
