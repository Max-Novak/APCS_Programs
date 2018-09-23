
import apcslib.*;
import chn.util.*;
/**
 * Write a description of class Lab5_2 here.
 *
 * @author Max N
 * @version Sept 11
 */
public class Lab5_2
{
    public static void main(String[] args)
    {
        //Create the 3 variables for the quadratic
        double a, b ,c, root1, root2, power;
        
        //Create new input class
        ConsoleIO input = new ConsoleIO();
        
        //Enter the a value
        System.out.println("Enter the a value for the quadratic: ");
        a = input.readDouble();
        
        //Enter the b value
        System.out.println("Enter the b value for the quadratic: ");
        b = input.readDouble();
        
        //Enter the c value
        System.out.println("Enter the c value for the quadratic: ");
        c = input.readDouble();
        
        //Compute the power
        power = (b * b) - (4 * a * c);
        
        //Compute the first root
        root1 = ( -b + Math.sqrt(power)) / (2 * a);
        
        //Compute the second root
        root2 = ( -b - Math.sqrt(power)) / (2 * a);
        
        //Output roots
        System.out.println("__________________________");
        //System.out.println(root1 + " and " + root2 + " are the roots of this quadratic.");
        
        //Output the roots by 4 decimal places
        System.out.println(Format.left(root1, 0, 4));
        System.out.println(Format.left(root2, 0, 4));
        
    }
}
