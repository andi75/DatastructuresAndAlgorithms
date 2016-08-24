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
        DoubleLinkedList<T> last = this; // This is listTail now(in this function)

        last.value = newItem;
        last.next = new DoubleLinkedList<T>();

        //This gives a great overview. Enable to see the linking of the List:
        //System.out.println("Overview: previous=" + last.previous + "; current=" + last.value + "; next=" + last.next);

        last.next.previous = last;
    }
}
