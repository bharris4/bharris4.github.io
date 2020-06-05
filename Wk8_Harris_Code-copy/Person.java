
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    // instance variables - replace the example below with your own
    private String firstName;
    private String lastName;
    private String ID;
    
    /**
     * Constructor for objects of class Person
     */
    public Person(String first, String last, String ID)
    {
        firstName = first;
        lastName = last;
        this.ID = ID;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public String getID()
    {
        return ID;
    }
    
    public String toString()
    {
        return "The Name is: " + getFirstName() + ". " + getLastName() + " " + 
            "The ID number is: " + getID() + ".";
    }
}
