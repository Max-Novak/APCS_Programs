import apcslib.*;
import java.lang.*;
/**
 * This program stores and solves math expressions.
 *
 * @author Max N
 * @version 9/1/2017
 * LAB 3    
 */
public class MathFun
{
   
    public static void main(String[] args)
    {
        //Print two equations as strings
        String string1 = "2 + 3 = 5";
        System.out.println(string1);
        String string2 = "17 % 4 = 1";
        System.out.println(string2);
        
        //Store the values of the expressions inside an identifier
        //Display the stored value 
        int int1 = 4 + 9;
        System.out.println("4 + 9 = " + int1);
        
        double double1 = 46 / 7;
        System.out.println("46 / 7 = " + double1);
        
        int int2 = 46 % 7;
        System.out.println("46 % 7 = " + int2);
        
        double double2 = 2 * 3.0;
        System.out.println("2 * 3.0 = " + double2);
        
        double double3 = (double)25 / 4;
        System.out.println("(double)25 / 4 = " + double3);
        
        int int3 = (int) 7.75 + 2;
        System.out.println("(int) 7.75 + 2 = " + int3);
        
        int int4 = (int) 'P';
        System.out.println("(int) 'P' = " + int4);
        
        char char1 = (char)105;
        System.out.println("(char)105 = " + char1);
        
        //Print out all range constraints of all primitive data types. (Lowest and greatest values for each)
        System.out.println("The largest value of type byte = " + Byte.MAX_VALUE );
        System.out.println("The smallest value of type byte = " + Byte.MIN_VALUE );
        System.out.println("The largest value of type short = " + Short.MAX_VALUE);
        System.out.println("The smallest value of type short = " + Short.MIN_VALUE);
        System.out.println("The largest value of type char = " + (int)Character.MAX_VALUE);
        System.out.println("The smallest value of type char = " + (int)Character.MIN_VALUE);
        System.out.println("The largest value of type int = " + Integer.MAX_VALUE);
        System.out.println("The smallest value of type int = " + Integer.MIN_VALUE);
        System.out.println("The largest value of type long = " + Long.MAX_VALUE);
        System.out.println("The smallest value of type long = " + Long.MIN_VALUE);
        System.out.println("The largest value of type float = " + Float.MAX_VALUE);
        System.out.println("The smallest value of type float = " + Float.MIN_VALUE);
        System.out.println("The largest value of type double = " + Double.MAX_VALUE);
        System.out.println("The smallest value of type double = " + Double.MIN_VALUE);
    }
    
}
