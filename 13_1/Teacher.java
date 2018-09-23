/**
 * Teacher recieves some code from Person. It also sets the new variables of mySubject, and mySalary
 *
 * @author Max Nova
 * @version 10/31/2017
 * 
 * @param subject, salary;
 * @return getSubject, getSalary;
 */
class Teacher extends Person
{
    protected String mySubject;
    protected double mySalary;
    
    /**
     * Input constructor for Teacher.
     * 
     * @param name, age, gender, subject, salary
     */
    public Teacher(String name, int age, String gender, String subject, double salary)//constructor
    {
        super(name, age, gender);
        
        mySubject = subject;
        mySalary = salary;
    }
    
    /**
     * Getter for subject
     * 
     * @return mySubject
     */
    public String getSubject()
    {
        return mySubject;//getter of subjet
    }
    
    /**
     * Getter for salary
     * 
     * @return mySalary
     */
    public double getSalary()
    {
        return mySalary;//getter of salary
    }
    
    /**
     * Setter for subject
     * 
     * @param subject
     */
    public void setSubject(String subject)
    {
        mySubject = subject;
    }
    
    /**
     * Setter for salary
     * 
     * @param salary
     */
    public void setSalary(double salary)
    {
        mySalary = salary;
    }
    
    /**
     * toString method for Teacher. Uses inheritance for the preceding data.
     * 
     * @return super.toString(), mySubject, mySalary
     */
    public String toString()
    {
        return super.toString() + ", subject: " + mySubject + ", salary: " + mySalary; //Takes the toString of the Person class and adds subject and salary.
    }
}