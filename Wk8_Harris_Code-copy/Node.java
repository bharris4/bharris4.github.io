
/**
 * Write a description of class Node here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Node<T>
{
    // instance variables - replace the example below with your own
    private Node previous;
    private Node next;
    private T data;

    /**
     * Constructor for objects of class Node
     */
    public Node(T data)
    {
        init(data, this, this);
        // this.data = data;
        // previous = this;
        // next = this;
    }

    public Node(T data, Node prev, Node next)
    {
        init(data, prev, next);
    }
    
    private void init(T data, Node prev, Node next)
    {
        this.data = data;
        previous = prev;
        this.next = next;
    }
    
    public void setNull()
    {
        this.data = null;
        previous = null;
        this.next = null;
    }
    
    public Node<T> getPrev()
    {
        return previous;
    }
    
    public Node<T> getNext()
    {
        return next;
    }
    
    public T getData()
    {
        return data;
    }
    
    public void setData(T data)
    {
        this.data = data;
    }
    
    public void setNext(Node<T> next)
    {
        this.next = next;
    }
    
    public void setPrev(Node<T> prev)
    {
        previous = prev;
    }
}
