
/**
 * Write a description of interface IList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface IList<T>
{
    boolean add(T element);
    boolean addFirst(T element);
    boolean addLast(T element);
    
    T delete(Node<T> node);
    void deleteFirst();
    void deleteLast();
    
    int size();
    void clear();
    boolean contains(T object);
    
    T get(int index);
    T getFirst();
    T getLast();
    
    void set(int index, T object);
    
}
