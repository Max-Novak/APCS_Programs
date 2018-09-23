/**
 * Working class that calculates the tax of 2 different if/else branches.
 * First the comparison between single and married is made. Then the comparison
 * between tax brackets is made. Then the class outputs the tax into the driver.
 *
 * @author Max Nova
 * @version Sept27,2017
 */
public class Working_IRS_8_1
{
    //Declaration of the private variables used within the class
    
    private String myStatus;
    private double myIncome;
    private double fedTax;
    
    /**
     * Default constructor that sets the values to defaults
     */
    public Working_IRS_8_1()
    {
        myStatus = "single";
        myIncome = 0;
    }
    
    /**
     * Defined constructor that takes input of status and income from the driver class
     */
    public Working_IRS_8_1(String status, double income)
    {
        myStatus = status;
        myIncome = income;
    }

    //Single status
    /**
     * <b>summary</b>: A nest of if, elif, and else statements that return the fedTax to the Driver.
     * Returns a Double.
     */
    public double calculateFedTax()
    {
        if (myStatus.equals("married"))
        {
            if (myIncome <= 45200 && myIncome >= 0) 
            {
                fedTax = .15 * (myIncome - 0);
            }
                else
                if (myIncome <= 109250 && myIncome > 45200)
                {
                    fedTax = 6780 + .275 * (myIncome - 45200);
                }
                    else
                    if (myIncome <= 166500 && myIncome > 109250)
                    {
                        fedTax = 24393.75 + .305 * (myIncome - 109250);
                    }
                        else
                        if (myIncome <= 297350 && myIncome > 166500)
                        {
                            fedTax = 41855 + .355 * (myIncome - 166500);
                        }
                            else
                            if (myIncome > 297350)
                            {
                                fedTax = 88306 + .391 * (myIncome - 297350);
                            }   
        } 
        
        if (myStatus.equals("single"))
        {
            if (myIncome <= 27050 && myIncome >= 0) 
            {
                fedTax = .15 * (myIncome - 0);
            }
                else
                if (myIncome <= 65550 && myIncome > 27050)
                {
                    fedTax = 4057.5 + .275 * (myIncome - 27050);
                }
                    else
                    if (myIncome <= 136750 && myIncome > 65550)
                    {
                        fedTax = 14645 + .305 * (myIncome - 65550);
                    }
                        else
                        if (myIncome <= 297350 && myIncome > 136750)
                        {
                            fedTax = 36361 + .355 * (myIncome - 136750);
                        }
                            else
                            if (myIncome > 297350)
                            {
                                fedTax = 93374 + .391 * (myIncome - 297350);
                            }
        }
        return fedTax;
    }
     
}