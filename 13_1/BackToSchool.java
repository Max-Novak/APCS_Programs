/**
 * BackToSchool is the driving class for the inheritance tree. The 4 other classes are instantiated here with their.
 *
 * @author Max Nova
 * @version 10/31/2017
 */
public class BackToSchool
{
    public static void main(String[] args)
    {
        Person bob = new Person("Coach Bob", 27, "M");//Create new Person
        System.out.println(bob);
        Student lynne = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);//Create new student
        System.out.println(lynne);
        Teacher mrJava = new Teacher("Duke Java", 34, "M", "Computer Science", 50000);//Create new teacher
        System.out.println(mrJava);
        CollegeStudent ima = new CollegeStudent("Ima Frosh", 18, "F", "UCB123",//Create new collegestudent
        4.0, 1, "English");
        System.out.println(ima);
    }
}