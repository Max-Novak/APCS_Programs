import apcslib.*;
import chn.util.*;
/**
 * Output change of a purchase.
 *
 * @author Max N
 * @version Sept. 6
 */
public class Change4_1
{
    public static void main(String []args)
    {
        //Declare all the values in memory
        double totalCost, cashTendered, tempChange, change;
        int quarter, dime, nickel, penny;
        
        //Instantiate objects
        ConsoleIO keyboard = new ConsoleIO();
        
        //Prompt user for cost of purchase
        System.out.println("Enter the total cost of the purchase: ");
        totalCost = keyboard.readDouble();
        
        //Prompt user for the cash tendered
        System.out.println("Enter the total cash tendered: ");
        cashTendered = keyboard.readDouble();
        
        //Print string
        System.out.println("Amount of coins needed: ");
        
        //Calculate final change
        tempChange = cashTendered - totalCost;
        tempChange = tempChange - (int) tempChange + 0.00001;
        change = (int)(tempChange * 100);
        
        //Print change
        System.out.println("  " + (int)change + " cents =");
        
        //Calculate all values for the coins
        quarter = (int)(change / 25);//Find quarters
        change = (change % 25);
        
        dime = (int)(change / 10);//Find dimes
        change = (change % 10);
        
        nickel = (int)(change / 5);//Find nickels
        change = (change % 5);
        
        penny = (int)(change);//Find pennies
        
        //Print change for each coin
        System.out.println("    " + quarter + " quarter(s)");
        System.out.println("    " + dime + " dime(s)");
        System.out.println("    " + nickel + " nickel(s)");
        System.out.println("    " + penny + " penny/pennies");
        
    }
}
