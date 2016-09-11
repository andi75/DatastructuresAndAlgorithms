package Carlo;


public class DatastructuresAndAlgorithms {

	public static void main(String[] args) throws Exception {
		testDoubleLinkedListForward();
		testDoubleLinkedListBackwards();

	}
	
	static void testDoubleLinkedListForward(){
            String strings[] = {"forward", "works", "perfectly"};
            DoubleLinkedList firstNode = DoubleLinkedList.createEmptyList();
            DoubleLinkedList currentNode = firstNode;
            for (String string : strings){
                currentNode.appendAfter(string);
                currentNode = currentNode.getNextElement();
            }
            for (currentNode = firstNode.next; currentNode.hasMoreElementsForward(); currentNode = currentNode.getNextElement()){
                System.out.println(currentNode.getValue());
            }
		
	}

	static void testDoubleLinkedListBackwards() {
		String strings[]= {"!","backwards", "does", "so"};
		DoubleLinkedList firstNode = DoubleLinkedList.createEmptyList();
                DoubleLinkedList lastNode = firstNode.next;
                DoubleLinkedList currentNode = lastNode;
                		
		for (String string : strings){
			currentNode.appendBefore(string);
                        currentNode = currentNode.getPreviousElement();
		}
                
		for (currentNode = firstNode.next; currentNode.hasMoreElementsForward(); currentNode = currentNode.getNextElement()){
                    System.out.println(currentNode.getValue());
                }
		
	}
        
}
