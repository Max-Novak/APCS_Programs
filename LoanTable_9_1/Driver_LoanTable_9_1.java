import chn.util.*;
/**
 * Driver for the LoanTable class. Reads input from the user and creates an object using those arguments. Then it calculates the monthly mortgage.
 *
 * @author Max Nova
 * @version 10/10/2017
 */
public class Driver_LoanTable_9_1
{
    public static void main(String[] args)
    {
        double mortgage, time, lowRate, highRate; //Create the input variables required to correctly calculate monthly mortgage
        
        ConsoleIO input = new ConsoleIO();
        
	//////// Take input

        System.out.println("Enter your principle amount: ");
        mortgage = input.readDouble();
        
        System.out.println("Enter the number of years: ");
        time = input.readDouble();
        
        System.out.println("Enter the lowest interest rate: ");
        lowRate = input.readDouble();
        
        System.out.println("Enter the highest interest rate: ");
        highRate = input.readDouble();
	
	/////////
        
        Working_LoanTables_9_1 loanCalc = new Working_LoanTables_9_1(mortgage, time, lowRate, highRate); //Create the LoanTable object
        
        System.out.println();
        System.out.println("Interest       Monthly payment");
        
        loanCalc.calcPrinciple(); //Call the method and ouput the monthly mortgage
    }
}