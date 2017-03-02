/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment03;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author janaz9178
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create city
        City kw = new City();

        //create robot
        RobotSE karel = new RobotSE(kw, 2, 3, Direction.WEST);

        //create enclosure
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.EAST);
        new Wall(kw, 2, 4, Direction.EAST);
        new Wall(kw, 4, 4, Direction.EAST);
        new Wall(kw, 5, 4, Direction.EAST);
        new Wall(kw, 5, 4, Direction.SOUTH);
        new Wall(kw, 5, 3, Direction.SOUTH);
        new Wall(kw, 5, 2, Direction.SOUTH);
        new Wall(kw, 5, 1, Direction.SOUTH);
        new Wall(kw, 5, 1, Direction.WEST);
        new Wall(kw, 4, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);

        //get karel to move to the perimeter
        while (karel.frontIsClear() == true) {
            karel.move();
            //check for the break
            if (karel.frontIsClear() == false) {
                karel.turnLeft();
                karel.move();
                karel.turnRight();
            }
        }
        //get karel to check for the break moving around the enclosure
        while (karel.frontIsClear() == false) {
            karel.turnLeft();
            if (karel.frontIsClear() == true) {
                karel.move();
            } else if (karel.frontIsClear() == false) {
                karel.turnLeft();
                karel.move();
            }
            karel.turnRight();
        }
        //move out of the enclosure
        karel.move();




    }
}
