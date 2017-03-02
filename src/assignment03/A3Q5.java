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
        
        //craete counter
        int counter = 0;
        
        //loop
        while(counter < 10){
            karel.pickThing();
            karel.move();
            karel.putThing();
            karel.turnAround();
            karel.move();
            karel.turnAround();
            counter++;
        }
        karel.move();
    }
}
