package Daniel;


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
    
    public DoubleLinkedList<T> getTailSentinel()
    {
    	 DoubleLinkedList<T> last = this;
         while(last.next != null) { last = last.next; };
         return last;
         
    }
    
    public DoubleLinkedList<T> getHeadSentinel()
    {
    	DoubleLinkedList<T> first = this;
    	while(first.previous != null) { first = first.previous; };
    	return first;
    }
    
    public void append(T value)
    {
        // takes the tail sentinel
       DoubleLinkedList<T> last = getTailSentinel();
       
       // adds data to it, so it becomes a "normal" node
       last.value = value;
       // create a new tail sentinel
       last.next = new DoubleLinkedList<T>();
       last.next.previous = last;
       
    }
}
