/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment03;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author janaz9178
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create city
        City kw = new City();
        
        //create robot
        Robot karel = new Robot(kw, 0, 2, Direction.WEST);
        
        //creating walls
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.EAST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.EAST);

        //making a counter
        int counter = 0;

        //loop karel to move twice, turn left, then move while the counter is<8
        while (counter < 8) {
            karel.move();
            karel.move();
            karel.turnLeft();
            karel.move();
            //increase counter by 1
            counter++;
        }
    }
}
