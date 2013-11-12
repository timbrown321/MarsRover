package MarsRover;

public class ChessBoardArea {
    int maxX;
    int maxY;

    public boolean crossBorderCheck(Rover rover)
    {
        if(rover.locationX + rover.wheel.whichNow.addToX > maxX)    return true;
        if(rover.locationY + rover.wheel.whichNow.addToY > maxY)    return true;
        if(rover.locationX + rover.wheel.whichNow.addToX < 0)       return true;
        if(rover.locationY + rover.wheel.whichNow.addToY < 0)       return true;
        return false;
    }
}
