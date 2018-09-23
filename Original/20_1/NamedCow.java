
/**
 * The Cow class in the Farm. Returns the animals type and sound.
 *
 * @author Max Nova
 * @version 12/21/2017
 */
class NamedCow extends Cow implements Animal
{
     private String myName;
     
     /**
      * Constructor for the Cow class
      * 
      * @param type, name, sound
      */
     NamedCow(String type, String name, String sound)
     {
         //Inherits from the Cow class
         super(type, sound);
         myName = name;
     }
     
     /**
      * Getter for the Cow class.
      * 
      * @return mySound
      */
     public String getSound() 
     {
         //return type
         return mySound; 
     }
     
     /**
      * Getter for the Cow class.
      * 
      * @return myType
      */
     public String getType() 
     {
         //return type
         return myType; 
     }
     
     /**
      * Getter for the Cow class.
      * 
      * @return myName
      */
     public String getName()
     {
         //return name
         return myName;
     }
}
