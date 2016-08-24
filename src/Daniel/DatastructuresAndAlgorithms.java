package Daniel;

public class DatastructuresAndAlgorithms {

    public static void main(String[] args) {
        testDoubleLinkedList();
    }

    public static void testDoubleLinkedList() {

        DoubleLinkedList TestList = createList();

        System.out.println("FORWARD : ");
        printListForward(TestList);
        System.out.println("BACKWARD : ");
        printListBackward(TestList);

    }

    public static DoubleLinkedList createEmptyList() {
        
        DoubleLinkedList HeadSentinel = new DoubleLinkedList(); //head sentinel
        DoubleLinkedList TailSentinel = new DoubleLinkedList(); //tail sentinel
        HeadSentinel.next = TailSentinel;
        HeadSentinel.next.previous = HeadSentinel;
        HeadSentinel = HeadSentinel.next;

        return HeadSentinel;
    }
    
    public static DoubleLinkedList createList() {

        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8};

        DoubleLinkedList emptyList = createEmptyList();
        
        
        for (int num : numbers) {
            emptyList.append(num);
        }

        return emptyList;
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
