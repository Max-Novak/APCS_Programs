import java.util.*;

/**
 * The Chick class in the Farm. Returns the animals type and sound.
 *
 * @author Max Nova
 * @version 12/21/2017
 */
class Chick implements Animal
{
     private String myType;
     private String mySoundYoung;
     private String mySoundOld;
     
     /**
      * Constructor for the Chick class.
      * 
      * @param type, sound
      */
     Chick(String type, String sound)
     {
         //Sets the type and old sound
         myType = type;
         mySoundYoung = sound;
         mySoundOld = "test";
     }
     
     /**
      * Constructor for the Chick class.
      * 
      * @param type, soundOne, soundTwo
      */
     Chick(String type, String soundOne, String soundTwo)
     {
         //Sets the type and diff sounds
         myType = type;
         mySoundYoung = soundOne;
         mySoundOld = soundTwo;
     }
     
     /**
      * Getter for the Chick class. Has a 1/2 chance of either old sound or new sound.
      * 
      * @return mySoundYoung, mySoundOld
      */
     public String getSound() 
     {
         //Create Random class
         Random rand = new Random();
         int i;
         i = rand.nextInt(2);
         //If only 1 parameter is passed
         if(mySoundOld.equals("test"))
         {
             return mySoundYoung;
         }
            
         //If the random num is 0 then it young
         if(i == 0)
         {
             return mySoundYoung; 
         }
            else
            {
                return mySoundOld;
            }   
     }
        
     /**
      * Getter for the Chick class.
      * 
      * @return myType
      */
     public String getType() 
     {
         //Returns the type
         return myType; 
     }
}
