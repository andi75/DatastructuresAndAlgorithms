
public class LinkedList<T> {
    LinkedList<T> next;
    T value;
    
    public LinkedList() {}
    
    public void setValue(T value)
    {
        assert(next != null);
        this.value = value;
    }
    public T getValue()
    {
        assert(next != null);
        return value;
    }
    
    public boolean hasMoreElements()
    {
        return next != null;
    }
    
    public LinkedList<T> getNextElement()
    {
        assert(next != null);
        return next;
    }
    
    public void append(T value)
    {
        LinkedList<T> last = this;
        while(last.next != null) { last = last.next; }
        last.value = value;
        last.next = new LinkedList();
    }
}
