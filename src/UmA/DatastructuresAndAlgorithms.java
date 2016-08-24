package UmA;


public class DatastructuresAndAlgorithms {
    public static void main(String[] args)
    {
        testIntLinkedList();
    }
    
    static void testIntLinkedList()
    {
        int numbers[] = { 2, 3, 1, 6, 4, 7, 8 };
        LinkedIntList listHead = new LinkedIntList();
        LinkedIntList listTail = listHead;
        for(int num : numbers)
        {
            listTail.value = num;
            listTail.next = new LinkedIntList();
            listTail = listTail.next;
        }
        for(listTail = listHead; listTail.next != null; listTail = listTail.next)
        {
            System.out.println(listTail.value);
        }
    }
    static void testLinkedList()
    {
        String strings[] = { "The", "quick", "brown", "fox" };
        LinkedList<String> listHead = new LinkedList();
        LinkedList<String> listTail = listHead;
        for (String string : strings)
        {
            listTail.append(string);
            listTail = listTail.getNextElement();   
        }
        
        for(listTail = listHead; listTail.hasMoreElements(); listTail = listTail.getNextElement())
        {
            System.out.println(listTail.getValue());
        }
    } 
}
