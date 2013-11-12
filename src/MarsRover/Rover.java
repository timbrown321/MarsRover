package MarsRover;

public class Rover {
    public int locationX;
    public int locationY;
    public String direction;

    public DoubleLinkedList wheel = new DoubleLinkedList();

    public Rover()
    {
        locationX = 0;
        locationY = 0;
        direction = "N";
        wheel.setDirection("N");
    }

    public void setRoverStatus(int x, int y, String d)
    {
        locationX = x;
        locationY = y;
        direction = d;
        wheel.setDirection(d);
    }

    public void turnLeft() //如果没有返回值，可以写void。但是如果没有参数，不可以写void，要直接空着。Java中的void就是没有返回值的意思
    {
        wheel.gotoPrev();
        direction = wheel.whichNow.direction;
    }

    public void turnRight()
    {
        wheel.gotoNext();
        direction = wheel.whichNow.direction;
        //System.out.println("=====" + locationX + " " + locationY + " " + direction);
    }

    public void move()
    {
        locationX += wheel.whichNow.addToX;
        locationY += wheel.whichNow.addToY;
        //System.out.println("=====" + locationX + " " + locationY + " " + direction);
    }

}
