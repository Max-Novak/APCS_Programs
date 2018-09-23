/**
 * Working class for creating a checkingAccount. Contains 3 methods to view
 * balance, deposit, and retract funds.
 *
 * @author Max Nova
 * @version Mar 2, 2018
 */
class CheckingAccount
{
    private double myBalance;
    
    /**
     * Default constructor for no input. Sets account balance to 0
     */
    public CheckingAccount()
    {
        myBalance = 0;
    }
         
    /**
     * Defined constructor. Sets account balance to users object creation
     */
    public CheckingAccount(double initialBalance)
    {
        myBalance = initialBalance;
        //Sends error if account is created with negative bal
        if(initialBalance < 0) 
        {
            throw new IllegalArgumentException();
        }
    }
          
    /**
     * Returns balance of the account
     * 
     * @return myBalance
     */
    public double getBalance()
    {
        return myBalance;
    }
    
    /**
     * Allows user to deposit into their account
     * 
     * @param amount
     */
    public void deposit(double amount)
    {
        //Sends error if account deposit is negative bal
        if(amount < 0) 
        {
            throw new IllegalArgumentException();
        }
        myBalance =  myBalance + amount;
    }
    
     /**
     * Allows user to withdraw from their account
     * 
     * @param amount
     */
    public void withdraw(double amount)
    {
        //Sends error if account withdraw is out of bounds
        if(amount < 0 || amount > getBalance()) 
        {
            throw new IllegalArgumentException();
        }
        myBalance =  myBalance - amount;
    } 
}