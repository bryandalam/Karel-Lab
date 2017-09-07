package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;
/**
 * Write a description of class Problem3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Problem3 extends Robot
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Problem3
     */
    public Problem3(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setHello(){
       setH();
       turnLeft();
       moveTwo();
       turnLeft();
       setE();
       moveTwo();
       turnLeft();
       //setL();
       //setL();
       //setO();
    }
    public void setFiveRow(){
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void setH() {
        setFiveRow();
        turnAround();
        moveTwo();
        turnLeft();
        setThreeAcross();
        turnLeft();
        moveTwo();
        turnAround();
        setFiveRow();
    }
    public void turnAround() {
        turnLeft();
        turnLeft();
    }
    public void moveTwo() {
        move();
        move();
    }
    public void setThreeAcross() {
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
    }
    public void setE() {
        setFiveRow();
        turnRight();
        placeTwoRow();
        turnAround();
        moveTwo();
        turnLeft();
        moveTwo();
        turnLeft();
        placeTwoRow();
        turnAround();
        moveTwo();
        turnLeft();
        moveTwo();
        turnLeft();
        placeTwoRow();
    }
    public void placeTwoRow() {
        move();
        putBeeper();
        move();
        putBeeper();
    }
    }

