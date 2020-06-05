

import java.util.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class DLCListTest.
 
 * @author  (your name)
 * @version (a version number or a date)
 */
public class DLCListTest
{
    private DLCList<Person> people;
    //private Person[] people;
    private Person aPerson;
    
    /**
     * Default constructor for test class DLCListTest
     */
    public DLCListTest()
    {
           //people = new Person[]{
               Person a = new Person("Jon", "Snow", "123456789");
               Person b = new Person("Frodo", "Baggins", "234567890");
               Person c = new Person("Sam", "Gamgee", "345678901");
               Person d = new Person("Jim", "John", "445678901"); 
               Person e = new Person("J", "Mikes", "545678901"); 
               Person f = new Person("Five", "Guy", "645678901");
               
           people.addAll(Arrays.asList(new Person[]{a,b,c,d,e,f}));
           
           aPerson = new Person("Sum", "NewGuy", "745678901");
    }

    public void printList()
    {
        System.out.println(people);
    }
    
    
    @Test
    public void testAdd()
    {
        printList();
        people.add(aPerson);
        printList();
    }
    
    @Test
    public void testGetFirst()
    {
        assertTrue(people.getFirst().getID().equals("123456789"));
    }
   
    public void testGetLast()
    {
        assertTrue(people.getLast().getID().equals("345678901"));
    }
    
    // public void removeDeleteSam()
    // {
     // assertTrue(people.getNode(3).delete());
     // printList();
    // }
    
    public void removeDeleteLast()
    {
     printList();
     people.deleteLast();
     printList();
    }
    
     public void removeDeleteFirst()
    {
     printList();
     people.deleteFirst();
     printList();
    }
    
    public void testGet(int index)
    {
        people.get(index);
    }
}
