package Lukas;

public class DatastructuresAndAlgorithms
{

    public static void main(String[] args)
    {
        //testDoubleLinkedListForward();
        //testDoubleLinkedListBackwards();
        testInsertAfter();
    }
    
    private static void testInsertAfter()
    {
        DoubleLinkedList<String> listHead = new DoubleLinkedList<>();
        // listHead points now to an empty node that is both head and
        // tail sentinel at the same time (bad idea!)
        
        listHead.insertAfter("A");
        // listHead points now to the element containing "A"
        // and the list contains a tail sentinel, but no head sentinel
        
        // this line would return "A", but throws an assertion
        System.out.println(listHead.getValue());
    }

    static void testDoubleLinkedListForward()
    {
        String[] objects =
        {
            "L", "I", "V", "E",
        };
        DoubleLinkedList<String> startSentinel = new DoubleLinkedList<String>();
        DoubleLinkedList<String> endSentinel = startSentinel;
        for (String string : objects)
        {
            endSentinel.insertAfter(string);
            endSentinel = endSentinel.getNextElement();
        }

        for (endSentinel = startSentinel; endSentinel.hasNextElement(); endSentinel = endSentinel.getNextElement())
        {
            System.out.println(endSentinel.getValue());
        }
    }

    static void testDoubleLinkedListBackwards()
    {
        String[] objects =
        {
            "L", "I", "V", "E"
        };
        DoubleLinkedList<String> startSentinel = new DoubleLinkedList<String>();
        DoubleLinkedList<String> endSentinel = startSentinel;
        for (String string : objects)
        {
            endSentinel.insertAfter(string);
            endSentinel = endSentinel.getNextElement();
        }
        for (startSentinel = endSentinel; startSentinel.hasPreviousElement(); startSentinel = startSentinel.getPreviousElement())
        {
            System.out.println(startSentinel.previous.getValue());
        }
    }
}
