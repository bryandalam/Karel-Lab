package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem1 extends Robot

{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem1(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }
    public void setPins(){
        move();
        placeAllPins();
    }
    public void placeAllPins() {
        firstRow();
        repositionLeft();
        secondRow();
        repositionRight();
        thirdRow();
        repositionLeft();
        fourthRow();
        move();
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void firstRow() {
        turnLeft();
        putBeeper();
    }
    public void repositionLeft() {
        move();
        turnRight();
        move();
        turnRight();
    }
    public void secondRow() {
        putBeeper();
        move();
        move();
        putBeeper();
    }
    public void repositionRight() {
        move();
        turnLeft();
        move();
        turnLeft();
    }
    public void thirdRow() {
        putBeeper();
        move();
        move();
        putBeeper();
        move();
        move();
        putBeeper();
    }
    public void fourthRow() {
        putBeeper();
        move();
        move();
        putBeeper();
        move();
        move();
        putBeeper();
        move();
        move();
        putBeeper();
    }
}
