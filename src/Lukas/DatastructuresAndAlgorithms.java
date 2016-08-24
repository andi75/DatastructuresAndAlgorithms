package Lukas;


public class DatastructuresAndAlgorithms {
    public static void main(String[] args)
    {	
        // testDoubleLinkedListForward();
        testDoubleLinkedListBackwards();
    }
    
  
    static void testDoubleLinkedListForward()
    {
    	String strings[] = {"L", "I", "V", "E"};
    	DoubleLinkedList<String> listHead = new DoubleLinkedList<String>();
    	DoubleLinkedList<String> listTail = listHead;
    	for (String string : strings)
    	{
    		listTail.append(string);
    		listTail = listTail.getNextElement();
    	}
    	
    	for(listTail = listHead; listTail.hasMoreElementsForward(); listTail = listTail.getNextElement())
    	{
    		System.out.println(listTail.getValue());
    	}
    }
    static void testDoubleLinkedListBackwards()
    {
    	String strings[] = {"L", "I", "V", "E"};
    	DoubleLinkedList<String> listHead = new DoubleLinkedList<String>();
    	DoubleLinkedList<String> listTail = listHead;
    	for (String string : strings)
    	{
    		listTail.append(string);
    		listTail = listTail.getNextElement();
    	}
    	listTail = listTail.prev;
    	for(listHead = listTail; listTail.next.hasMoreElementsBackwards(); listTail = listTail.getPrevElement())
    	{
    			System.out.println(listTail.getValue());
    		
//    		if(listTail.prev == null) // For safety reasons, otherwise it would throw a NullPointer-Exception
//    		{
//    			break;
//    		}
    	}
    }
}
