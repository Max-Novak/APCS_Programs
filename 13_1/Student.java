/**
 * Student is the 2cd layer of inheritance from person. It adds the variables id number, and gpa while also containing their getters and settiers.
 *
 * @author Max nova
 * @version 10/31/2017
 *
 * @param name, age, gender, idNum, gpa
 * @return getGPA, getIdNum
 */
class Student extends Person
{
    protected String myIdNum; // Student Id Number
    protected double myGPA; // grade point average
    // constructor
    /**
     * Input constructor for Student.
     * 
     * @param name, age, gender, idNum, gpa
     */
    public Student(String name, int age, String gender,
    String idNum, double gpa)
    {
        // use the super class' constructor
        super(name, age, gender);
        // initialize what's new to Student
        myIdNum = idNum;
        myGPA = gpa;
    }
    
    /**
     * Getter for idNum.
     * 
     * @return myIdNum
     */
    public String getIdNum()
    {
        return myIdNum;//getter of id
    }
    
    /**
     * Getter for gpa.
     * 
     * @return myGPA
     */
    public double getGPA()
    {
        return myGPA;//getter of gpa
    }
    
    /**
     * Setter for idNum
     * 
     * @param idNum
     */
    public void setIdNum(String idNum)
    {
        myIdNum = idNum;//setter of id
    }
    
    /**
     * Setter for gpa.
     * 
     * @param gpa
     */
    public void setGPA(double gpa)
    {
        myGPA = gpa;//setter of gpa
    }
    
    /**
     * toString method for Student. Uses inhertiance to gain the other section.
     * 
     * @return super.toString(), myIdNum, myGPA
     */
    public String toString()
    {
        return super.toString() + ", ID number: " + myIdNum + ", gpa: " +myGPA;//Calls the person string and concatenates the text included.
    }
}