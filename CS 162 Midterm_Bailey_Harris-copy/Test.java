
import java.util.*;
/**
 * The test class Test.
 *
 * @author  (Bailey Harris)
 * -15 base 10 to 8 bit binary is 11110001
 * We use 15 divided by 2 via long division to get the remainders of each step.
 * (ie 15 / 2 = 7 . 15 % 2 = 1 and then 7/2 = 3 . 7 % 2 = 1......
 * We do this until it we cannot reduce any further. Then, add record all remainders 
 * backwards to give us the binary number of a four bit value.
 * Since 15 is a negative number we proceed from the left to the right 1111.
 * To get the two's compliment we flip the bits and add 1.
 * = 01000111
 * 
 * Corrected bits
 * I see, this stuff is complex to get my mind around. 
 * 00001111 flip the bits and add one> 11110001
 * My confusion with this was the eight bit. I understand twos compliment and 
 * the process in conversion between positive and negative numbers. However,
 * I was a little thrown off with this one.
 * I need to get the bits of numbers done.
 * @version (a version number or a date)
 */
public class Test //implements Comparable<Shape> 
{
    //I don't know what I was thinking with these... trying to find a way for the
    //comparator to access my area and perimeters to sort for each object.
    //There must be a better way than this and I can't think of it... I am stumped...
    // private double perimeter1;
    // private double area1;
    
    // private double perimeter2;
    // private double area2;
    
    // private double perimeter3;
    // private double area3;
    
    protected ArrayList<Shape> sh;
    
    /**
     * Default constructor for class Test
     */
    public Test()
    {
        Shape[] shlist = {
             new Rectangle(5, 5),
             new Square(5),
             new Rectangle(2, 3),
             new Circle(5),
             new Square(2),
             new Circle(2),
             new Square(10),
            };
            
        List<Shape> shapes = new ArrayList(Arrays.asList(shlist));
        
        for(Shape shape: shapes)
        {
            System.out.println(shape);
        }
        
        shapes.forEach(shape -> shape.toDraw());
        
        System.out.println("Sorted by Perimeter");
        shapes.stream().sorted((x, y) -> x.compare(x, y))
            .forEach(System.out::println);
            
       System.out.println("Sorted by Area");
       Collections.sort(shapes);
            shapes.forEach(System.out::println);
        // ArrayList<Shape> sh = new ArrayList<>();
        // sh.add(one);
        // sh.add(two);
        // sh.add(three);
        
        //Collections.sort(sh);
        //System.out.println(sh);
        
        // area1 = one.getArea();
        // area2 = two.getArea();
        // area3 = three.getArea();
        
        // perimeter1 = one.getPerimeter();
        // perimeter2 = two.getPerimeter();
        // perimeter3 = three.getPerimeter();
        
    }
    
    public void filterPrint(List<Shape> shapes, String type)
    {
        System.out.println("Specified shape = " + type);
        shapes.stream().filter(shape -> shape.getType().equals(type))
                        .forEach(System.out::println);
    }
    
    /*
     * I am struggling with the compare and sort methods. Will need to go over this in
     * office hours next wednesday. 
     */
    // public int compareTo(Shape other)
    // {
        // return (this.length - other.length);
    // }
    
    /*
     * Hey Pete, Kind of lost on this one. Originally I did the first two lines of
     * commented out code but I got an error. I am not sure if eithe way works.
     * The top line is the code that will compile. I am curious if that one will work.
     */
    public void printSquares()
    {
        sh.stream()
                 .filter(sh -> "Square".equals(sh.toString()));
                 //.filter(sh -> instanceOf.Square);
                 //.forEach(sh -> System.out.println(toString())); 
    }
    
    public void printShapes()
    {
        for(Shape shape : sh)
        {
            System.out.println(shape.toString());
        }
        
    }
    
    // /*
     // * I see my major flaw and its too late... I needed to have a some instance variables
     // * stored in my shape class that can be accessed to sort my list... I need to refactor
     // * my classes to do so... with 10 minutes left. 
     // */
    // public static void sortAttemptTwo()
    // {
        
        
        // Arrays.sort(shlist);
        // System.out.println("List of shapes by perimeter: \n" +Arrays.toString(shlist));
        
    // }
    
    
    /*
     * This is one of my attempts to sort Shapes with a collection
     * I am all lost on this one. I searched and looked for examples on how to sort
     * a list. I am not sure how to access my variables of area and perimeter for each
     * shape instance of the subclasses. What would be the best way to do this?
     */
    // public static void main(String[] args)
    // {
        // ArrayList<Shape> sortedSH = sh.stream().sorted().collect(Collectors.toList());
        // sortedList.forEach(System.out::println);
        
    // }
    
    /*
     * This is not sorted but it does print each shape
     */
    public void toPrintShapeList()
    {
        sh.forEach(sh -> System.out.println(sh.toString()));
    }
}
