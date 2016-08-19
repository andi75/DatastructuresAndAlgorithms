
public class DoubleLinkedList<T> {
	DoubleLinkedList<T> next;
	T current;
	DoubleLinkedList<T> prev;
	
	public DoubleLinkedList() {}
	
	public void setCurrent(T item)
	{
		assert(next != null);
		assert(prev != null);
		this.current = item;
	}
	public T getCurrent()
	{
		assert(next != null);
		assert(prev != null);
		return current;
	}
	
	public boolean hasMoreElementsForward()
	{
		return next != null;
	}
	public boolean hasMoreElementsBackwards()
	{
		return prev != null;
	}
	
	public DoubleLinkedList<T> getNextElement()
	{
		assert(next != null);
		return next;
	}
	public DoubleLinkedList<T> getLastElement()
	{
		assert(prev != null);
		return prev;
	}
	
	public void append(T newItem)
	{
		DoubleLinkedList<T> last = this; // This is listTail now(in this function)
		
		// The next part achieves actually nothing, thats why I commented it out...
		
		/*
		while(last.next != null) 
		// searches for a empty item
		{
			last = last.next;
		}
		*/

		last.current = newItem;
		last.next = new DoubleLinkedList<T>();
		
		//This gives a great overview. Enable to see the linking of the List:
		//  <- Remove this comment.(and this too) System.out.println("Overview: prev="+last.prev+"; current="+last.current+"; next="+last.next);
		
		last.next.prev = last;
	}
}
