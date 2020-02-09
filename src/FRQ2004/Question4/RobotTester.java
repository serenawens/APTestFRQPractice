package FRQ2004.Question4;

import java.util.Arrays;

public class RobotTester {
    public static void main(String[] args) {
        int[] hallway = {1,1,2,2,};

        Robot robot = new Robot(hallway, 1,true);
        System.out.println(robot.clearHall());
        //robot.clearHall();
        for (int tile: hallway)
        {
            System.out.println(tile);
        }

    }
}
