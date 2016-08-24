package Carlo;


public class DoubleLinkedList <T> {
    DoubleLinkedList<T> next;
    T value;
    DoubleLinkedList<T> previous;
    
    public DoubleLinkedList() {}
    
    public void setValue(T value)
    {
        assert(next != null);
        assert(previous != null);
        this.value = value;
    }
    public T getValue()
    {
        assert(next != null);
        assert(previous != null);
        return value;
    }
    
    public boolean hasMoreElementsForward()
    {
        return next != null;
    }
    
    public boolean hasMoreElementsBackwards(){
    	assert (previous != null);
    	return previous != null;
    }
    
    public DoubleLinkedList<T> getNextElement()
    {
        assert(next != null);
        assert(previous != null);
        return next;
    }
    
    public DoubleLinkedList<T> getPreviousElement()
    {
    	assert(previous!=null);
        return previous;   	

    }
    
    
    public void append(T value)
    {
        DoubleLinkedList<T> last = this;
        last.value = value;
        last.next = new DoubleLinkedList<>();
        last.next.previous = last;
    }
    
    
}
