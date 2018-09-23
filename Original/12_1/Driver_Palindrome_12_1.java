import chn.util.*;
/**
 * The driving class for Palindrome. This class consists of main and loops through a question asking "Do you want to input more Palidrome."
 *
 * @author Max Novak
 * @version 10/24/2017
 */
public class Driver_Palindrome_12_1
{
   public static void main(String[] args)
   {
       String outputVar;
       String testString = "a";
       
       ConsoleIO input = new ConsoleIO();//Instansiate the object
       Working_Palidrome_12_1 work = new Working_Palidrome_12_1();
       System.out.println("Welcome to the Palindrome Program!");
       System.out.println();
       
       while(testString.equals("a"))
       {
           System.out.print("Enter a string: ");
           outputVar = input.readLine();//Get the input
           work.calcPali(outputVar);//put the input into the method
           System.out.println();
           System.out.println("Do you want to continue? Type q to stop or a to continue: ");
           testString = input.readLine();//Determine to continue loop or not
       }
   }
}