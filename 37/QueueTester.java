import chn.util.*;
import java.util.*;

/**
 * Allows users to input values in Reverse notation and acts as a simple calcualtor to evaulate input
 *
 * @author Max N
 * @version June 9
 */
public class QueueTester
{
   public static void main(String[] args)
  {
    ListQueue queue = new ListQueue();//instantiates queue, stack, and the actual tester class
    QueueTester tester = new QueueTester();
    ArrayStack stack = new ArrayStack();

    tester.mainMenu(queue, stack);
  }
  
  /**
   *  Input menu
   *  Takes in user input and acts as client
   *  
   *  @param ListQueue queue
   *  @param Stack stack
   */
  public void mainMenu (ListQueue queue, ArrayStack stack)
  {
    int total = 0;//aggregated total during the run
    String userInput = "";
    ConsoleIO console = new ConsoleIO();//allows user input
    System.out.println("Queue algorithm calculator\n");
    
    do
    {
      System.out.print(total + "  next input: ");//print running aggregated total
      userInput = console.readLine();//read input as a string
      
      if(!(userInput.equals("q") || userInput.equals("Q")))//enqueue if the input is not Q or q
        queue.enqueue(userInput);
      
      if(userInput.matches(".*[0-9].*"))//push onto the stack only digits
        stack.push(userInput);
      
      if(!(stack.isEmpty()) && (!(userInput.matches(".*[0-9].*"))) && (!((userInput.toLowerCase()).equals("q"))))
      {//not empty + not a digit + does not equal q
          int initTemp = Integer.parseInt(((String)stack.pop()));//pop two values off the stack
          int secondTemp = Integer.parseInt(((String)stack.pop()));
          
          if(userInput.equals("-"))//if the input is a subtraction operator
          {
              stack.push(String.valueOf(secondTemp - initTemp));//push computed string
              total = secondTemp - initTemp;//sub from total
          }
          else
          {
              if(userInput.equals("/"))//if the input is a division operator
              {
                  stack.push(String.valueOf(secondTemp / initTemp));//push computed string
                  total = secondTemp / initTemp;//divide from total
              }
              else
              {
                  if(userInput.equals("+"))//if the input is a addition operator
                  { 
                      stack.push(String.valueOf(secondTemp + initTemp));//push computed string
                      total = secondTemp + initTemp;//add from total
                  }
                  else
                  {
                      if(userInput.equals("*"))//if the input is a multiplication operator
                      {
                          stack.push(String.valueOf(secondTemp * initTemp));//push computed string
                          total = secondTemp * initTemp;//multiply from total
                      }
                  }
              }
          }
      }

      System.out.println();
    }
    while (userInput.charAt(0) != 'Q' && userInput.charAt(0) != 'q');
    
    System.out.println("\n\n");
    
    do 
    {
        System.out.print(queue.dequeue() + " ");//print out a list of all inputs
    }
    while(!queue.isEmpty());
    
    System.out.print(" =  " + stack.peekTop());//print final
  }
}
