package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem2 extends Problem1
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem2(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void setField(){
        setPins();
        repositionFirst();
        secondSetPins();
        repositionLast();
    }
    public void repositionFirst() {
        turnLeft();
        move();
        turnLeft();
        move();
        move();
    }
    public void secondSetPins() {
        thirdRow();
        repositionUpLeft();
        secondRow();
        repositionUpRight();
        firstRow();
    }
    public void repositionUpLeft() {
        turnRight();
        move();
        turnRight();
        move();
    }
    public void repositionUpRight() {
        turnLeft();
        move();
        turnLeft();
        move();
    
    }
    public void repositionLast(){
        turnLeft();
        turnLeft();
        move();
    }
    
}
