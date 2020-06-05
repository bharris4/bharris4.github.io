
/**
 * Write a description of class Rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle extends Shape
{
    // instance variables - replace the example below with your own
    private double length;
    private double width;

    /**
     * Constructor for objects of class Circle
     */
    public Rectangle(double length, double width)
    {
        setType("Rectangle");
        this.length = length;
        this.width = width;
        setArea(length * width);
        setPerimeter(2 *(length * width));
    }

    // /**
     // * An example of a method - replace this comment with your own
     // *
     // * @param  y  a sample parameter for a method
     // * @return    the sum of x and y
     // */
    // public double getArea()
    // {
        // double result = width*length;
        // return result;
    // }
    
    // public double getPerimeter()
    // {
        // double result = (width*2) + (length*2);
        // return result;
    // }
    
    // public String toString()
    // {
        // return "Rectangle" + " Perimeter = " + getPerimeter() + " Area = " + getArea();
    // }
    
    public double getLength()
    {
        return length;
    }
    
    public double getWidth()
    {
        return width;
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

