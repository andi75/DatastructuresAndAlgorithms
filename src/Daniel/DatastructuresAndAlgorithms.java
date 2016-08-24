package Daniel;


public class DatastructuresAndAlgorithms {
    static final int TEST_FORWARD = 0;
    static final int TEST_BACKWARD = 1;
    
    public static void main(String[] args)
    {
       testDoubleLinkedList(TEST_FORWARD);
       testDoubleLinkedList(TEST_BACKWARD);
        testDoubleLinkedList(2);
    }
    
    
    public static void testDoubleLinkedList(int i) {
    	
    	int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
    	
    	
    	DoubleLinkedList current = new DoubleLinkedList();
    	DoubleLinkedList nextElement = new DoubleLinkedList();
    	current.next = nextElement;
    	current.next.previous = current;
    	current = current.next;
    	
    	for(int num : numbers) {
    		current.append(num);
    	}
    	
    	switch(i){
    	
    	default:
    	case 0: //forwards
    		DoubleLinkedList firstElement = current.getFirstElement().next;
    		while(firstElement.hasNextElement()) {
    			System.out.println(firstElement.value);
    			firstElement = firstElement.next;
    		}
    		
			break;
		
		case 1: //backwards
			DoubleLinkedList lastElement = current.getLastElement().previous;
			 while(lastElement.hasPreviousElement()) {
				System.out.println(lastElement.value);
				lastElement = lastElement.previous;
			}
			
			break;
    	
    		
    	}
    }
}
