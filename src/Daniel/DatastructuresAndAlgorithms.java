package Daniel;

public class DatastructuresAndAlgorithms {

    static final int TEST_FORWARD = 0;
    static final int TEST_BACKWARD = 1;

    public static void main(String[] args) {
        testDoubleLinkedList(0);
    }

    public static void testDoubleLinkedList(int i) {

        DoubleLinkedList TestList = createList();

        printListForward(TestList);
        System.out.println("BACKWARD : ");
        printListBackward(TestList);

    }

    public static DoubleLinkedList createList() {

        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8};

        DoubleLinkedList HeadSentinel = new DoubleLinkedList(); //head sentinel
        DoubleLinkedList TailSentinel = new DoubleLinkedList(); //tail sentinel
        HeadSentinel.next = TailSentinel;
        HeadSentinel.next.previous = HeadSentinel;
        HeadSentinel = HeadSentinel.next;

        for (int num : numbers) {
            HeadSentinel.append(num);
        }

        return HeadSentinel;
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
