package MarsRover;

public class DoubleLinkedList {
    DoublyListNode north;
    DoublyListNode west;
    DoublyListNode south;
    DoublyListNode east;
    DoublyListNode whichNow;

    public DoubleLinkedList()
    {
        north   = new DoublyListNode(0, 1, "N");
        west    = new DoublyListNode(1, 0, "E");
        south   = new DoublyListNode(0, -1, "S");
        east    = new DoublyListNode(-1, 0, "W");
        north.next = west;
        north.prev = east;
        west.next = south;
        west.prev = north;
        south.next = east;
        south.prev = west;
        east.next = north;
        east.prev = south;
        whichNow = north;
    }

    public DoublyListNode gotoNext()     //括号中写void，则编译报错：【非法的类型开始】
    {
        whichNow = whichNow.next;
        return whichNow;
    }

    public DoublyListNode gotoPrev()
    {
        whichNow = whichNow.prev;
        return whichNow;
    }

    public DoublyListNode setDirection(String d)
    {
        while(whichNow.direction.charAt(0) != d.charAt(0)) {            //【whichNow.direction != d】是个死循环
            gotoNext();
        }
        //System.out.println("===" + whichNow.addToX + " " + whichNow.addToY + " " + whichNow.direction);
        return whichNow;
    }

}
