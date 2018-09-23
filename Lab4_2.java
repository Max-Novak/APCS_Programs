import apcslib.*;
import chn.util.*;
/**
 * Input make,model and license. Output make,model, and converted license.
 *
 * @author Max Nova
 * @version Sept 8
 */
public class Change4_2
{
    public static void main(String[] args)
    {
      //Declare the types of data to store
      String make, model, licenseChar, licenseString;
      int licenseInt, index0, index1, index2, allIndex, sumAllIndex_LicenseInt, remainder;
      char licenseLetter;
      //Instan
      ConsoleIO input = new ConsoleIO();
      
      //formatting
      System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
      
      //ask for make
      System.out.println("Enter the make of the car: ");
      make = input.readLine();
      
      //ask for model
      System.out.println("Enter the model of the car: ");
      model = input.readLine();
      
      //ask for license
      System.out.println("Enter the license plate: ");
      licenseChar = input.readToken();
      licenseInt = input.readInt();
      
      
      //Find the ascii value at index1
      index0 = licenseChar.charAt(0);
      //Find the ascii value at index2
      index1 = licenseChar.charAt(1);
      //Find the ascii value at index3
      index2 = licenseChar.charAt(2);
      
      //Add ASCII values of the letters
      allIndex = index0 + index1 + index2;
      
      //Add allIndex + LicenseInt
      sumAllIndex_LicenseInt = allIndex + licenseInt;
      
      //Find the offset of letters from the sum
      remainder = sumAllIndex_LicenseInt % 26;
      
      //find the letter to use
      licenseLetter = (char)(65 + remainder);
      
      //Concatenate remainder offset + sum
      System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
      System.out.println("Make = " + make);
      System.out.println("Model = " + model);
      System.out.println(licenseChar + " " + licenseInt + " = " + licenseLetter + sumAllIndex_LicenseInt);
      System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}