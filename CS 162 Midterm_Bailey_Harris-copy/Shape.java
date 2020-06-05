import java.util.*;

/**
 * Abstract class Shape - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Shape implements Drawable, Comparable<Shape>, Comparator<Shape> 
{
    private double area;
    private double perimeter;
    private String type;

    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double getArea()
    {
        return area;
    }
    
    public double getPerimeter()
    {
        return perimeter;
    }
    
    public String getType()
    {
        return type;
    }
    
    protected void setType(String type)
    {
        this.type = type;
    }
    
    protected void setType(double area)
    {
        this.area = area;
    }
    
    protected void setPerimeter(double perimeter)
    {
        this.perimeter = perimeter;
    }
    
    protected void setArea(double area)
    {
        this.area = area;
    }
    
    @Override
    public int compareTo(Shape other) 
    {
        return new Double(this.getArea()).compareTo(new Double(other.getArea()));
    }
    
    public int compare(Shape x, Shape y)
    {
        Double xP = new Double(x.getPerimeter());
        Double yP = new Double(y.getPerimeter());
        return xP.compareTo(yP);
        
    }
  
    public int compareArea(Shape x, Shape y)
    {
        Double xA = new Double(y.getArea());
        Double yA = new Double(x.getArea());
        return xA.compareTo(yA);
    }
    
    public String toString()
    {
        return "Shape of " + getType() + " Perimeter = " + getPerimeter() + " Area = " + getArea();
    }
    
}
