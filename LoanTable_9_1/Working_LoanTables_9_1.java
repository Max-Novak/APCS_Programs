import chn.util.*;
import apcslib.*;
/**
 * Working class for LoanTable. Contains 1 default constructor, 1 input constructor, and has one calc method to output the monthly mortgage
 *
 * @author Max Nova
 * @version 10/10/2017
 */
 public class Working_LoanTables_9_1
    {
        private double myPrinciple;//Stores total mortgage
        private double myTime;//Stores the input from user of time in years
        private double myLowRate;//Stores the input from user in lowest interest rate
        private double myHighRate;//Stores the input from user in highest interest rate
        
        public Working_LoanTables_9_1() //Default constructor
        {
          myPrinciple = 0;//Set default mortgage
          myTime = 0;//Set default time value (years)
          myLowRate = 0;//Set default low rate
          myHighRate = 0;//Set default high rate
        }
        
        public Working_LoanTables_9_1(double mortgage, double time, double lowRate, double highRate) //Input constructor 
        {
            myPrinciple = mortgage;//Take input of mortgage and set to private var
            myTime = time;//Take input of time and set to private var
            myLowRate = lowRate;//Take input of lowrate and set to private var
            myHighRate = highRate;//Take input of highrate and set to private var
        }
        
	/**
	* @param myLowRate, myTime, myPrinciple, myHighRate
	* This method ouputs the monthly mortgage using 4 variables. myMortgage is the full equation required for this action.
	* A While loop is used to show increment costs of differing interest percentages.
	* myMortgage must always be a double because it is a value of currency.
	*/
        public void calcPrinciple()
        {
            while (myLowRate <= myHighRate) //While loop to determine that it must increment
            {
                double myMortgage;
                
                double k = ((myLowRate/100)/12.0);
                double n = (myTime*12);
                double c = Math.pow((1+k), n);
                
                myMortgage = (myPrinciple*k*c)/(c - 1);//Full equation
                System.out.println(myLowRate + "           " + Format.left(myMortgage, 0, 2)); //Format 2 decimal places 
                myLowRate += .25; //increment
            }
        }
    }