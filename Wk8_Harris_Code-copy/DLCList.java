import java.util.*;
/**
 * Write a description of class DLCList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DLCList<T> implements IList<T>
{
    // instance variables - replace the example below with your own
    private Node start;
    private Node end;
    private Node current;
    private int size;
    /**
     * Constructor for objects of class DLCList
     */
    public DLCList()
    {
        start = null;
        end = null;
        size = 0;
    }
    
    /*
     * Add first object to a list
     */
    public boolean add(T element)
    {   
        if(start == null)
        {
            start = new Node<>(element);
        }
        else{
            Node temp = new Node<>(element, start.getPrev(), start);
            Node last = start.getPrev();
            last.setNext(temp);
            start.setPrev(temp);
        }
        
        size++;
        System.out.println("Added element");
        return true;
    }
    
    public boolean addAll(List<T> items)
    {
        for(T item : items)
            {
                add(item);
            }
        return true;
    }
    
    public boolean addFirst(T element)
    {
        Node<T> node = new Node(element);
        Person x = (Person)node.getData();
        System.out.println(x);
        size++;
        return true;
    }
    
    public boolean addLast(T element)
    {
        Node temp = new Node(element, null, end);
        if(end != null)
        {
            end = temp;
        }
        if(start != null)
        {
            start = temp;
        }
        size++;
        System.out.println("Added element");
        return true;
    }
    
    public T delete(Node<T> node)
    {
        Node<T> next = node.getNext();
        Node<T> previous = node.getPrev();
        
        previous.setNext(next);
        next.setPrev(previous);
        
        size--;
        return node.getData();
        // if(size == 0)
        // {
            // throw new NoSuchElementException();
        // }
        
        // if(start.getData().equals(index))
        // {
            // start = start.getNext();
        // }
        
        // current = start;
        // while(current != null && !current.getData().equals(index))
        // {
            // current = current.getNext();
            // if(current == null)
                // {
                    // throw new NoSuchElementException();
                // }
            // else{
                // current = current.getNext();
                // current.setPrev() = current.getPrev();
            // }
            // current = current.getPrev();
            // current = current.getNext();
            // current = current.setPrev();
            // }
            // size--;
        }
    
    
    public void deleteFirst()
    {
        if (size == 0)
            {
                throw new NoSuchElementException();
            }
        Node temp = start;
        start = start.getNext();
        start.setPrev(null);
        size--;
        System.out.println("Deleted element");
    }
    
    public void deleteLast()
    {
        if (size == 0)
            {
                throw new NoSuchElementException();
            }
        Node temp = end;
        end = end.getPrev();
        start.setNext(null);
        size--;
        System.out.println("Deleted element");
    }
    
    public int size()
    {
        return size;
    }
    
    public void clear()
    {
        start = null;
        end = null;
        size = 0;
    }
    
    public boolean contains(T object)
    {
        return true;
    }
   
    
    public Node<T> getNode(int index)
    {
        if(index >= size || index < 0)
            {
                throw new IndexOutOfBoundsException("Invalid Index: Does not exist.");
            }
             
        Node<T> cursor = start;
        
        for(int i = 0; i<index; i++)
        {
            cursor = cursor.getNext();
        }
        
        return cursor;
    }
    
    public T get(int index)
    {    
        Node<T> node = getNode(index);
        return node.getData();
    }
    
    public T getFirst()
    {
        if(size == 0)
        {
            throw new NoSuchElementException();
        }
        else{
            return (T)start.getPrev().getData();
        }
    }
    
    public T getLast()
    {
        if(size == 0)
        {
            throw new NoSuchElementException();
        }
        else{
            return (T)end.getPrev().getData();
        }
    }
    
    public void set(int index, T data)
    {
        Node<T> node = getNode(index);
        node.setData(data);
    }
}
