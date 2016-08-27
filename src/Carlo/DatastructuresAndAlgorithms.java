package Carlo;


public class DatastructuresAndAlgorithms {

	public static void main(String[] args) throws Exception {
		testDoubleLinkedListForward();
		testDoubleLinkedListBackwards();

	}
	
	static void testDoubleLinkedListForward(){
            String strings[] = {"forward", "works", "perfectly"};
            DoubleLinkedList<String> listHead = new DoubleLinkedList<>();
            DoubleLinkedList<String> listTail = listHead;
            for (String string : strings)
            {
            listTail.appendAfter(string);
            listTail = listTail.getNextElement();   
            }
            for(listTail = listHead; listTail.hasMoreElementsForward(); listTail = listTail.getNextElement())
            {
            System.out.println(listTail.getValue());
            }
		
	}

	static void testDoubleLinkedListBackwards() {
		String strings[]= {"!","backwards", "does", "so"};
		DoubleLinkedList <String> listHead = new DoubleLinkedList<>();
		DoubleLinkedList <String> listTail = listHead;
                
		
		for (String string : strings){
			listTail.appendBefore(string);
                        listTail = listTail.getPreviousElement();
		}
                
		for(listHead = listTail; listTail.hasMoreElementsForward(); listTail = listTail.getNextElement()){
			System.out.println(listTail.next.getValue());
		}
		
	}
        
}
