/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment03;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author janaz9178
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create city
        City kw = new City();

        //create a robot

        Robot karel = new Robot(kw, 1, 1, Direction.EAST);

        //creating things and walls
        new Thing(kw, 1, 4);
        new Thing(kw, 1, 5);
        new Wall(kw, 1, 6, Direction.WEST);
        new Wall(kw, 1, 4, Direction.WEST);

        //karel moves until he comes across the first thing or wall
        while (true) {
            karel.move();
            if (karel.canPickThing() || karel.frontIsClear() == false) {
                break;
            }

        }
    }
}