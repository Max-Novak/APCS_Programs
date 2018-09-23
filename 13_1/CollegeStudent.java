/**
 * Lowest section of the inhertiance tree that facilates the parameters of their major and year.
 * This class consists of 2 getters and 2 setters.
 *
 * @author Max Nova
 * @version 10/31/2017
 */
class CollegeStudent extends Student
{
    protected String myMajor;
    protected int myYear;//declare the new variables
    
    /**
     * Constructor for CollegStudent. Inherits from the super class.
     * 
     * @param name, age, gender, idNum, gpa, year, major
     */
    public CollegeStudent(String name, int age, String gender,
    String idNum, double gpa, int year, String major)//input constructor
    {
        super(name, age, gender, idNum, gpa);
        
        myMajor = major;
        myYear = year;
    }
    
    /**
     * Getter for myMajor
     * 
     * @return myMajor
     */
    public String getMajor()
    {
        return myMajor;//return major
    }
    
    /**
     * Getter for getYear
     * 
     * @return myYear
     */
    public int getYear()
    {
        return myYear;//return year
    }
    
    /**
     * Setter for major --> myMajor
     * 
     * @param major
     */
    public void setMajor(String major)
    {
        myMajor = major;//set parameter to var
    }
    
    /**
     * Setter for year --> myYear
     * 
     * @param year
     */
    public void setYear(int year)
    {
        myYear = year;//set parameter to var
    }
    
    /**
     * To string method that outputs values about the College Student.
     * 
     * @return super.toString(), myMajor, myYear
     */
    public String toString()
    {
        return super.toString() + ", major: " + myMajor + ", year: " + myYear; // Concatenate a string using the to string method of the preceding class.
    }
}