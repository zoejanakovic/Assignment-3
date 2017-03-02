/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment03;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;

/**
 *
 * @author janaz9178
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create city
        City kw = new City();

        //create Robot
        RobotSE karel = new RobotSE(kw, 1, 1, Direction.EAST);

        //create 10 things
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);

        //create a counter
        int counter = 0;

        //get karel to pick things and move them until the counter reaches 10
        while (counter < 10) {
            karel.pickThing();
            karel.move();
            karel.putThing();
            karel.turnAround();
            karel.move();
            karel.turnAround();
            counter++;
        }
        
        //get karel to move onto the space with his new pile
        karel.move();
    }
}
