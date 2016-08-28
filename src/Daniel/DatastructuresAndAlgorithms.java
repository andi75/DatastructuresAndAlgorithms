package Daniel;

public class DatastructuresAndAlgorithms {

    public static void main(String[] args) {
        testDoubleLinkedList();
    }

    public static void testDoubleLinkedList() {
    	
    	DoubleLinkedList TestList = DoubleLinkedList.createEmptyList();
        TestList.fillList(1, 2, 3, 4, 5, 6, 7, 8);
        
        System.out.println("FORWARD : ");
        printListForward(TestList);
        System.out.println("BACKWARD : ");
        printListBackward(TestList);

    }

    
    public static void printListBackward(DoubleLinkedList element) {

        DoubleLinkedList lastElement = element.getTailSentinel().previous;
        while (lastElement.hasPreviousElement()) {
            System.out.println(lastElement.value);
            lastElement = lastElement.previous;
        }

    }

    public static void printListForward(DoubleLinkedList element) {

        DoubleLinkedList firstElement = element.getHeadSentinel().next;
        while (firstElement.hasNextElement()) {
            System.out.println(firstElement.value);
            firstElement = firstElement.next;
        }
    }
}
