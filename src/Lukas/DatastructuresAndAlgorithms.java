package Lukas;

public class DatastructuresAndAlgorithms
{

    public static void main(String[] args)
    {
        //testDoubleLinkedListForward();
        testDoubleLinkedListBackwards();
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
