package test;

import MarsRover.DoubleLinkedList;
import MarsRover.DoublyListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DoubleLinkedListTest {
    @Test
    public void addToXIsRight()
    {
        DoubleLinkedList t = new DoubleLinkedList();
        DoublyListNode a =  t.gotoNext();
        assertEquals(1,a.addToX);
    }
    @Test
    public void addToYIsRight()
    {
        DoubleLinkedList t = new DoubleLinkedList();
        DoublyListNode a =  t.gotoNext();
        assertEquals(0,a.addToY);
    }
    @Test
    public void directionIsRight()
    {
        DoubleLinkedList t = new DoubleLinkedList();
        DoublyListNode a =  t.gotoNext();
        assertEquals("W",a.direction);
    }
}
