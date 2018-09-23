
/**
 * Enters the values into an array and randomizes an output during run time and picks a value from the array.
 *
 * @author Max Nova
 * @version 12/21/2017
 */
class Farm
{
     //Creates new array
     private Animal[] a = new Animal[3];
     
     /**
      * Constructor for the Farm class. Enters the values into the array.
      */
     Farm()
     {
         a[0] = new NamedCow("cow","Elsie","moo");
         a[1] = new Chick("chick","cheep","cluck");
         a[2] = new Pig("pig","oink");
     }
     
     /**
      * Sound method for the farm. Outputs the animals sounds and the name of the cow.
      */
     public void animalSounds()
     {
         //Loops through the type and sound of each animal
         for (int i = 0; i < a.length; i++)
         {
             System.out.println(a[i].getType() + " goes " + a[i].getSound());
         }
         
         //Prints the name of the cow
         System.out.println("The cow is known as " +
         ((NamedCow)a[0]).getName());
     }
} 