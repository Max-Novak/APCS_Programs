/**
 * Object to hold values and be able to compare them.
 * Comparability allows them to be sortable.
 * 
 * @author Max Nova
 * @version 2/26/2018
 */
public class Item implements Comparable
{
    //Declare the values held by Item
    private int myId;
    private int myInv;
 
    /**
     * Constructor for Item. Holds the attributes of the file.
     * 
     * @param id
     * @param inv
     */
    public Item(int id, int inv)
    {
        //Assign the input to private variables
        myId = id;
        myInv = inv;
    }
 
    /**
     * Getter for the private int myId.
     * 
     * @return myId
     */
    public int getId()
    {
        //return myId
        return myId;
    }  
 
    /**
     * Getter for the private int myInv.
     * 
     * @return myInv
     */
    public int getInv()
    {
        //return myInv
        return myInv;
    }
 
    /**
     * Allows id numbers to be compared. Helps the sort algo work.
     * 
     * @param otherObject
     * @return myId - right.myId
     */
    public int compareTo(Object diffObject)
    {
        //Equally can be checked by subtracting 1 value by the other. If they are 0 then they
        //are inherently equal
        Item right = (Item)diffObject;
        return myId - right.myId;
    }
 
    /**
     * Checks for equality. Used in conjunction with compareTo.
     * 
     * @return compareTo(otherObject) == 0
     */
    public boolean equals(Object otherObject)
    {
        //Converts the int comparision into a boolean value
        return compareTo(otherObject) == 0;
    }
 
    /**
     * @Override
     * Overrides the toString method to output the formatted ID and INV
     * 
     * @return "myID = " + myId + "myInv = " + myInv
     */
    public String toString()
    {
        //Format string output
        return "myID = " + myId + "myInv = " + myInv;
    }
}
 
