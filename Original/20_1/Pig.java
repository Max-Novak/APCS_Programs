
/**
 * Pig class in the farm.
 *
 * @author Max Nova
 * @version 12/21/2017
 */
class Pig implements Animal
{
     private String myType;
     private String mySound;
     
     /**
      * Constructor for the Pig class.
      * 
      * @param type, sound
      */
     Pig(String type, String sound)
     {
         //Sets the type and sound
         myType = type;
         mySound = sound;
     }
     
     /**
      * Getter for the Pig class.
      * 
      * @return mySound
      */
     public String getSound() 
     {
         //Return the sound
         return mySound; 
     }
     
     /**
      * Getter for the Pig class.
      * 
      * @return myType
      */
     public String getType() 
     {
         //Return the type
         return myType; 
     }
}
