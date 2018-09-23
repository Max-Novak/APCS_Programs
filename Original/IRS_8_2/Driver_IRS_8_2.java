import apcslib.*;
import chn.util.*;
/**
 * Driver class that allows a user to input their status (single or married) and their income 
 * to output their Federal tax.
 *
 * @author Max N
 * @version 9/29/2017
 */
public class Driver_IRS_8_2
{
    public static void main(String[] args)
    {
        /**
         * Main class used for user interaction.
         * Declaration of instance variables, instansiation, and inputs are taken. The Driver calls the Working class after it has completed it's work and outputs the fedTax.
         */
        double income;
        String status;
        
        ConsoleIO input = new ConsoleIO();
        
        System.out.println("Type all input in lowercase. Enter whether you are single or married: ");
        status = input.readToken();
        
        System.out.println("Type input without $ or commas. Enter your yearly income: ");
        income = input.readDouble();
        
        Working_IRS_8_1 calcIRS = new Working_IRS_8_1(status, income);
        
        System.out.println("Your yearly Federal tax is $" + Format.left(calcIRS.calculateFedTax(), 2, 2));
        
    }
}