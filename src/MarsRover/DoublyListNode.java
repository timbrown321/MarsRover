package MarsRover;

public class DoublyListNode {
    public int addToX;
    public int addToY;
    public String direction;

    DoublyListNode prev;
    DoublyListNode next;

    DoublyListNode(int addToX, int addToY, String direction)
    {
        this.addToX = addToX;
        this.addToY = addToY;
        this.direction = direction;
        prev = null;
        next = null;
    }

}
