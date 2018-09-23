
/**
 * ArrayStack class which implements a Stack interface. ArrayList is the data structure used
 *
 * @author Max N
 * @version  6/5
 */
public class ArrayStack implements Stack
{
     private java.util.ArrayList array;
     
     public ArrayStack()
     { 
         array = new java.util.ArrayList();
     }
     
     public boolean isEmpty() 
     { 
         return array.size() == 0;
     }
     
     public void push(Object obj) 
     { 
         array.add(obj);
     }
     
     public Object pop() 
     {
         return array.remove(array.size() - 1);
     }
     
     public Object peekTop()
     {
         return array.get(array.size() - 1);
     }
}