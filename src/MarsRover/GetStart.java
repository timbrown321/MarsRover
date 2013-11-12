package MarsRover;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetStart {

    ChessBoardArea area = new ChessBoardArea();
    Rover rover = new Rover();

    public void getStart()
    {
        try {
            InputStreamReader is_reader = new InputStreamReader(System.in);
            BufferedReader in = new BufferedReader(is_reader);

            String input = in.readLine();
            String[] boundary = input.split("[ ]+");  //提取【用空格彼此隔开】的字符，填充到数组na中
            area.maxX = Integer.parseInt(boundary[0]);
            area.maxY = Integer.parseInt(boundary[1]);

            int n = 5;
            while( n-- != 0 ) {
                input = in.readLine();
                String[] status = input.split("[ ]+");
                rover.setRoverStatus(Integer.parseInt(status[0]), Integer.parseInt(status[1]), status[2]);

                String order = in.readLine();
                int orderLen = order.length();
                for(int i=0; i<orderLen; i++){
                    switch(order.charAt(i)) {
                        case 'L':   rover.turnLeft();   break;
                        case 'R':   rover.turnRight();  break;
                        case 'M':   {
                            if(area.crossBorderCheck(rover))    System.out.println("Reach the border !");
                            else    rover.move();
                            break;
                        }
                        default:    break;
                    }
                }

                System.out.println(rover.locationX + " " + rover.locationY + " " + rover.direction);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
