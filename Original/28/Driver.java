import chn.util.*;
/**
 * Driving class for the CheckAccount working class.
 *
 * @author Max Nova
 * @version Mar 2, 2018
 */
public class Driver
{
   public static void main(String[] args)
   {
       //Declare of vars
       ConsoleIO input = new ConsoleIO();
       double inputNum;
       int initalChk = 1, depChk = 1, drawChk = 1;
       CheckingAccount checking = new CheckingAccount();
       
       System.out.println("ErrorFreeChecking Test\n");

       //While loop that checks if the creation of the account was correct and
       //satisfied the correct parameters
       while(initalChk != 0)
       {
           System.out.print("Please enter the starting balance: ");
           inputNum = input.readDouble();
           
           //Test for error block (if bal is -)
           try
           {
               checking = new CheckingAccount(inputNum);
               initalChk = 0;
           }
           catch(IllegalArgumentException e)
           {
               System.out.println("Error CheckingAccount: negative initial balance\n");
           }
       }
       
       System.out.println("\nAccount opened with balance of " + checking.getBalance() + "\n");
       
       //While loop that checks if the deposit for the account was correct and
       //satisfied the correct parameters
       while(depChk != 0)
       {
           System.out.print("Please enter the amount to deposit: ");
           inputNum = input.readDouble();
           
           //Test for error block (if deposit is -)
           try
           {
               checking.deposit(inputNum);
               depChk = 0;
               System.out.println("\nDeposit made. Current account balance = " + checking.getBalance() + "\n");
           }
           catch(IllegalArgumentException e)
           {
               System.out.println("Error deposit: negative amount\n");
           }
       }
       
       //While loop that checks if the withdrawl for the account was correct and
       //satisfied the correct parameters
       while(drawChk != 0)
       {
           System.out.print("Please enter the amount to withdraw: ");
           inputNum = input.readDouble();
           
           //Test for error block (if deposit is -)
           try
           {
               checking.withdraw(inputNum);
               drawChk = 0;
           }
           catch(IllegalArgumentException e)
           {
               System.out.println("Error withdraw: illegal amount\n");
           }
       }
       
       System.out.println("\nWithdrawal made. Current account balance = " + checking.getBalance());
       System.out.print("Thank you for using ErrorFreeChecking...goodbye!");
   }
}
