/**
 * Highest class on the inheritance tree. This class sets the 3 parameters of age, name, and gender
 *
 * @author Max Nova
 * @version 10/31/2017
 * 
 * @param name, age, gender
 * @return toString(), getName, getAge, and getGender
 */
class Person
{
    protected String myName ; // name of the person
    protected int myAge; // person's age
    protected String myGender; // "M" for male, "F" for female
    // constructor
    /**
     * Input constructor. Highest in inheritance.
     * 
     * @param name, age, gender
     */
    public Person(String name, int age, String gender)
    {
        myName = name; myAge = age ; myGender = gender;
    }
    
    /**
     * toString method. Sets the toString methods for all subclasses
     * 
     * @return myName, myAge, myGender
     */
    public String toString()
    {
        return myName + ", age: " + myAge + ", gender: " +myGender; //Default toString to use for other classes
    }
    
    /**
     * Getter for name.
     * 
     * @return myName
     */
    public String getName()
    {
        return myName; 
    }
    
    /**
     * Getter for gender.
     * 
     * @return myGender
     */
    public String getGender()
    {
        return myGender;
    }
    
    /**
     * Getter for age.
     * 
     * @return myAge
     */
    public int getAge()
    {
        return myAge;
    }
    
    /**
     * Setter for myName.
     * 
     * @param name
     */
    public void setName(String name)
    {
        myName = name; // set para to private
    }
    
    /**
     * Setter for myGender.
     * 
     * @param gender
     */
    public void setGender(String gender)
    {
        myGender = gender; // set para to private
    }
    
    /**
     * Setter for myAge
     * 
     * @param age
     */
    public void setAge(int age)
    {
        myAge = age; // set para to private
    }
}