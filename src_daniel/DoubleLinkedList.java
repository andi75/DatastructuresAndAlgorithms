
public class DoubleLinkedList<T> {

	DoubleLinkedList<T> next;
	DoubleLinkedList<T> previous;
    T value;
    
    public DoubleLinkedList() {}
    
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
    
    public boolean hasNextElement()
    {
        return next != null;
    }
    
    public boolean hasPreviousElement()
    {
    	return previous != null;
    }
    
    public DoubleLinkedList<T> getNextElement()
    {
        assert(next != null);
        return next;
    }
    
    public DoubleLinkedList<T> getPreviousElement()
    {
    	assert(previous != null);
    	return previous;
    }
    
    public DoubleLinkedList<T> getLastElement()
    {
    	 DoubleLinkedList<T> last = this;
         while(last.next != null) { last = last.next; };
         return last;
         
    }
    
    public DoubleLinkedList<T> getFirstElement()
    {
    	DoubleLinkedList<T> first = this;
    	while(first.previous != null) { first = first.previous; };
    	return first;
    }
    
    public void append(T value)
    {
       DoubleLinkedList<T> last = getLastElement();
       last.value = value;
       last.next = new DoubleLinkedList<T>();
       last.next.previous = last;
       
    }
}
