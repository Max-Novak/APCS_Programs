
/**
 * Driver for the Farm classes and Farm. Outputs 3 predefined strings and 4 somewhat randomized strings that occur during run time
 *
 * @author Max Nova
 * @version 12/21/2017
 */
class OldMacDonald
{
     public static void main(String[] args)
     {
         //Instansiate the classes
         Cow c = new Cow("cow", "moo");
         Chick ch = new Chick("chick", "cheep", "cluck");
         Pig p = new Pig("pig", "oink");
         
         //Output the first set data
         System.out.println( c.getType() + " goes " + c.getSound() );
         System.out.println( ch.getType() + " goes " + ch.getSound() );
         System.out.println( p.getType() + " goes " + p.getSound() );
         
         Farm farm = new Farm();
         
         //Output the data that may change
         farm.animalSounds();
     }
} 