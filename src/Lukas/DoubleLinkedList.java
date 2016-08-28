package Lukas;

public class DoubleLinkedList<T>
{

	DoubleLinkedList<T> next;
	T value;
	DoubleLinkedList<T> previous;

	public DoubleLinkedList()
	{
	}

	public void setValue(T item)
	{
		assert (next != null);
		assert (previous != null);
		this.value = item;
	}

	public T getValue()
	{
		assert (next != null);
		assert (previous != null);
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
		assert (next != null);
		return next;
	}

	public DoubleLinkedList<T> getPreviousElement()
	{
		assert (previous != null);
		return previous;
	}

	public void insertAfter(T newItem)
	{
		DoubleLinkedList<T> last = this;

		last.value = newItem;
		last.next = new DoubleLinkedList<T>(); // adds sentinel
		last.next.previous = last;
	}
	
	public void insertAtEnd(T newItem)
	{
		DoubleLinkedList<T> last = this;

		while(last.next != null)
		{
			last = last.next;
		}
		
		last.value = newItem;
		last.next = new DoubleLinkedList<T>();
		last.next.previous = last;
	}
	
	public void insertAtBeginning(T newItem)
	{
		DoubleLinkedList<T> last = this;
		
		while(last.previous != null)
		{
			last = last.previous;
		}
		
		last.value = newItem;
		last.previous = new DoubleLinkedList<T>();
		last.previous.next = last;
	}
}
