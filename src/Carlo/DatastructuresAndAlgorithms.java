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
            listTail.append(string);
            listTail = listTail.getNextElement();   
        }
        listTail = listTail.next;
        for(listTail = listHead; listTail.hasMoreElementsForward(); listTail = listTail.getNextElement())
        {
            System.out.println(listTail.getValue());
        }
		
	}

	static void testDoubleLinkedListBackwards() throws Exception{
		String strings[]= {"!","backwards", "does", "so"};
		DoubleLinkedList <String> listHead = new DoubleLinkedList<>();
		DoubleLinkedList <String> listTail = listHead;
		
		for (String string : strings){
			listTail.append(string);
                        listTail = listTail.getNextElement();
		}

		for(listHead = listTail; listTail.hasMoreElementsBackwards(); listTail = listTail.getPreviousElement()){
			System.out.println(listTail.previous.getValue());
		}
		
	}
}
