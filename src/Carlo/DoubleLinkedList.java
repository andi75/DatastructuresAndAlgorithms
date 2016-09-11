package Carlo;


public class DoubleLinkedList <T> {
    DoubleLinkedList<T> next;
    T value;
    DoubleLinkedList<T> previous;
    
    public DoubleLinkedList() {}
    
    public static DoubleLinkedList createEmptyList (){
        DoubleLinkedList firstNode = new DoubleLinkedList();
        DoubleLinkedList lastNode = new DoubleLinkedList();
        firstNode.next = lastNode;
        lastNode.previous = firstNode;
        return firstNode;
    }
    
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
    	return previous != null;
    }
    
    public DoubleLinkedList<T> getNextElement()
    {
        assert(next != null);
        return next;
    }
    
    public DoubleLinkedList<T> getPreviousElement()
    {
    	assert(previous!=null);
        return previous;   	

    }
    
    
    public void appendAfter(T value)
    {
        DoubleLinkedList<T> last = this;
        DoubleLinkedList newNode = new DoubleLinkedList<> ();
        newNode.value = value;
        newNode.previous = this;
        newNode.next = this.next;
        this.next.previous = newNode;
        this.next = newNode;        
    }
    
    public void appendBefore (T value)
    {
        DoubleLinkedList<T> last = this;
        DoubleLinkedList newNode = new DoubleLinkedList<> ();
        newNode.value = value;
        newNode.next = this;
        newNode.previous = this.previous;
        this.previous.next = newNode;
        this.previous = newNode;
    }
    
}
