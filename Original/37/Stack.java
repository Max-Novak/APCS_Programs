
/**
 * Interface for implementing a stack. Requires the ability to push, pop, check the top and check if the stack is empty
 *
 * @author Max N
 * @version 6/5
 */
public interface Stack
{
    boolean isEmpty();
    
    void push(Object x);
    
    Object pop();
    
    Object peekTop();
}