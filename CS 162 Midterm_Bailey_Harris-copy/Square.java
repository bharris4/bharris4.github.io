
/**
 * Write a description of class Square here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Square extends Shape
{
    // instance variables - replace the example below with your own
    private double length;

    /**
     * Constructor for objects of class Circle
     */
    public Square(double length)
    {
        setType("Rectangle");
        this.length = length;
        setArea(length * length);
        setPerimeter(length * 4);
    }

    public double getLength()
    {
        return length;
    }
    
    public void toDraw()
    {
        System.out.println("Drawing...");
    }
    
    public int compare(Shape x, Shape y)
    {
        Double xP = new Double(x.getPerimeter());
        Double yP = new Double(y.getPerimeter());
        return xP.compareTo(yP);
        
    }
}


