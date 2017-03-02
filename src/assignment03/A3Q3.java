/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment03;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author janaz9178
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create city
        City kw = new City();
        //create robot
        RobotSE karel = new RobotSE(kw, 1, 1, Direction.EAST);
        //create inclosure
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.EAST);
        new Wall(kw, 2, 4, Direction.EAST);
        new Wall(kw, 3, 4, Direction.EAST);
        new Wall(kw, 3, 4, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 1, Direction.SOUTH);
        new Wall(kw, 3, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);

        //make litter
        new Thing(kw, 1, 2);
        new Thing(kw, 2, 2);
        new Thing(kw, 2, 3);
        new Thing(kw, 2, 4);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 4);


        //loop
        while (true) {
            //get karel to move and pick up things
            if (karel.frontIsClear() == true) {
                karel.move();
                if (karel.canPickThing() == true) {
                    karel.pickThing();
                }
            //hits an east facing wall, snakes to the next street
            } else if (karel.frontIsClear() == false && karel.getDirection() == Direction.EAST) {
                karel.turnRight();
                if (karel.frontIsClear() == true) {
                    karel.move();
                } else if (karel.frontIsClear() == false) {
                    break;
                }
                if (karel.canPickThing() == true) {
                    karel.pickThing();
                }
                karel.turnRight();
            //hits a west facing wall, goes to next street
            } else if (karel.frontIsClear() == false && karel.getDirection() == Direction.WEST) {
                karel.turnLeft();
                if (karel.frontIsClear() == true) {
                    karel.move();
                } else if (karel.frontIsClear() == false) {
                    break;
                }
                if (karel.canPickThing() == true) {
                    karel.pickThing();
                }
                karel.turnLeft();


            }
        }
        //get karel back to 1, 1
        karel.turnAround();
        while (karel.getStreet() > 1) {
            karel.move();
        }
        karel.turnLeft();
        while (karel.getAvenue() > 1) {
            karel.move();
        }
    }
}