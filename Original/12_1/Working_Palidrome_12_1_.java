/**
 * Working Palidrome contains a default constructor, input constructor and a calcPali method
 *
 * @author Max Novak
 * @version 10/24/2017
 */
public class Working_Palidrome_12_1
{   
    private String workString;//Input string
    
    /**
     * Default constructor Palidrome - initializes the name "abc" for workString
     */
    public Working_Palidrome_12_1()//Default constructor to input a value if there is no given input
    {
        workString = "abc";
    }
    
    /**
     * Input constructor Palidrome - initalizes the input from user into a private variable
     */
    public Working_Palidrome_12_1(String inputString)//Input constructor that converts the input value into a private int
    {
        workString = inputString;
    }
    
    /**
     * <b>summary</b>: provides a method to determine if an inputted string is a Palidrome
     * This method is void and only prints once a condition can be met
     * @param workString
     */
    public void calcPali(String workString)//Main Palidrome calculator
    {
        int stringLength1, indexCount1, stringLength2, indexCount2;//create counters
        String outputString = "", compareWorkString = workString, setToLowerCase, lowerWorkString, finalOutputString = "";//Create default strings, and such
        stringLength1 = workString.length();//Calculate character length
        indexCount1 = indexCount2 = 0;//Set counting index for the while loops
        
        if(stringLength1 == 1)//Determine if the input is 1 character/int in length
        {
            System.out.println("No, the string you entered is NOT a palindrome.");//Output that it is incorrect
        }
        else
            {
               lowerWorkString = workString.toLowerCase();//Convert the input to lowercase
               
                while(indexCount1 < stringLength1)
               {
                String charScanString;
                char charScan1;
                //String a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z;
                charScan1 = lowerWorkString.charAt(indexCount1);//Get char
                charScanString = Character.toString(charScan1);//Create string
                if(charScanString.equals("a")||charScanString.equals("b")||charScanString.equals("c")||charScanString.equals("d")||charScanString.equals("e")||charScanString.equals("f")||charScanString.equals("g")||charScanString.equals("h")||charScanString.equals("i")||charScanString.equals("j")||charScanString.equals("k")||charScanString.equals("l")||charScanString.equals("m")||charScanString.equals("n")||charScanString.equals("o")||charScanString.equals("p")||charScanString.equals("q")||charScanString.equals("r")||charScanString.equals("s")||charScanString.equals("t")||charScanString.equals("u")||charScanString.equals("v")||charScanString.equals("w")||charScanString.equals("x")||charScanString.equals("y")||charScanString.equals("z")||charScanString.equals("0")||charScanString.equals("1")||charScanString.equals("2")||charScanString.equals("3")||charScanString.equals("4")||charScanString.equals("5")||charScanString.equals("6")||charScanString.equals("7")||charScanString.equals("8")||charScanString.equals("9"))
                 {
                      outputString = outputString + charScanString;//Compares the entire alphabet and all digits
                 }
            
                 indexCount1++;//increment
               }
               
               stringLength2 = outputString.length();
               while(indexCount2 < stringLength2)
               {
                   String charScanStringFinal;
                   char charScan2;
                   
                   charScan2 = outputString.charAt(stringLength2 - 1);//Take the last character of the input
                   charScanStringFinal = Character.toString(charScan2);
                   
                   finalOutputString = finalOutputString + charScanStringFinal;//Create the final reversed string
                   
                   stringLength2--;//decrement
               }
               
               if(outputString.equalsIgnoreCase(finalOutputString))//
               {
                   System.out.println("Yes, the string you entered is a palindrome.");//If Palidrome then output YES
               }
               else
                   {
                       System.out.println("No, the string you entered is NOT a palindrome.");//If not output NO
                   }
            }
    }
}