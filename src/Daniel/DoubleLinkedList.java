package Daniel;


public class DoubleLinkedList<T> {

	DoubleLinkedList<T> next;
	DoubleLinkedList<T> previous;
    T value;
    
    public DoubleLinkedList() {}
    
    public static DoubleLinkedList createEmptyList() {
    
    	DoubleLinkedList HeadSentinel = new DoubleLinkedList(); //head sentinel
        DoubleLinkedList TailSentinel = new DoubleLinkedList(); //tail sentinel
        HeadSentinel.next = TailSentinel;
        HeadSentinel.next.previous = HeadSentinel;
        HeadSentinel = HeadSentinel.next;

        return HeadSentinel;
    }
    
    public void fillList(T... items) {
    	DoubleLinkedList list = this.getHeadSentinel();
    	//list.next = new DoubleLinkedList();
    			
    	for (T i : items) {
            list.insertAfter(i);
            list = list.next;
        }
    }
    
    
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
    
    public void insertAfter(T value) {
    	
    	assert(this.next.next == null);
    	
    	DoubleLinkedList after = this.next;
    	
    	this.next = new DoubleLinkedList();
    	this.next.value = value;
    	this.next.previous = this;
    	this.next.next = after;
    	after.previous = this.next;
    
    }
    
    public void insertBefore(T value) {
    	
    	assert(this.previous.previous != null);
    	
    	DoubleLinkedList prev = this.previous;
    	
    	this.previous = new DoubleLinkedList();
    	this.previous.value = value;
    	this.previous.next = this;
    	this.previous.previous = prev;
    	prev.next = this.previous;
    }
}
