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
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create city
        City kw = new City();

        //create robot
        RobotSE karel = new RobotSE(kw, 0, 1, Direction.SOUTH);

        //set up things
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 2, 1);
        new Thing(kw, 2, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 4, 1);
        new Thing(kw, 4, 1);
        new Thing(kw, 4, 1);
        new Thing(kw, 4, 1);


        karel.move();
        //make counter
        int counter = 0;
        //get karel pick things to make graph
        for(int i = 0; i < 4; i = i + 1){
        while (karel.canPickThing() == true) {
            karel.pickAllThings();
            karel.putThing();
            karel.turnLeft();
            karel.move();
            counter++;
        }
        //get karel to move across and make graph
        while (karel.countThingsInBackpack() > 0) {
            karel.putThing();
            karel.move();
            counter++;
        }
        //gaet karel to go to the next row
        karel.turnAround();
        while (counter > 0) {
            karel.move();
            counter = counter - 1;
        }
        karel.turnLeft();
        karel.move();
        }
}
}
