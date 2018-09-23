
/**
 * The Cow class in the Farm. Returns the animals type and sound.
 *
 * @author Max Nova
 * @version 12/21/2017
 */
class Cow implements Animal
{
     protected String myType;
     protected String mySound;
     
     /**
      * Constructor for class Cow
      * 
      * @param type, sound
      */
     Cow(String type, String sound)
     {
         //Set contructor values
         myType = type;
         mySound = sound;
     }
     
     /**
      * Getter for the Cow class
      * 
      * @return mySound
      */
     public String getSound() 
     { 
         //returns the animal's sound
         return mySound; 
     }
     
     /**
      * Getter for the Cow class
      * 
      * @return myType
      */
     public String getType() 
     { 
         //returns the animal's type
         return myType; 
     }
}