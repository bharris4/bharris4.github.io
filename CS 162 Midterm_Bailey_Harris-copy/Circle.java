
/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Circle extends Shape
{
    // instance variables - replace the example below with your own
    private double radius;
    
    private static final double pi = 3.14;

    /**
     * Constructor for objects of class Circle
     */
    public Circle(double radius)
    {
        this.radius = radius;
        setType("Circle");
        setArea( pi*radius*radius);
        setPerimeter(2*pi*radius);
    }
    
    public double getRadius()
    {
        return radius;
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
